/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : my

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2018-08-04 09:36:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` int(11) NOT NULL,
  `name` int(11) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', '31');
INSERT INTO `person` VALUES ('6', '31');
INSERT INTO `person` VALUES ('4', '44');
INSERT INTO `person` VALUES ('3', '15');
INSERT INTO `person` VALUES ('5', '24');
INSERT INTO `person` VALUES ('7', '31');
