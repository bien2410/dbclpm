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
-- Table structure for table `tblmonhoc`
--

DROP TABLE IF EXISTS `tblmonhoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblmonhoc` (
  `id` int NOT NULL AUTO_INCREMENT,
  `maMonHoc` varchar(45) NOT NULL,
  `tenMonHoc` varchar(255) NOT NULL,
  `soTinChi` int NOT NULL,
  `tinhGPA` int NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `maMocHoc_UNIQUE` (`maMonHoc`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblmonhoc`
--

LOCK TABLES `tblmonhoc` WRITE;
/*!40000 ALTER TABLE `tblmonhoc` DISABLE KEYS */;
INSERT INTO `tblmonhoc` VALUES (1,'BAS1106','Giao duc the chat 1',2,0),(2,'BAS1150','Triet hoc Mac - Lenin',3,1),(3,'BAS1201','Dai so',3,1),(4,'BAS1203','Giai tich 1',3,1),(5,'INT1154','Tin hoc co so 1',2,1),(6,'BAS1107','Giao duc the chat 2',2,0),(7,'BAS1151','Kinh te chinh tri Mac - Lenin',2,1),(8,'BAS1157','Tieng Anh (Course 1)',4,1),(9,'BAS1204','Giai tich 2',3,1),(10,'BAS1224','Vat ly 1 va thi nghiem',4,1),(11,'BAS1226','Xac suat thong ke',2,1),(12,'ELE1433','Ky thuat so',2,1),(13,'INT1155','Tin hoc co so 2',2,1),(14,'BAS1152','Chu nghia xa hoi khoa hoc',2,1),(15,'BAS1158','Tieng Anh (Course 2)',4,1),(16,'BAS1227','Vat ly 3 va thi nghiem',4,1),(17,'ELE1330','Xu ly tin hieu so',2,1),(18,'INT1339','Ngon ngu lap trinh C++',3,1),(19,'INT1358','Toan roi rac 1',3,1),(20,'SKD1102','Ky nang lam viec nhom',1,0),(21,'BAS1122','Tu tuong Ho Chi Minh',2,1),(22,'BAS1159','Tieng Anh(Course 3)',4,1),(23,'ELE1319','Ly thuyet thong tin',3,1),(24,'INT1306','Cau truc du lieu va giai thuat',3,1),(25,'INT13145','Kien truc may tinh',3,1),(26,'INT1359','Toan roi rac 2',3,1),(27,'SKD1103','Ky nang tao lap van ban',1,0),(28,'BAS1153','Lich su Dang cong san Viet Nam',2,1),(29,'BAS1160','Tieng Anh (Course 3 Plus)',2,1),(30,'INT1313','Co so du lieu',3,1),(31,'INT13162','Lap trinh voi Python',3,1),(32,'INT1319','He dieu hanh',3,1),(33,'INT1332','Lap trinh huong doi tuong',3,1),(34,'INT1336','Mang may tinh',3,1),(35,'INT1303','An toan va bao mat he thong thong tin',3,1),(36,'INT13147','Thuc tap co so',3,1),(37,'INT1340','Nhap mon cong nghe phan mem',3,1),(38,'INT1341','Nhap mon tri tue nhan tao',3,1),(39,'INT14148','Co so du lieu phan tan',3,1),(40,'INT1434','Lap trinh Web',3,1),(41,'SKD1101','Ky nang thuyet trinh',1,0);
/*!40000 ALTER TABLE `tblmonhoc` ENABLE KEYS */;
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
