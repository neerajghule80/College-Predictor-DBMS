-- MySQL dump 10.13  Distrib 5.5.60, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: dbmsproject
-- ------------------------------------------------------
-- Server version	5.5.60-0ubuntu0.14.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `branch_table`
--

DROP TABLE IF EXISTS `branch_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `branch_table` (
  `UG_prog` char(40) DEFAULT NULL,
  `PG_prog` char(40) DEFAULT NULL,
  `college_id` int(11) DEFAULT NULL,
  KEY `colidfk` (`college_id`),
  CONSTRAINT `colidfk` FOREIGN KEY (`college_id`) REFERENCES `college_table` (`college_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `branch_table`
--

LOCK TABLES `branch_table` WRITE;
/*!40000 ALTER TABLE `branch_table` DISABLE KEYS */;
INSERT INTO `branch_table` VALUES ('computer science','computer engineering',1),('mechanical engineering','design (mechanical engineering)',1),('civil engineering','structural engg(civil engineering)',1),('mechanical engineering','design (mechanical engineering)',2),('computer science','computer engineering',2),('civil engineering','structural engg(civil engineering)',2),('civil engineering','structural engg(civil engineering)',3),('computer science','computer engineering',3),('mechanical engineering','design (mechanical engineering)',3),('mechanical engineering','design (mechanical engineering)',4),('computer science','computer engineering',4),('civil engineering','structural engg(civil engineering)',4),('civil engineering','structural engg(civil engineering)',5),('computer science','computer engineering',5),('mechanical engineering','design (mechanical engineering)',5),('civil engineering','structural engg(civil engineering)',6),('mechanical engineering','design (mechanical engineering)',6),('computer science','computer engineering',6),('computer science','computer engineering',7),('mechanical engineering','design (mechanical engineering)',7),('civil engineering','structural engg(civil engineering)',7),('civil engineering','structural engg(civil engineering)',8),('mechanical engineering','design (mechanical engineering)',8),('computer science','computer engineering',8);
/*!40000 ALTER TABLE `branch_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category_table`
--

DROP TABLE IF EXISTS `category_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category_table` (
  `college_id` int(11) DEFAULT NULL,
  `branch` char(40) DEFAULT NULL,
  `category` char(10) NOT NULL,
  `category_seats` int(11) DEFAULT NULL,
  `cutoff_rank` int(11) DEFAULT NULL,
  KEY `colidct` (`college_id`),
  CONSTRAINT `colidct` FOREIGN KEY (`college_id`) REFERENCES `college_table` (`college_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category_table`
--

LOCK TABLES `category_table` WRITE;
/*!40000 ALTER TABLE `category_table` DISABLE KEYS */;
INSERT INTO `category_table` VALUES (1,'computer science','open',50,177),(1,'computer science','obc',20,80),(1,'computer science','sc',15,54),(1,'computer science','st',15,22),(2,'computer science','open',50,62),(2,'computer science','obc',20,45),(2,'computer science','sc',15,22),(2,'computer science','st',15,15),(3,'computer science','open',50,104),(3,'computer science','obc',20,67),(3,'computer science','sc',15,35),(3,'computer science','st',15,25),(4,'computer science','open',50,262),(4,'computer science','obc',20,127),(4,'computer science','sc',15,77),(4,'computer science','st',15,40),(5,'computer science','open',50,206),(5,'computer science','obc',20,116),(5,'computer science','sc',15,48),(1,'civil engineering','open',50,3632),(1,'civil engineering','obc',20,1203),(1,'civil engineering','sc',15,214),(1,'civil engineering','st',15,672),(2,'civil engineering','open',50,2308),(2,'civil engineering','obc',20,976),(2,'civil engineering','sc',15,511),(2,'civil engineering','st',15,117),(3,'civil engineering','open',50,2869),(3,'civil engineering','obc',20,980),(3,'civil engineering','sc',15,532),(3,'civil engineering','st',15,53),(4,'civil engineering','open',50,4071),(4,'civil engineering','obc',20,1346),(4,'civil engineering','sc',15,699),(4,'civil engineering','st',15,208),(5,'civil engineering','open',50,3533),(5,'civil engineering','obc',20,1246),(5,'civil engineering','sc',15,667),(5,'civil engineering','st',15,190),(1,'mechanical engineering','open',50,1222),(1,'mechanical engineering','obc',20,520),(1,'mechanical engineering','sc',15,271),(1,'mechanical engineering','st',15,149),(2,'mechanical engineering','open',50,738),(2,'mechanical engineering','obc',20,363),(2,'mechanical engineering','sc',15,163),(2,'mechanical engineering','st',15,104),(3,'mechanical engineering','open',50,944),(3,'mechanical engineering','obc',20,452),(3,'mechanical engineering','sc',15,188),(3,'mechanical engineering','st',15,60),(4,'mechanical engineering','open',50,1409),(4,'mechanical engineering','obc',20,623),(4,'mechanical engineering','sc',15,321),(4,'mechanical engineering','st',15,163),(1,'computer engineering','open',20,799),(1,'computer engineering','obc',10,746),(1,'computer engineering','sc',10,629),(1,'computer engineering','st',10,525),(1,'design(mechanical engineering)','open',20,835),(1,'design(mechanical engineering)','obc',10,803),(1,'design(mechanical engineering)','sc',10,558),(1,'design(mechanical engineering)','st',10,458),(1,'structural engg(civil engineering)','open',20,730),(1,'structural engg(civil engineering)','obc',10,650),(1,'structural engg(civil engineering)','sc',10,507),(1,'structural engg(civil engineering)','st',10,458),(2,'structural engg(civil engineering)','open',20,746),(2,'structural engg(civil engineering)','obc',10,776),(2,'structural engg(civil engineering)','sc',10,629),(2,'structural engg(civil engineering)','st',10,525),(2,'design(mechanical engineering)','open',20,856),(2,'design(mechanical engineering)','obc',10,875),(2,'design(mechanical engineering)','sc',10,597),(2,'design(mechanical engineering)','st',10,558),(2,'computer engineering','open',20,852),(2,'computer engineering','obc',10,746),(2,'computer engineering','sc',10,629),(2,'computer engineering','st',10,525),(3,'computer engineering','open',20,900),(3,'computer engineering','obc',10,856),(3,'computer engineering','sc',10,540),(3,'computer engineering','st',10,352),(3,'design(mechanical engineering)','open',20,725),(3,'design(mechanical engineering)','obc',10,650),(3,'design(mechanical engineering)','sc',10,500),(3,'design(mechanical engineering)','st',10,300),(3,'structural engg(civil engineering)','open',20,848),(3,'structural engg(civil engineering)','obc',10,785),(3,'structural engg(civil engineering)','sc',10,632),(3,'structural engg(civil engineering)','st',10,352),(4,'structural engg(civil engineering)','open',20,723),(4,'structural engg(civil engineering)','obc',10,651),(4,'structural engg(civil engineering)','sc',10,499),(4,'structural engg(civil engineering)','st',10,386),(4,'design(mechanical engineering)','open',20,804),(4,'design(mechanical engineering)','obc',10,761),(4,'design(mechanical engineering)','sc',10,602),(4,'design(mechanical engineering)','st',10,490),(4,'computer engineering','open',20,791),(4,'computer engineering','obc',10,681),(4,'computer engineering','sc',10,590),(4,'computer engineering','st',10,418),(5,'computer engineering','open',20,732),(5,'computer engineering','obc',10,665),(5,'computer engineering','sc',10,567),(5,'computer engineering','st',10,443),(5,'design(mechanical engineering)','open',20,822),(5,'design(mechanical engineering)','obc',10,769),(5,'design(mechanical engineering)','sc',10,562),(5,'design(mechanical engineering)','st',10,463),(5,'structural engg(civil engineering)','open',20,696),(5,'structural engg(civil engineering)','obc',10,644),(5,'structural engg(civil engineering)','sc',10,548),(5,'structural engg(civil engineering)','st',10,480);
/*!40000 ALTER TABLE `category_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `college_table`
--

DROP TABLE IF EXISTS `college_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `college_table` (
  `college_id` int(11) NOT NULL AUTO_INCREMENT,
  `college_name` char(40) DEFAULT NULL,
  `college_rank` int(11) DEFAULT NULL,
  `UG_seats` int(11) DEFAULT NULL,
  `PG_seats` int(11) DEFAULT NULL,
  PRIMARY KEY (`college_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `college_table`
--

LOCK TABLES `college_table` WRITE;
/*!40000 ALTER TABLE `college_table` DISABLE KEYS */;
INSERT INTO `college_table` VALUES (1,'IIT MADRAS',1,100,50),(2,'IIT MUMBAI',2,100,50),(3,'IIT DELHI',3,100,50),(4,'IIT KHARAGPUR',4,100,50),(5,'IIT KANPUR',5,100,50),(6,'IIT ROORKEE',6,100,50),(7,'IIT GUWAHATI',7,100,50),(8,'IIT HYDERABAD',8,100,50);
/*!40000 ALTER TABLE `college_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_table`
--

DROP TABLE IF EXISTS `student_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_table` (
  `entry_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` char(30) DEFAULT NULL,
  `exam` char(20) DEFAULT NULL,
  `category` char(20) DEFAULT NULL,
  `category_rank` int(11) DEFAULT NULL,
  `name_id` char(30) NOT NULL,
  `password` char(30) DEFAULT NULL,
  `email_id` char(30) DEFAULT NULL,
  `ph_number` char(10) DEFAULT NULL,
  PRIMARY KEY (`entry_id`,`name_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_table`
--

LOCK TABLES `student_table` WRITE;
/*!40000 ALTER TABLE `student_table` DISABLE KEYS */;
INSERT INTO `student_table` VALUES (1,'abhilash','gate','obc',798,'bhuibux','abhilash','abhilash@gmail','9011389785'),(2,'aabhas fulzele','gate','sc',700,'abhas123','abhas','aabhas@gmail','8381010425'),(3,'ashish ranjan','gate','open',822,'ranjan123','ranjan','ashranjan@gmail','7798128137'),(4,'neeraj ghule','gate','open',752,'neeraj123','neeraj','neeraj@gmail','7972425072'),(5,'aashish bhongade','gate','obc',840,'ashishcsb','ashish','ashishcsb98@gmail','7038037531');
/*!40000 ALTER TABLE `student_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-12  1:37:19
