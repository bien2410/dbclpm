CREATE DATABASE  IF NOT EXISTS `dbclpm2` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `dbclpm2`;
-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: dbclpm2
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tblsinhvien_monhoc`
--

DROP TABLE IF EXISTS `tblsinhvien_monhoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsinhvien_monhoc` (
  `id` int NOT NULL AUTO_INCREMENT,
  `idSinhVien` int NOT NULL,
  `idMonHoc` int NOT NULL,
  `idHocKy` int NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsinhvien_monhoc`
--

LOCK TABLES `tblsinhvien_monhoc` WRITE;
/*!40000 ALTER TABLE `tblsinhvien_monhoc` DISABLE KEYS */;
INSERT INTO `tblsinhvien_monhoc` VALUES (1,1,1,1),(2,1,2,1),(3,1,3,1),(4,1,4,1),(5,1,5,1),(6,1,6,2),(7,1,7,2),(8,1,8,2),(9,1,9,2),(10,1,10,2),(11,1,11,2),(12,1,12,2),(13,1,13,2),(14,1,14,3),(15,1,15,3),(16,1,16,3),(17,1,17,3),(18,1,18,3),(19,1,19,3),(20,1,20,3),(21,1,21,4),(22,1,22,4),(23,1,23,4),(24,1,24,4),(25,1,25,4),(26,1,26,4),(27,1,27,4),(28,1,28,5),(29,1,29,5),(30,1,30,5),(31,1,31,5),(32,1,32,5),(33,1,33,5),(34,1,34,5),(35,1,35,6),(36,1,36,6),(37,1,37,6),(38,1,38,6),(39,1,39,6),(40,1,40,6),(41,1,41,6);
/*!40000 ALTER TABLE `tblsinhvien_monhoc` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-01 22:38:29
