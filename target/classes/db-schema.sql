SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for names
-- ----------------------------
CREATE TABLE `names` (
  `ID` int(6) NOT NULL,
  `FirstName` varchar(32) DEFAULT NULL,
  `FullName` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `names` VALUES ('1', 'Shriram', 'Shriram Sharma');
INSERT INTO `names` VALUES ('2', 'Ayaz', 'Ayaz lakdawala');
INSERT INTO `names` VALUES ('3', 'Jim', 'Jim Burak');
INSERT INTO `names` VALUES ('4', 'Guimin', 'Guimin Zhang');
