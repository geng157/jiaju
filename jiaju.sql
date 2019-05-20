/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : jiaju

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2019-05-20 19:21:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for companyinfo
-- ----------------------------
DROP TABLE IF EXISTS `companyinfo`;
CREATE TABLE `companyinfo` (
  `companyIntroduction` varchar(500) DEFAULT NULL,
  `corporateCulture` varchar(500) DEFAULT NULL,
  `companyPhone` varchar(20) DEFAULT NULL,
  `companyEmail` varchar(50) DEFAULT NULL,
  `companyAddress` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of companyinfo
-- ----------------------------

-- ----------------------------
-- Table structure for desigener
-- ----------------------------
DROP TABLE IF EXISTS `desigener`;
CREATE TABLE `desigener` (
  `designerId` int(11) NOT NULL,
  `name` varchar(25) DEFAULT NULL,
  `zhiWei` varchar(25) DEFAULT NULL,
  `touXiang` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`designerId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of desigener
-- ----------------------------

-- ----------------------------
-- Table structure for liuyan
-- ----------------------------
DROP TABLE IF EXISTS `liuyan`;
CREATE TABLE `liuyan` (
  `liuYanId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(25) DEFAULT NULL,
  `phone` varchar(25) DEFAULT NULL,
  `email` varchar(25) DEFAULT NULL,
  `content` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`liuYanId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of liuyan
-- ----------------------------

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `newsId` int(11) NOT NULL,
  `newsDate` date DEFAULT NULL,
  `newsTitle` varchar(255) DEFAULT NULL,
  `newsContent` varchar(255) DEFAULT NULL,
  `newsClassId` int(11) DEFAULT NULL,
  PRIMARY KEY (`newsId`),
  KEY `newsClassId` (`newsClassId`),
  CONSTRAINT `news_ibfk_1` FOREIGN KEY (`newsClassId`) REFERENCES `newsclass` (`classId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------

-- ----------------------------
-- Table structure for newsclass
-- ----------------------------
DROP TABLE IF EXISTS `newsclass`;
CREATE TABLE `newsclass` (
  `classId` int(11) NOT NULL,
  `className` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`classId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of newsclass
-- ----------------------------

-- ----------------------------
-- Table structure for productclass
-- ----------------------------
DROP TABLE IF EXISTS `productclass`;
CREATE TABLE `productclass` (
  `classId` int(255) NOT NULL,
  `className` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`classId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of productclass
-- ----------------------------

-- ----------------------------
-- Table structure for productinfo
-- ----------------------------
DROP TABLE IF EXISTS `productinfo`;
CREATE TABLE `productinfo` (
  `productId` int(20) NOT NULL,
  `productName` varchar(255) DEFAULT NULL,
  `productCaiZhi` varchar(255) DEFAULT NULL,
  `productPrice` double(10,0) DEFAULT NULL,
  `productMarketPrice` double(10,0) DEFAULT NULL,
  `pinPai` varchar(255) DEFAULT NULL,
  `zuZhuang` varchar(255) DEFAULT NULL,
  `dingZhi` varchar(255) DEFAULT NULL,
  `color` varchar(255) DEFAULT NULL,
  `yuanSu` varchar(255) DEFAULT NULL,
  `fengGe` varchar(255) DEFAULT NULL,
  `kuanShi` varchar(255) DEFAULT NULL,
  `classId` int(11) NOT NULL,
  PRIMARY KEY (`productId`),
  KEY `classId` (`classId`),
  CONSTRAINT `productinfo_ibfk_1` FOREIGN KEY (`classId`) REFERENCES `productclass` (`classId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of productinfo
-- ----------------------------
