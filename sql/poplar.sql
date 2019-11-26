/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50727
Source Host           : localhost:3306
Source Database       : poplar

Target Server Type    : MYSQL
Target Server Version : 50727
File Encoding         : 65001

Date: 2019-11-16 10:43:53
*/

CREATE DATABASE `poplar` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
use poplar;
SET NAMES utf8;
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '唯一标示',
  `user_id` varchar(200) DEFAULT NULL COMMENT '用户标示',
  `user_name` varchar(200) NOT NULL COMMENT '用户名',
  `user_age` varchar(200) DEFAULT NULL COMMENT '用户年龄',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=125 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('123', 'zouni', 'hao', '26');
INSERT INTO `t_user` VALUES ('124', 'zouni', 'hao', '26');
