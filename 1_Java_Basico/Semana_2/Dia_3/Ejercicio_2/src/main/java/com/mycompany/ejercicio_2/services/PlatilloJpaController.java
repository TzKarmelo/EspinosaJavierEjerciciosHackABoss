package com.mycompany.ejercicio_2.services;

import com.mycompany.ejercicio_2.models.Platillos;
import com.mycompany.ejercicio_2.persistence.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class PlatilloJpaController implements Serializable {

    public PlatilloJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public PlatilloJpaController() {
        emf = Persistence.createEntityManagerFactory("miUnit");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Platillos platillo) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(platillo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Platillos platillo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            platillo = em.merge(platillo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = platillo.getId();
                if (findPlatillo(id) == null) {
                    throw new NonexistentEntityException("The platillo with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Platillos platillo;
            try {
                platillo = em.getReference(Platillos.class, id);
                platillo.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The platillo with id " + id + " no longer exists.", enfe);
            }
            em.remove(platillo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Platillos> findPlatilloEntities() {
        return findPlatilloEntities(true, -1, -1);
    }

    public List<Platillos> findPersonaEntities(int maxResults, int firstResult) {
        return findPlatilloEntities(false, maxResults, firstResult);
    }

    private List<Platillos> findPlatilloEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Platillos.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Platillos findPlatillo(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Platillos.class, id);
        } finally {
            em.close();
        }
    }

    public int getPlatilloCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Platillos> rt = cq.from(Platillos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
