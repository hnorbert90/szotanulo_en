-- phpMyAdmin SQL Dump
-- version 4.7.3
-- https://www.phpmyadmin.net/
--
-- Gép: localhost:3306
-- Létrehozás ideje: 2017. Sze 08. 19:18
-- Kiszolgáló verziója: 5.6.36-cll-lve
-- PHP verzió: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Adatbázis: `gamedevs_szotanulo_en`
--

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `userprogression`
--

CREATE TABLE `userprogression` (
  `username` varchar(32) NOT NULL,
  `learnedWordsInIrregularVerbs` varchar(500) NOT NULL,
  `learneadWordsInTheMostCommonWords` varchar(500) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- A tábla adatainak kiíratása `userprogression`
--

INSERT INTO `userprogression` (`username`, `learnedWordsInIrregularVerbs`, `learneadWordsInTheMostCommonWords`) VALUES
('Gyla2', '123;323;', '1235;3163;'),
('Gyla3', '123;323;', '1235;3163;');

--
-- Indexek a kiírt táblákhoz
--

--
-- A tábla indexei `userprogression`
--
ALTER TABLE `userprogression`
  ADD PRIMARY KEY (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
