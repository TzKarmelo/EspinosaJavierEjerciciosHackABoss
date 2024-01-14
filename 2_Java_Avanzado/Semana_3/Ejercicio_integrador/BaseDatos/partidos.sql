-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 14-01-2024 a las 21:00:44
-- Versión del servidor: 8.2.0
-- Versión de PHP: 8.2.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `partidos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo`
--

DROP TABLE IF EXISTS `equipo`;
CREATE TABLE IF NOT EXISTS `equipo` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `NOMBRE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `equipo`
--

INSERT INTO `equipo` (`ID`, `NOMBRE`) VALUES
(1, 'Barcelona'),
(2, 'Madrid'),
(3, 'EspaÃ±ol'),
(4, 'Sevilla Fc'),
(5, 'Betis');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `partido`
--

DROP TABLE IF EXISTS `partido`;
CREATE TABLE IF NOT EXISTS `partido` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `FECHA` date DEFAULT NULL,
  `PUNTUACIONLOCAL` int DEFAULT NULL,
  `PUNTUACIONVISITANTE` int DEFAULT NULL,
  `local_id` int DEFAULT NULL,
  `visitante_id` int DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_PARTIDO_visitante_id` (`visitante_id`),
  KEY `FK_PARTIDO_local_id` (`local_id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `partido`
--

INSERT INTO `partido` (`ID`, `FECHA`, `PUNTUACIONLOCAL`, `PUNTUACIONVISITANTE`, `local_id`, `visitante_id`) VALUES
(1, '2024-01-18', 5, 1, 1, 2),
(2, '2024-01-28', 7, 0, 1, 3),
(3, '2024-02-04', 1, 3, 4, 1),
(4, '2024-02-04', 1, 2, 4, 5),
(5, '2024-03-03', 4, 1, 1, 5);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
