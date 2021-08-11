-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-08-2021 a las 01:33:19
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
-- Estructura de tabla para la tabla `encabezado_factura`
--

CREATE TABLE `encabezado_factura` (
  `numero_factura` bigint(20) NOT NULL,
  `direccion_factura` varchar(255) DEFAULT NULL,
  `fecha_factura` datetime DEFAULT NULL,
  `fecha_final_factura` datetime DEFAULT NULL,
  `fecha_inicial_factura` datetime DEFAULT NULL,
  `telefono_factura` varchar(255) DEFAULT NULL,
  `tipo_factura` varchar(255) DEFAULT NULL,
  `total_factura` double DEFAULT NULL,
  `codigo_ciudad_factura` int(11) DEFAULT NULL,
  `codigo_cliente` int(11) DEFAULT NULL,
  `codigo_departamento_factura` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `encabezado_factura`
--

INSERT INTO `encabezado_factura` (`numero_factura`, `direccion_factura`, `fecha_factura`, `fecha_final_factura`, `fecha_inicial_factura`, `telefono_factura`, `tipo_factura`, `total_factura`, `codigo_ciudad_factura`, `codigo_cliente`, `codigo_departamento_factura`) VALUES
(1024566, 'kr 77a #69a - 63', '2021-01-01 00:30:33', '2021-01-01 00:30:33', '2021-01-01 00:30:33', '3003526750', 'No Operacional', 500000, 1, 1, 1),
(1024567, 'kr 111 #22h-21', '2021-08-10 22:28:29', '2021-08-10 22:28:29', '2021-01-10 22:28:29', '3003526750', 'Operacional', 23890555, 1, 1, 1),
(1024568, 'mz 76 l17 plan 500b', '2022-08-10 22:28:29', '2022-08-10 22:28:29', '2022-08-07 22:28:29', '6900544', 'Operacional', 50000, 2, 2, 2),
(1024570, 'factura de pruebva 4', '2020-12-11 00:30:33', '2021-12-11 00:30:33', '2021-12-11 00:30:33', '6900544', 'Venta Directa', 200000, 2, 1, 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `encabezado_factura`
--
ALTER TABLE `encabezado_factura`
  ADD PRIMARY KEY (`numero_factura`),
  ADD KEY `FKgptg2nr1xl5xnykbbf2xobx17` (`codigo_ciudad_factura`),
  ADD KEY `FK55j6wfw4vrji5w4eb69inqhhn` (`codigo_cliente`),
  ADD KEY `FKpes0axidfjft9ls6p3alhrjv5` (`codigo_departamento_factura`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `encabezado_factura`
--
ALTER TABLE `encabezado_factura`
  MODIFY `numero_factura` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1024572;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `encabezado_factura`
--
ALTER TABLE `encabezado_factura`
  ADD CONSTRAINT `FK55j6wfw4vrji5w4eb69inqhhn` FOREIGN KEY (`codigo_cliente`) REFERENCES `clientes` (`codigo_cliente`),
  ADD CONSTRAINT `FKgptg2nr1xl5xnykbbf2xobx17` FOREIGN KEY (`codigo_ciudad_factura`) REFERENCES `ciudad` (`codigo_ciudad`),
  ADD CONSTRAINT `FKpes0axidfjft9ls6p3alhrjv5` FOREIGN KEY (`codigo_departamento_factura`) REFERENCES `departamento` (`codigo_departamento`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
