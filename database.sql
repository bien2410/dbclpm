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
-- Table structure for table `tbldiem`
--

DROP TABLE IF EXISTS `tbldiem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbldiem` (
  `id` int NOT NULL AUTO_INCREMENT,
  `idSinhVien_MonHoc` int NOT NULL,
  `idDiemThanhPhan` int NOT NULL,
  `soDiem` float NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=176 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbldiem`
--

LOCK TABLES `tbldiem` WRITE;
/*!40000 ALTER TABLE `tbldiem` DISABLE KEYS */;
INSERT INTO `tbldiem` VALUES (1,1,3,10),(2,1,10,6),(3,1,14,7),(4,2,2,9),(5,2,9,8),(6,2,16,8),(7,3,2,10),(8,3,4,9.5),(9,3,7,8.5),(10,3,16,0),(11,4,2,8),(12,4,4,8),(13,4,7,7),(14,4,16,7),(15,5,2,9),(16,5,4,8),(17,5,7,9),(18,5,16,8),(19,6,3,10),(20,6,10,7),(21,6,14,8),(22,7,2,9.5),(23,7,9,6.5),(24,7,16,8),(25,8,1,10),(26,8,6,8.7),(27,8,7,9),(28,8,11,9.1),(29,8,14,7.6),(30,9,2,10),(31,9,4,7),(32,9,7,7),(33,9,16,8),(34,10,2,10),(35,10,7,9),(36,10,12,8.5),(37,10,15,8),(38,11,2,10),(39,11,4,10),(40,11,7,10),(41,11,16,8.5),(42,12,2,9),(43,12,7,6),(44,12,11,8),(45,12,16,7.5),(46,13,2,10),(47,13,7,8),(48,13,11,7),(49,13,16,8),(50,14,2,7),(51,14,9,8.5),(52,14,16,7.5),(53,15,1,10),(54,15,6,8.3),(55,15,7,9),(56,15,11,9.1),(57,15,14,8.2),(58,16,2,10),(59,16,7,9),(60,16,12,8.5),(61,16,15,8.5),(62,17,2,10),(63,17,5,5),(64,17,9,5),(65,17,14,7.5),(66,18,2,6),(67,18,9,6),(68,18,12,6),(69,18,14,6),(70,19,2,10),(71,19,4,10),(72,19,7,8.5),(73,19,16,8.5),(74,20,2,9),(75,20,9,8.5),(76,20,11,8.5),(77,20,15,7.5),(78,21,2,10),(79,21,9,8.5),(80,21,16,4),(81,22,1,10),(82,22,6,7.8),(83,22,7,8.5),(84,22,11,9.3),(85,22,14,5.5),(86,23,2,9),(87,23,9,8.5),(88,23,16,9.5),(89,24,2,9),(90,24,9,9),(91,24,11,7),(92,24,15,8),(93,25,2,10),(94,25,5,8.5),(95,25,7,6),(96,25,15,7.5),(97,26,2,10),(98,26,4,10),(99,26,7,10),(100,26,16,8.5),(101,27,2,9),(102,27,9,8),(103,27,11,8),(104,27,15,7.5),(105,28,2,9),(106,28,9,10),(107,28,16,9),(108,29,1,9),(109,29,8,9),(110,29,13,9),(111,29,14,7.5),(112,30,2,8),(113,30,5,6),(114,30,7,6),(115,30,15,7),(116,31,2,10),(117,31,5,7.5),(118,31,7,10),(119,31,15,9),(120,32,2,10),(121,32,7,8),(122,32,11,8.5),(123,32,16,8.5),(124,33,2,7),(125,33,9,9),(126,33,12,9.5),(127,33,14,9),(128,34,2,10),(129,34,4,6),(130,34,9,7),(131,34,15,8.5),(132,35,2,10),(133,35,5,8),(134,35,7,8),(135,35,15,7.2),(136,36,2,10),(137,36,9,5),(138,36,12,5.5),(139,36,14,8.5),(140,37,2,10),(141,37,5,10),(142,37,9,9),(143,37,14,7),(144,38,2,10),(145,38,4,10),(146,38,7,9),(147,38,16,9.5),(148,39,2,9),(149,39,5,9.5),(150,39,7,10),(151,39,15,10),(152,40,2,10),(153,40,9,7),(154,40,12,8),(155,40,14,6),(156,41,2,10),(157,41,5,5),(158,41,9,3),(159,41,14,3),(160,42,2,10),(161,42,4,9.5),(162,42,7,8.5),(163,42,16,6),(164,43,2,5),(165,43,4,5),(166,43,7,5),(167,43,16,5),(168,44,2,10),(169,44,4,10),(170,44,7,10),(171,44,16,10),(172,45,2,5),(173,45,7,6),(174,45,12,7),(175,45,15,8);
/*!40000 ALTER TABLE `tbldiem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbldiemthanhphan`
--

DROP TABLE IF EXISTS `tbldiemthanhphan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbldiemthanhphan` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten` varchar(45) NOT NULL,
  `trongSo` int NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbldiemthanhphan`
--

LOCK TABLES `tbldiemthanhphan` WRITE;
/*!40000 ALTER TABLE `tbldiemthanhphan` DISABLE KEYS */;
INSERT INTO `tbldiemthanhphan` VALUES (1,'Chuyen can',5),(2,'Chuyen can',10),(3,'Chuyen can',20),(4,'Bai tap',10),(5,'Bai tap',20),(6,'Bai tap',25),(7,'Kiem tra',10),(8,'Kiem tra',15),(9,'Kiem tra',20),(10,'Kiem tra',30),(11,'Thuc hanh',10),(12,'Thuc hanh',20),(13,'Thuc hanh',30),(14,'Diem thi',50),(15,'Diem thi',60),(16,'Diem thi',70);
/*!40000 ALTER TABLE `tbldiemthanhphan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblhocky`
--

DROP TABLE IF EXISTS `tblhocky`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblhocky` (
  `id` int NOT NULL AUTO_INCREMENT,
  `tenHocKy` varchar(45) NOT NULL,
  `tenNamHoc` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblhocky`
--

LOCK TABLES `tblhocky` WRITE;
/*!40000 ALTER TABLE `tblhocky` DISABLE KEYS */;
INSERT INTO `tblhocky` VALUES (1,'1','2020-2021'),(2,'2','2020-2021'),(3,'1','2021-2022'),(4,'2','2021-2022'),(5,'1','2022-2023'),(6,'2','2022-2023'),(7,'1','2023-2024'),(8,'2','2023-2024');
/*!40000 ALTER TABLE `tblhocky` ENABLE KEYS */;
UNLOCK TABLES;

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

--
-- Table structure for table `tblmonhoc_diemthanhphan`
--

DROP TABLE IF EXISTS `tblmonhoc_diemthanhphan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblmonhoc_diemthanhphan` (
  `id` int NOT NULL AUTO_INCREMENT,
  `idMonHoc` int NOT NULL,
  `idDiemThanhPhan` int NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=160 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblmonhoc_diemthanhphan`
--

LOCK TABLES `tblmonhoc_diemthanhphan` WRITE;
/*!40000 ALTER TABLE `tblmonhoc_diemthanhphan` DISABLE KEYS */;
INSERT INTO `tblmonhoc_diemthanhphan` VALUES (1,1,3),(2,1,10),(3,1,14),(4,2,2),(5,2,9),(6,2,16),(7,3,2),(8,3,4),(9,3,7),(10,3,16),(11,4,2),(12,4,4),(13,4,7),(14,4,16),(15,5,2),(16,5,4),(17,5,7),(18,5,16),(19,6,3),(20,6,10),(21,6,14),(22,7,2),(23,7,9),(24,7,16),(25,8,1),(26,8,6),(27,8,7),(28,8,11),(29,8,14),(30,9,2),(31,9,4),(32,9,7),(33,9,16),(34,10,2),(35,10,7),(36,10,12),(37,10,15),(38,11,2),(39,11,4),(40,11,7),(41,11,16),(42,12,2),(43,12,7),(44,12,11),(45,12,16),(46,13,2),(47,13,7),(48,13,11),(49,13,16),(50,14,2),(51,14,9),(52,14,16),(53,15,1),(54,15,6),(55,15,7),(56,15,11),(57,15,14),(58,16,2),(59,16,7),(60,16,12),(61,16,15),(62,17,2),(63,17,5),(64,17,9),(65,17,14),(66,18,2),(67,18,9),(68,18,12),(69,18,14),(70,19,2),(71,19,4),(72,19,7),(73,19,16),(74,20,2),(75,20,9),(76,20,11),(77,20,15),(78,21,2),(79,21,9),(80,21,16),(81,22,1),(82,22,6),(83,22,7),(84,22,11),(85,22,14),(86,23,2),(87,23,9),(88,23,16),(89,24,2),(90,24,9),(91,24,11),(92,24,15),(93,25,2),(94,25,5),(95,25,7),(96,25,15),(97,26,2),(98,26,4),(99,26,7),(100,26,16),(101,27,2),(102,27,9),(103,27,11),(104,27,15),(105,28,2),(106,28,9),(107,28,16),(108,29,1),(109,29,8),(110,29,13),(111,29,14),(112,30,2),(113,30,5),(114,30,7),(115,30,15),(116,31,2),(117,31,5),(118,31,7),(119,31,15),(120,32,2),(121,32,7),(122,32,11),(123,32,16),(124,33,2),(125,33,9),(126,33,12),(127,33,14),(128,34,2),(129,34,4),(130,34,9),(131,34,15),(132,35,2),(133,35,5),(134,35,7),(135,35,15),(136,36,2),(137,36,9),(138,36,12),(139,36,14),(140,37,2),(141,37,5),(142,37,9),(143,37,14),(144,38,2),(145,38,4),(146,38,7),(147,38,16),(148,39,2),(149,39,5),(150,39,7),(151,39,15),(152,40,2),(153,40,9),(154,40,12),(155,40,14),(156,41,2),(157,41,5),(158,41,9),(159,41,14);
/*!40000 ALTER TABLE `tblmonhoc_diemthanhphan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblsinhvien`
--

DROP TABLE IF EXISTS `tblsinhvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tblsinhvien` (
  `id` int NOT NULL AUTO_INCREMENT,
  `taiKhoan` varchar(45) NOT NULL,
  `matKhau` varchar(45) NOT NULL,
  `hoTen` varchar(255) NOT NULL,
  `maSinhVien` varchar(45) NOT NULL,
  `ngaySinh` date NOT NULL,
  `email` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `taiKhoan_UNIQUE` (`taiKhoan`),
  UNIQUE KEY `maSinhVien_UNIQUE` (`maSinhVien`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsinhvien`
--

LOCK TABLES `tblsinhvien` WRITE;
/*!40000 ALTER TABLE `tblsinhvien` DISABLE KEYS */;
INSERT INTO `tblsinhvien` VALUES (1,'bien','bien','Pham Trong Bien','B20DCCN091','2002-10-24','ptbien264@gmail.com'),(2,'giao','giao','Nguyen Duc Giao','B20DCCN209','2002-09-20','ndg209@gmail.com'),(3,'cuong','cuong','Nguyen Van Cuong','B20DCCN103','2002-03-10','nvc103@gmail.com');
/*!40000 ALTER TABLE `tblsinhvien` ENABLE KEYS */;
UNLOCK TABLES;

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
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblsinhvien_monhoc`
--

LOCK TABLES `tblsinhvien_monhoc` WRITE;
/*!40000 ALTER TABLE `tblsinhvien_monhoc` DISABLE KEYS */;
INSERT INTO `tblsinhvien_monhoc` VALUES (1,1,1,1),(2,1,2,1),(3,1,3,1),(4,1,4,1),(5,1,5,1),(6,1,6,2),(7,1,7,2),(8,1,8,2),(9,1,9,2),(10,1,10,2),(11,1,11,2),(12,1,12,2),(13,1,13,2),(14,1,14,3),(15,1,15,3),(16,1,16,3),(17,1,17,3),(18,1,18,3),(19,1,19,3),(20,1,20,3),(21,1,21,4),(22,1,22,4),(23,1,23,4),(24,1,24,4),(25,1,25,4),(26,1,26,4),(27,1,27,4),(28,1,28,5),(29,1,29,5),(30,1,30,5),(31,1,31,5),(32,1,32,5),(33,1,33,5),(34,1,34,5),(35,1,35,6),(36,1,36,6),(37,1,37,6),(38,1,38,6),(39,1,39,6),(40,1,40,6),(41,1,41,6),(42,1,3,2),(43,1,4,2),(44,1,4,3),(45,2,10,2);
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

-- Dump completed on 2024-05-22 10:02:37
