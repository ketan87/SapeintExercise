USE product;

CREATE TABLE `product_info` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(50) DEFAULT NULL,
  `CATEGORY` varchar(50) DEFAULT NULL,
  `PRICE` bigint(20) DEFAULT NULL,
  `DESCRIPTION` varchar(200) DEFAULT NULL,
  `REVIEW` varchar(500) DEFAULT NULL,
  `IMAGE` blob,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


insert into `product_info`(`ID`,`NAME`,`CATEGORY`,`PRICE`,`DESCRIPTION`,`REVIEW`,`IMAGE`) values (1,'name 1','category 1',100,'description 1','review 1',null);

