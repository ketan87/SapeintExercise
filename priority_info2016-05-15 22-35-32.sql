USE product;

CREATE TABLE `priority_info` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PRIORITY` int(11) NOT NULL,
  `PRODUCT_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

