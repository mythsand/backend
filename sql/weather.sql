# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.17)
# Database: winter
# Generation Time: 2017-04-14 03:12:35 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table weather
# ------------------------------------------------------------

DROP TABLE IF EXISTS `weather`;

CREATE TABLE `weather` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `city` varchar(255) DEFAULT NULL,
  `time` timestamp NULL DEFAULT NULL,
  `weather` varchar(18) DEFAULT NULL COMMENT '天气概况',
  `temperature` float(18,0) DEFAULT NULL COMMENT '温度',
  `humidity` varchar(18) DEFAULT NULL COMMENT '湿度',
  `visibility` float(18,0) DEFAULT NULL COMMENT '能见度',
  `wind_scale` varchar(18) DEFAULT NULL COMMENT '风力（等级）',
  `wind_dir_degree` float(18,0) DEFAULT NULL COMMENT '风向角度',
  `precipitation` float(18,0) DEFAULT NULL COMMENT '云量',
  `wind_speed` float(18,0) DEFAULT NULL COMMENT '风速',
  `wind_dir` varchar(18) DEFAULT NULL COMMENT '风向。单位是度。正北方向为0度，顺时针增加到360度。',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `city` (`city`),
  CONSTRAINT `wea_fk` FOREIGN KEY (`city`) REFERENCES `city` (`pinyin`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
