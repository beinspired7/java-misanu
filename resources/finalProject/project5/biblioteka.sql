DROP TABLE IF EXISTS `biblioteka`;

CREATE TABLE `biblioteka` (
  `id` int NOT NULL,
  `name` varchar(255) NOT NULL,
  `adressa` varchar(255) NOT NULL,
  `mesto` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


DROP TABLE IF EXISTS `bibliotekar`;
CREATE TABLE `bibliotekar` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ime` varchar(255) NOT NULL,
  `prezime` varchar(255) DEFAULT NULL,
  `sifra_zaposlenog` varchar(20) DEFAULT NULL,
  `jmbg` int DEFAULT NULL,
  `telefon` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


DROP TABLE IF EXISTS `clanovi`;
CREATE TABLE `clanovi` (
  `id` int NOT NULL,
  `ime` varchar(255) NOT NULL,
  `prezime` varchar(255) NOT NULL,
  `datum_rodjenja` varchar(255) NOT NULL,
  `telefon` int NOT NULL,
  `broj_clanske_karte` int NOT NULL,
  `adresa_prebivalista` varchar(255) NOT NULL,
  `id_clanovi` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `clanovi_biblioteka_id_fk` (`id_clanovi`),
  CONSTRAINT `clanovi_biblioteka_id_fk` FOREIGN KEY (`id_clanovi`) REFERENCES `biblioteka` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

DROP TABLE IF EXISTS `knjige`;
CREATE TABLE `knjige` (
  `id` int NOT NULL AUTO_INCREMENT,
  `isbn_broj` int NOT NULL,
  `naziv` varchar(255) NOT NULL,
  `jezik` varchar(255) NOT NULL,
  `izdavac` varchar(255) NOT NULL,
  `id_biblioteka` int DEFAULT NULL,
  `odeljenje` enum('decije','naucno','pozajmno') NOT NULL,
  `decije_uzrast` enum('0+','3+','5+','10+') DEFAULT NULL,
  `pozajmno_zanr` varchar(255) DEFAULT NULL,
  `naucno_oblast` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `knjige_biblioteka_id_fk` (`id_biblioteka`),
  CONSTRAINT `knjige_biblioteka_id_fk` FOREIGN KEY (`id_biblioteka`) REFERENCES `biblioteka` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

DROP TABLE IF EXISTS `pisac`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pisac` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ime_prezime_pisca` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

DROP TABLE IF EXISTS `pisac_knjige`;
CREATE TABLE `pisac_knjige` (
  `id_knjige` int DEFAULT NULL,
  `id_pisac` int DEFAULT NULL,
  KEY `pisac_knjige_knjige_id_fk` (`id_knjige`),
  KEY `pisac_knjige_pisac_id_fk` (`id_pisac`),
  CONSTRAINT `pisac_knjige_knjige_id_fk` FOREIGN KEY (`id_knjige`) REFERENCES `knjige` (`id`),
  CONSTRAINT `pisac_knjige_pisac_id_fk` FOREIGN KEY (`id_pisac`) REFERENCES `pisac` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
