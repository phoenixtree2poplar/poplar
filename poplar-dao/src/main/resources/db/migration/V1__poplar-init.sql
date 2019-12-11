/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50727
 Source Host           : localhost:3306
 Source Schema         : poplar

 Target Server Type    : MySQL
 Target Server Version : 50727
 File Encoding         : 65001

 Date: 04/12/2019 20:27:17
 -- ----------------------------------------------------------------------
 先清空库
 DROP DATABASE IF EXISTS poplar;
 CREATE DATABASE poplar DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '唯一标示',
  `user_id` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户标示',
  `user_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `user_age` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户年龄',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, 'phoenixtree', 'wutong', '21');
INSERT INTO `t_user` VALUES (2, 'poplar', 'di', '21');
INSERT INTO `t_user` VALUES (3, 'poplar3', 'di3', '3');
INSERT INTO `t_user` VALUES (4, 'poplar4', 'di4', '4');
INSERT INTO `t_user` VALUES (5, 'poplar5', 'di5', '5');
INSERT INTO `t_user` VALUES (6, 'poplar6', 'di6', '6');
INSERT INTO `t_user` VALUES (7, 'poplar7', 'di7', '7');
INSERT INTO `t_user` VALUES (8, 'poplar8', 'di8', '8');
INSERT INTO `t_user` VALUES (9, 'poplar9', 'di9', '9');
INSERT INTO `t_user` VALUES (10, 'poplar10', 'di10', '10');
INSERT INTO `t_user` VALUES (11, 'poplar11', 'di11', '11');
INSERT INTO `t_user` VALUES (12, 'poplar12', 'di12', '12');
INSERT INTO `t_user` VALUES (13, 'poplar13', 'di13', '13');
INSERT INTO `t_user` VALUES (14, 'poplar14', 'di14', '14');
INSERT INTO `t_user` VALUES (15, 'poplar15', 'di15', '15');
INSERT INTO `t_user` VALUES (16, 'poplar16', 'di16', '16');
INSERT INTO `t_user` VALUES (17, 'poplar17', 'di17', '17');
INSERT INTO `t_user` VALUES (18, 'poplar18', 'di18', '18');
INSERT INTO `t_user` VALUES (19, 'poplar19', 'di19', '19');
INSERT INTO `t_user` VALUES (20, 'poplar20', 'di20', '20');
INSERT INTO `t_user` VALUES (21, 'poplar21', 'di21', '21');
INSERT INTO `t_user` VALUES (22, 'poplar22', 'di22', '22');
INSERT INTO `t_user` VALUES (23, 'poplar23', 'di23', '23');
INSERT INTO `t_user` VALUES (24, 'poplar24', 'di24', '24');
INSERT INTO `t_user` VALUES (25, 'poplar25', 'di25', '25');
INSERT INTO `t_user` VALUES (26, 'poplar26', 'di26', '26');
INSERT INTO `t_user` VALUES (27, 'poplar27', 'di27', '27');
INSERT INTO `t_user` VALUES (28, 'poplar28', 'di28', '28');
INSERT INTO `t_user` VALUES (29, 'poplar29', 'di29', '29');
INSERT INTO `t_user` VALUES (30, 'poplar30', 'di30', '30');
INSERT INTO `t_user` VALUES (31, 'poplar31', 'di31', '31');
INSERT INTO `t_user` VALUES (32, 'poplar32', 'di32', '32');
INSERT INTO `t_user` VALUES (33, 'poplar33', 'di33', '33');
INSERT INTO `t_user` VALUES (34, 'poplar34', 'di34', '34');
INSERT INTO `t_user` VALUES (35, 'poplar35', 'di35', '35');
INSERT INTO `t_user` VALUES (36, 'poplar36', 'di36', '36');
INSERT INTO `t_user` VALUES (37, 'poplar37', 'di37', '37');
INSERT INTO `t_user` VALUES (38, 'poplar38', 'di38', '38');
INSERT INTO `t_user` VALUES (39, 'poplar39', 'di39', '39');
INSERT INTO `t_user` VALUES (40, 'poplar40', 'di40', '40');

SET FOREIGN_KEY_CHECKS = 1;