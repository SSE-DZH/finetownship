/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80036 (8.0.36)
 Source Host           : localhost:3306
 Source Schema         : finetownship

 Target Server Type    : MySQL
 Target Server Version : 80036 (8.0.36)
 File Encoding         : 65001

 Date: 03/12/2024 17:08:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for accept_info
-- ----------------------------
DROP TABLE IF EXISTS `accept_info`;
CREATE TABLE `accept_info`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '助力成功记录id',
  `pid` int NULL DEFAULT NULL COMMENT '好乡镇宣传id',
  `sid` int NULL DEFAULT NULL COMMENT '好乡镇助力id',
  `create_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `pid_idx`(`pid` ASC) USING BTREE,
  INDEX `sid_idx`(`sid` ASC) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '助力成功记录表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of accept_info
-- ----------------------------

-- ----------------------------
-- Table structure for advocacy_type
-- ----------------------------
DROP TABLE IF EXISTS `advocacy_type`;
CREATE TABLE `advocacy_type`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '好乡镇宣传类型id',
  `type` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '好乡镇宣传类型',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '好乡镇宣传类型表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of advocacy_type
-- ----------------------------
INSERT INTO `advocacy_type` VALUES (1, '农家院');
INSERT INTO `advocacy_type` VALUES (2, '自然风光秀丽');
INSERT INTO `advocacy_type` VALUES (3, '古建筑');
INSERT INTO `advocacy_type` VALUES (4, '土特产');
INSERT INTO `advocacy_type` VALUES (5, '特色小吃');
INSERT INTO `advocacy_type` VALUES (6, '民俗活动');

-- ----------------------------
-- Table structure for auser
-- ----------------------------
DROP TABLE IF EXISTS `auser`;
CREATE TABLE `auser`  (
  `aname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '管理员用户名',
  `apwd` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '管理员密码',
  PRIMARY KEY (`aname`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '管理员用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of auser
-- ----------------------------

-- ----------------------------
-- Table structure for buser
-- ----------------------------
DROP TABLE IF EXISTS `buser`;
CREATE TABLE `buser`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '用户标识',
  `uname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '用户注册名称',
  `ctype` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT '身份证' COMMENT '证件类型，默认身份证',
  `idno` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '证件号码',
  `bname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '用户姓名',
  `bpwd` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '密码',
  `phone_no` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '联系电话',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `user_level` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT '普通用户' COMMENT '用户级别，默认普通用户',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '用户简介',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '用户信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of buser
-- ----------------------------
INSERT INTO `buser` VALUES (1, 'Zhiend', '身份证', '511528191106127986', '刘双', '123456', '15189564569', '2024-12-03 14:15:36', '2024-12-03 14:15:36', '普通用户', 'new day!');
INSERT INTO `buser` VALUES (2, 'You', '身份证', '511528191106127983', '刘双', '1236578', '15189234669', '2024-12-03 14:17:51', '2024-12-03 14:41:45', '普通用户', '🤎');

-- ----------------------------
-- Table structure for city_info
-- ----------------------------
DROP TABLE IF EXISTS `city_info`;
CREATE TABLE `city_info`  (
  `city_id` int NOT NULL COMMENT '城市id',
  `city_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '城市名称',
  `province_id` int NULL DEFAULT NULL COMMENT '省id',
  `province_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '省名称',
  PRIMARY KEY (`city_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '城市信息表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of city_info
-- ----------------------------

-- ----------------------------
-- Table structure for report
-- ----------------------------
DROP TABLE IF EXISTS `report`;
CREATE TABLE `report`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '报告id',
  `month_id` varchar(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '统计月份',
  `ptype_id` int NULL DEFAULT NULL COMMENT '好乡镇宣传类型id',
  `town_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '好乡镇id',
  `puser_num` int NULL DEFAULT NULL COMMENT '月累计宣传用户数',
  `suser_num` int NULL DEFAULT NULL COMMENT '月累计助力用户数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '好乡镇宣传统计报表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of report
-- ----------------------------

-- ----------------------------
-- Table structure for town_advocacy_info
-- ----------------------------
DROP TABLE IF EXISTS `town_advocacy_info`;
CREATE TABLE `town_advocacy_info`  (
  `pid` int NOT NULL AUTO_INCREMENT COMMENT '好乡镇宣传id',
  `ptitle` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '好乡镇宣传标题',
  `type` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '好乡镇宣传类型',
  `puser_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '发布该好乡镇宣传的用户名',
  `town_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '被宣传的好乡镇名称',
  `pdesc` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '好乡镇宣传描述',
  `pfile_list` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '上传的图片等资源文件名称列表',
  `pbegin_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '开始宣传日期，默认提交日期',
  `pstate` int NULL DEFAULT NULL COMMENT '状态，0：已发布；-1：已取消',
  `pupdate_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改日期',
  PRIMARY KEY (`pid`) USING BTREE,
  INDEX `f1`(`puser_name` ASC) USING BTREE,
  INDEX `f2`(`type` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '好乡镇宣传信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of town_advocacy_info
-- ----------------------------
INSERT INTO `town_advocacy_info` VALUES (1, '乡村美食节', '特色小吃', 'Zhiend', '美食村', '品尝乡村特色小吃，享受传统美食文化。', 'food1.jpg,food2.jpg', '2024-12-03 17:02:01', 0, '2024-12-03 17:02:01');
INSERT INTO `town_advocacy_info` VALUES (2, '古韵之旅', '古建筑', 'You', '古韵镇', '探索古镇历史，体验古建筑的魅力。', 'building1.jpg,building2.jpg', '2024-12-03 17:02:01', 0, '2024-12-03 17:02:01');
INSERT INTO `town_advocacy_info` VALUES (3, '自然风光摄影展', '自然风光秀丽', 'Zhiend', '风光村', '捕捉自然风光的瞬间，记录乡村美景。', 'scenery1.jpg,scenery2.jpg', '2024-12-03 17:02:01', 0, '2024-12-03 17:02:01');
INSERT INTO `town_advocacy_info` VALUES (4, '农家体验活动', '农家院', 'You', '农家庄', '亲身体验农家生活，享受田园乐趣。', 'farm1.jpg,farm2.jpg', '2024-12-03 17:02:01', 0, '2024-12-03 17:02:01');
INSERT INTO `town_advocacy_info` VALUES (5, '传统民俗节', '民俗活动', 'Zhiend', '民俗村', '参与传统民俗活动，感受乡村文化。', 'festival1.jpg,festival2.jpg', '2024-12-03 17:02:01', 0, '2024-12-03 17:02:01');
INSERT INTO `town_advocacy_info` VALUES (6, '乡村土特产展销', '土特产', 'You', '特产村', '展示乡村土特产，推广地方特色产品。', 'specialty1.jpg,specialty2.jpg', '2024-12-03 17:02:01', 0, '2024-12-03 17:02:01');
INSERT INTO `town_advocacy_info` VALUES (7, '秋收庆典', '农家院', 'Zhiend', '丰收镇', '庆祝丰收，体验农耕文化。', 'harvest1.jpg,harvest2.jpg', '2024-12-03 17:02:01', 0, '2024-12-03 17:02:01');
INSERT INTO `town_advocacy_info` VALUES (8, '历史文化讲座', '古建筑', 'You', '历史城', '深入了解乡村历史文化，增长知识。', 'history1.jpg,history2.jpg', '2024-12-03 17:02:01', 0, '2024-12-03 17:02:01');
INSERT INTO `town_advocacy_info` VALUES (9, '乡村音乐节', '民俗活动', 'Zhiend', '音乐村', '享受乡村音乐，放松身心。', 'music1.jpg,music2.jpg', '2024-12-03 17:02:01', 0, '2024-12-03 17:02:01');
INSERT INTO `town_advocacy_info` VALUES (10, '自然探索之旅', '自然风光秀丽', 'You', '探险谷', '探索自然奥秘，挑战自我。', 'explore1.jpg,explore2.jpg', '2024-12-03 17:02:01', 0, '2024-12-03 17:02:01');

-- ----------------------------
-- Table structure for town_info
-- ----------------------------
DROP TABLE IF EXISTS `town_info`;
CREATE TABLE `town_info`  (
  `town_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '乡镇id',
  `town_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '乡镇名称',
  `city_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '城市id',
  `city_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '城市名称',
  `province_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '省id',
  `province_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '省名称',
  PRIMARY KEY (`town_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '乡镇信息表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of town_info
-- ----------------------------

-- ----------------------------
-- Table structure for town_support
-- ----------------------------
DROP TABLE IF EXISTS `town_support`;
CREATE TABLE `town_support`  (
  `sid` int NOT NULL AUTO_INCREMENT COMMENT '好乡镇宣传助力id',
  `suser_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '助力用户名',
  `pid` int NULL DEFAULT NULL COMMENT '对应的好乡镇宣传id',
  `stitle` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '助力标题',
  `sdesc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '助力描述',
  `support_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
  `support_state` tinyint(1) NULL DEFAULT NULL COMMENT '状态，0：待接受；1：已接受；2：拒绝；3：取消',
  `update_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改日期',
  `sfile_list` varchar(400) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '上传的介绍图片等文件名称列表',
  PRIMARY KEY (`sid`) USING BTREE,
  INDEX `bid2`(`suser_name` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '好乡镇宣传助力信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of town_support
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
