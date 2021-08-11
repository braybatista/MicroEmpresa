-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-08-2021 a las 22:17:27
-- Versión del servidor: 10.4.20-MariaDB
-- Versión de PHP: 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `microempresa`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `codigo_cliente` int(11) NOT NULL,
  `direccion_cliente` varchar(20) NOT NULL,
  `foto_cliente` text NOT NULL,
  `nombre_cliente` varchar(75) NOT NULL,
  `numero_identificacion_cliente` varchar(15) NOT NULL,
  `telefono_cliente` varchar(255) DEFAULT NULL,
  `tipo_identificacion_cliente` varchar(255) DEFAULT NULL,
  `codigo_ciudad_reside_cliente` int(11) DEFAULT NULL,
  `codigo_departamento_reside_cliente` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`codigo_cliente`, `direccion_cliente`, `foto_cliente`, `nombre_cliente`, `numero_identificacion_cliente`, `telefono_cliente`, `tipo_identificacion_cliente`, `codigo_ciudad_reside_cliente`, `codigo_departamento_reside_cliente`) VALUES
(1, 'kr 111 # 22H - 21', '', 'brayan batista zuñiga', '1143374881', '+573003526750', 'CC', 1, 1),
(2, 'kr 111 # 22H - 21', '', 'Alberto Carlos Barboza', '123456789', '6900544', 'CC', 2, 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`codigo_cliente`),
  ADD KEY `FKonic42qw2v3sgyqtnu7glb177` (`codigo_ciudad_reside_cliente`),
  ADD KEY `FKmid0c6r29cf9cym28bu4yw3ix` (`codigo_departamento_reside_cliente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `codigo_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD CONSTRAINT `FKmid0c6r29cf9cym28bu4yw3ix` FOREIGN KEY (`codigo_departamento_reside_cliente`) REFERENCES `departamento` (`codigo_departamento`),
  ADD CONSTRAINT `FKonic42qw2v3sgyqtnu7glb177` FOREIGN KEY (`codigo_ciudad_reside_cliente`) REFERENCES `ciudad` (`codigo_ciudad`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
