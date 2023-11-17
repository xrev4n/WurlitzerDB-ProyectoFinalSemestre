-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-11-2023 a las 00:34:31
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `wurlitzerdb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cancion`
--

CREATE TABLE `cancion` (
  `id_cancion` int(11) NOT NULL,
  `titulo` varchar(100) DEFAULT NULL,
  `autor` varchar(100) DEFAULT NULL,
  `disco` varchar(100) DEFAULT NULL,
  `anio` int(11) DEFAULT NULL,
  `minuto` int(11) DEFAULT NULL,
  `segundo` int(11) DEFAULT NULL,
  `estilo` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cancion`
--

INSERT INTO `cancion` (`id_cancion`, `titulo`, `autor`, `disco`, `anio`, `minuto`, `segundo`, `estilo`) VALUES
(2, 'Shape of You', 'Ed Sheeran', '÷', 2017, 3, 54, 'Pop'),
(3, 'Billie Jean', 'Michael Jackson', 'Thriller', 1982, 4, 54, 'Pop'),
(4, 'Hotel California', 'Eagles', 'Hotel California', 1976, 6, 30, 'Rock'),
(5, 'Anarchy in the U.K.', 'Sex Pistols', 'Never Mind the Bollocks, Here\'s the Sex Pistols', 1976, 3, 32, 'Punk'),
(6, 'Blitzkrieg Bop', 'Ramones', 'Ramones', 1976, 2, 12, 'Punk'),
(7, 'I Wanna Be Sedated', 'Ramones', 'Road to Ruin', 1978, 2, 29, 'Punk'),
(8, 'London Calling', 'The Clash', 'London Calling', 1979, 3, 19, 'Punk'),
(9, 'Bailando', 'Enrique Iglesias ft. Gente de Zona y Descemer Bueno', 'Sex and Love', 2014, 4, 2, 'Latina'),
(10, 'La Tortura', 'Shakira ft. Alejandro Sanz', 'Fijación Oral Vol. 1', 2005, 3, 32, 'Latina'),
(11, 'El Triste', 'José José', 'El Triste', 1970, 4, 42, 'Bolero'),
(12, 'Vivir Mi Vida', 'Marc Anthony', '3.0', 2013, 4, 12, 'Salsa');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reproduccion`
--

CREATE TABLE `reproduccion` (
  `id_reproduccion` int(11) NOT NULL,
  `id_cancion` int(11) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `escuela` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `reproduccion`
--

INSERT INTO `reproduccion` (`id_reproduccion`, `id_cancion`, `nombre`, `fecha`, `escuela`) VALUES
(1000, 1, 'Felipe', '2023-11-17', 'Douc'),
(1001, 5, 'dsfds', '2023-11-17', 'fdssd');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cancion`
--
ALTER TABLE `cancion`
  ADD PRIMARY KEY (`id_cancion`);

--
-- Indices de la tabla `reproduccion`
--
ALTER TABLE `reproduccion`
  ADD PRIMARY KEY (`id_reproduccion`),
  ADD KEY `id_cancion` (`id_cancion`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cancion`
--
ALTER TABLE `cancion`
  MODIFY `id_cancion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `reproduccion`
--
ALTER TABLE `reproduccion`
  MODIFY `id_reproduccion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1002;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
