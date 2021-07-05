CREATE DATABASE  IF NOT EXISTS `marvelapi` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `marvelapi`;
-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: marvelapi
-- ------------------------------------------------------
-- Server version	8.0.25

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
-- Dumping data for table `series`
--

LOCK TABLES `series` WRITE;
/*!40000 ALTER TABLE `series` DISABLE KEYS */;
INSERT INTO `series` VALUES (1,'15276',NULL,2011,'2011-05-20T16:25:29-0400','',NULL,2011,'5 Ronin (2011)',''),(2,'12429',NULL,2010,'2017-08-11T18:08:31-0400','T+',NULL,2010,'5 Ronin (2010)','limited'),(3,'16450','Get ready for action-packed stories featuring team-ups from your favorite Marvel heroes every month! First, a story where Wolverine and Hulk come together, and then Captain America and Cable meet up! But will each partner\'s combined strength be enough?',2014,'2019-09-05T14:32:24-0400','',NULL,2012,'A+X (2012 - 2014)',''),(4,'27632',NULL,2019,'2019-09-24T19:08:13-0400','',NULL,2019,'Absolute Carnage: Immortal Hulk (2019)','one shot'),(5,'458',NULL,2003,'2015-04-27T16:05:24-0400','Marvel Psr',NULL,2003,'Actor Presents Spider-Man and the Incredible Hulk (2003)','one shot'),(6,'13896',NULL,2011,'2019-10-01T13:19:17-0400','',NULL,2011,'Age of X: Universe (2011)',''),(7,'7231',NULL,2009,'2010-12-14T14:43:51-0500','Rated T',NULL,2009,'All-New Savage She-Hulk (2009)',''),(8,'2116',NULL,1994,'2016-08-30T11:17:58-0400','',NULL,1983,'Alpha Flight (1983 - 1994)','ongoing'),(9,'454','Looking for the one superhero comic you just have to read? You\'ve found it! <i>Amazing Spider-Man</i> is the cornerstone of the Marvel Universe. This is where you\'ll find all the big-time action, major storylines and iconic Spider-Man magic you\'d come to expect from the Wall-Crawler.',2013,'2015-09-15T11:43:06-0400','T+',NULL,1999,'Amazing Spider-Man (1999 - 2013)','ongoing'),(10,'13205',NULL,2011,'2014-06-12T11:13:56-0400','',NULL,2011,'Amazing Spider-Man Annual (2011)',''),(11,'2984',NULL,2018,'2018-02-17T08:05:01-0500','',NULL,1964,'Amazing Spider-Man Annual (1964 - 2018)',''),(12,'24323',NULL,2018,'2018-05-31T11:53:16-0400','',NULL,2018,'Ant-Man and the Wasp Adventures (2018)','collection'),(13,'1991','Avengers Assemble! Iron Man, Thor, Captain America and the rest of Earth\'s Mightiest Heroes unite to stand against the threats none can face alone! See the Avengers go up against Ultron, Kang, the Masters of Evil and more over three decades of epic action!',1996,'2016-09-29T18:00:49-0400','',NULL,1963,'Avengers (1963 - 1996)','ongoing'),(14,'9085','At the dawn of the Heroic Age, the Avengers will assemble once again! The Avengers team like you\'ve never seen them before! New roster! New threats! Everyone\'s favorite super team presented in true blockbuster fashion!',2012,'2013-02-20T14:41:10-0500','T+',NULL,2010,'Avengers (2010 - 2012)','ongoing'),(15,'354','The Avengers return! Earth\'s Mightiest Heroes reunite with their biggest guns at the forefront to take on familiar enemies and new threats alike! Featuring the work of Kurt Busiek, George Perez and other quintessential Avengers creators!',2004,'2013-03-01T13:18:46-0500','T+',NULL,1998,'Avengers (1998 - 2004)','ongoing'),(16,'3621',NULL,1997,'2013-03-01T13:18:21-0500','',NULL,1996,'Avengers (1996 - 1997)','ongoing'),(17,'22547',NULL,2018,'2018-04-25T15:46:23-0400','Rated T+',NULL,2016,'Avengers (2016 - 2018)','ongoing'),(18,'9859',NULL,2010,'-0001-11-30T00:00:00-0500','',NULL,2010,'Avengers & the Infinity Gauntlet (2010)',''),(19,'24044',NULL,2018,'2018-03-01T17:48:00-0500','',NULL,2018,'Avengers & The Infinity Gauntlet (2018)','collection'),(20,'1988',NULL,1994,'2018-05-25T09:32:50-0400','',NULL,1967,'Avengers Annual (1967 - 1994)',''),(21,'3620',NULL,1999,'2018-02-15T12:59:41-0500','A',NULL,1998,'A-Next (1998 - 1999)','ongoing'),(22,'24227',NULL,1992,'2018-02-15T15:29:07-0500','',NULL,1991,'Adventures of Captain America (1991 - 1992)','limited'),(23,'15331',NULL,2013,'2014-06-11T16:50:41-0400','',NULL,2011,'Age of Apocalypse (2011 - 2013)',''),(24,'9790',NULL,2010,'2011-10-05T11:10:23-0400','',NULL,2010,'Age of Heroes (2010)',''),(25,'10235',NULL,2011,'2011-03-11T11:31:20-0500','',NULL,2011,'AGE OF HEROES TPB (2011)',''),(26,'7534',NULL,2009,'2018-02-15T12:42:55-0500','',NULL,2009,'All Winners Comics 70th Anniversary Special (2009)',''),(27,'20682',NULL,2018,'2018-08-15T12:09:14-0400','',NULL,2015,'All-New Wolverine (2015 - 2018)',''),(28,'2114',NULL,1947,'2018-02-15T12:44:46-0500','',NULL,1941,'All-Winners Comics (1941 - 1947)',''),(29,'9865',NULL,2011,'2015-03-19T15:25:35-0400','',NULL,2011,'All-Winners Squad: Band of Heroes (2011)',''),(30,'15540',NULL,2012,'2014-06-12T11:12:38-0400','',NULL,2012,'Amazing Spider-Man Annual (2012)',''),(31,'9802',NULL,2010,'2011-10-11T11:13:26-0400','',NULL,2010,'Amazing Spider-Man Annual (2010)',''),(32,'1489',NULL,2005,'-0001-11-30T00:00:00-0500','T+',NULL,2005,'AMAZING SPIDER-MAN VOL. 10: NEW AVENGERS TPB (2005)','collection'),(33,'14818',NULL,2011,'2015-03-19T15:30:29-0400','',NULL,2011,'Annihilators: Earthfall (2011)',''),(34,'14696',NULL,2099,'2011-07-14T17:49:16-0400','',NULL,2011,'Art of Marvel Movies: The Art of Captain America - The First Avenger (2011 - Present)','');
/*!40000 ALTER TABLE `series` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-05 19:26:52
