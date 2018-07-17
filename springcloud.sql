CREATE TABLE `dept` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `dbSrc` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

--
-- Dumping data for table `dept`
--

LOCK TABLES `dept` WRITE;
INSERT INTO `dept` VALUES (1,'人事部','clouddb01'),(2,'财务部','clouddb01'),(3,'技术部','clouddb01'),(4,'销售部','clouddb01'),(5,'宣传部','clouddb01');
UNLOCK TABLES;