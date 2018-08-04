/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50018
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50018
File Encoding         : 65001

Date: 2018-08-04 09:37:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `tid` int(3) NOT NULL auto_increment,
  `username` char(10) default NULL,
  `password` char(10) default NULL,
  PRIMARY KEY  (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', '张三', '1');
INSERT INTO `users` VALUES ('5', '赛事', '123456');
INSERT INTO `users` VALUES ('8', '張三', '11');
INSERT INTO `users` VALUES ('9', '1', 'Password');
INSERT INTO `users` VALUES ('10', 'f', 'Password');
INSERT INTO `users` VALUES ('11', '22', 'Password');
INSERT INTO `users` VALUES ('12', '333', 'Password');
INSERT INTO `users` VALUES ('13', '3', 'Password');
INSERT INTO `users` VALUES ('14', '飒飒', 'Password');
INSERT INTO `users` VALUES ('15', 'ff', 'Password');
INSERT INTO `users` VALUES ('16', 'sad', 'Password');
INSERT INTO `users` VALUES ('17', 'c cscsc', 'Password');
INSERT INTO `users` VALUES ('18', 'vvvv', 'Password');
INSERT INTO `users` VALUES ('19', 'fffsdf', 'Password');
INSERT INTO `users` VALUES ('20', 'dsdsd', 'Password');
INSERT INTO `users` VALUES ('21', 'd', 'Password');
INSERT INTO `users` VALUES ('22', 'gg', 'Password');
