/*
 Navicat Premium Data Transfer

 Source Server         : CYH
 Source Server Type    : MySQL
 Source Server Version : 80038 (8.0.38)
 Source Host           : 8.140.22.230:3306
 Source Schema         : finetownship

 Target Server Type    : MySQL
 Target Server Version : 80038 (8.0.38)
 File Encoding         : 65001

 Date: 08/12/2024 21:23:52
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
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '助力成功记录表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of accept_info
-- ----------------------------
INSERT INTO `accept_info` VALUES (2, 16, 1, '2024-12-04 15:32:18', 'UserA成功助力郑州文化节');
INSERT INTO `accept_info` VALUES (3, 17, 2, '2024-12-04 15:32:18', 'UserB成功助力开封历史游');
INSERT INTO `accept_info` VALUES (4, 18, 3, '2024-12-04 15:32:18', 'UserC成功助力洛阳牡丹节');
INSERT INTO `accept_info` VALUES (5, 19, 4, '2024-12-04 15:32:18', 'UserD成功助力安阳文字之旅');
INSERT INTO `accept_info` VALUES (6, 20, 5, '2024-12-04 15:32:18', 'UserE成功助力新乡农业体验');
INSERT INTO `accept_info` VALUES (8, 21, 6, '2024-12-04 17:06:23', '棒棒！！');
INSERT INTO `accept_info` VALUES (9, 28, 15, '2024-12-08 13:54:46', '很好');
INSERT INTO `accept_info` VALUES (10, 31, 17, '2024-12-08 14:05:08', '很好');
INSERT INTO `accept_info` VALUES (11, 32, 18, '2024-12-08 14:40:17', '111111');

-- ----------------------------
-- Table structure for advocacy_type
-- ----------------------------
DROP TABLE IF EXISTS `advocacy_type`;
CREATE TABLE `advocacy_type`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '好乡镇宣传类型id',
  `type` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '好乡镇宣传类型',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '好乡镇宣传类型表' ROW_FORMAT = DYNAMIC;

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
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '管理员用户表' ROW_FORMAT = DYNAMIC;

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
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '用户信息表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of buser
-- ----------------------------
INSERT INTO `buser` VALUES (1, 'Zhiend', '身份证', '511528191106127986', '刘双', '123456', '15189564569', '2024-12-03 14:15:36', '2024-12-08 14:36:13', '普通用户', 'new day!11');
INSERT INTO `buser` VALUES (2, 'You', '身份证', '511528191106127983', '刘双', '1236578', '15189234669', '2024-12-03 14:17:51', '2024-12-03 14:41:45', '普通用户', '🤎');
INSERT INTO `buser` VALUES (3, 'AA', '郑州', '身份证', '张三', 'Aa123456', '4105247222222222222', '2024-12-04 18:05:05', '2024-12-04 18:05:05', '普通用户', '你好，我是张三');
INSERT INTO `buser` VALUES (4, 'zhangsan', '身份证', '4105270000000000', '张三', '112', '111111111222', '2024-12-04 23:10:19', '2024-12-04 23:10:19', '普通用户', '简介');
INSERT INTO `buser` VALUES (5, '222', '身份证', '410527111111111111', '111', '123456', '1111', '2024-12-04 23:22:42', '2024-12-04 23:22:42', '普通用户', '111');

-- ----------------------------
-- Table structure for city_info
-- ----------------------------
DROP TABLE IF EXISTS `city_info`;
CREATE TABLE `city_info`  (
  `city_id` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '城市id',
  `city_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '城市名称',
  `province_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '省名称',
  PRIMARY KEY (`city_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 338 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '城市信息表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of city_info
-- ----------------------------
INSERT INTO `city_info` VALUES (1, '阿坝藏族羌族自治州', '四川省');
INSERT INTO `city_info` VALUES (2, '阿克苏地区', '新疆维吾尔自治区');
INSERT INTO `city_info` VALUES (3, '阿拉善盟', '内蒙古自治区');
INSERT INTO `city_info` VALUES (4, '阿勒泰地区', '新疆维吾尔自治区');
INSERT INTO `city_info` VALUES (5, '阿里地区', '西藏自治区');
INSERT INTO `city_info` VALUES (6, '安康市', '陕西省');
INSERT INTO `city_info` VALUES (7, '安庆市', '安徽省');
INSERT INTO `city_info` VALUES (8, '安顺市', '贵州省');
INSERT INTO `city_info` VALUES (9, '安阳市', '河南省');
INSERT INTO `city_info` VALUES (10, '鞍山市', '辽宁省');
INSERT INTO `city_info` VALUES (11, '巴彦淖尔市', '内蒙古自治区');
INSERT INTO `city_info` VALUES (12, '巴音郭楞蒙古自治州', '新疆维吾尔自治区');
INSERT INTO `city_info` VALUES (13, '巴中市', '四川省');
INSERT INTO `city_info` VALUES (14, '白城市', '吉林省');
INSERT INTO `city_info` VALUES (15, '白山市', '吉林省');
INSERT INTO `city_info` VALUES (16, '白银市', '甘肃省');
INSERT INTO `city_info` VALUES (17, '百色市', '广西壮族自治区');
INSERT INTO `city_info` VALUES (18, '蚌埠市', '安徽省');
INSERT INTO `city_info` VALUES (19, '包头市', '内蒙古自治区');
INSERT INTO `city_info` VALUES (20, '宝鸡市', '陕西省');
INSERT INTO `city_info` VALUES (21, '保定市', '河北省');
INSERT INTO `city_info` VALUES (22, '保山市', '云南省');
INSERT INTO `city_info` VALUES (23, '北海市', '广西壮族自治区');
INSERT INTO `city_info` VALUES (24, '本溪市', '辽宁省');
INSERT INTO `city_info` VALUES (25, '毕节地区', '贵州省');
INSERT INTO `city_info` VALUES (26, '滨州市', '山东省');
INSERT INTO `city_info` VALUES (27, '博尔塔拉蒙古自治州', '新疆维吾尔自治区');
INSERT INTO `city_info` VALUES (28, '沧州市', '河北省');
INSERT INTO `city_info` VALUES (29, '昌都地区', '西藏自治区');
INSERT INTO `city_info` VALUES (30, '昌吉回族自治州', '新疆维吾尔自治区');
INSERT INTO `city_info` VALUES (31, '长春市', '吉林省');
INSERT INTO `city_info` VALUES (32, '长沙市', '湖南省');
INSERT INTO `city_info` VALUES (33, '长治市', '山西省');
INSERT INTO `city_info` VALUES (34, '常德市', '湖南省');
INSERT INTO `city_info` VALUES (35, '常州市', '江苏省');
INSERT INTO `city_info` VALUES (36, '巢湖市', '安徽省');
INSERT INTO `city_info` VALUES (37, '朝阳市', '辽宁省');
INSERT INTO `city_info` VALUES (38, '潮州市', '广东省');
INSERT INTO `city_info` VALUES (39, '郴州市', '湖南省');
INSERT INTO `city_info` VALUES (40, '成都市', '四川省');
INSERT INTO `city_info` VALUES (41, '承德市', '河北省');
INSERT INTO `city_info` VALUES (42, '池州市', '安徽省');
INSERT INTO `city_info` VALUES (43, '赤峰市', '内蒙古自治区');
INSERT INTO `city_info` VALUES (44, '崇左市', '广西壮族自治区');
INSERT INTO `city_info` VALUES (45, '滁州市', '安徽省');
INSERT INTO `city_info` VALUES (46, '楚雄彝族自治州', '云南省');
INSERT INTO `city_info` VALUES (47, '达州市', '四川省');
INSERT INTO `city_info` VALUES (48, '大理白族自治州', '云南省');
INSERT INTO `city_info` VALUES (49, '大连市', '辽宁省');
INSERT INTO `city_info` VALUES (50, '大庆市', '黑龙江省');
INSERT INTO `city_info` VALUES (51, '大同市', '山西省');
INSERT INTO `city_info` VALUES (52, '大兴安岭地区', '黑龙江省');
INSERT INTO `city_info` VALUES (53, '丹东市', '辽宁省');
INSERT INTO `city_info` VALUES (54, '德宏傣族景颇族自治州', '云南省');
INSERT INTO `city_info` VALUES (55, '德阳市', '四川省');
INSERT INTO `city_info` VALUES (56, '德州市', '山东省');
INSERT INTO `city_info` VALUES (57, '迪庆藏族自治州', '云南省');
INSERT INTO `city_info` VALUES (58, '定西市', '甘肃省');
INSERT INTO `city_info` VALUES (59, '东莞市', '广东省');
INSERT INTO `city_info` VALUES (60, '东营市', '山东省');
INSERT INTO `city_info` VALUES (61, '鄂尔多斯市', '内蒙古自治区');
INSERT INTO `city_info` VALUES (62, '鄂州市', '湖北省');
INSERT INTO `city_info` VALUES (63, '恩施土家族苗族自治州', '湖北省');
INSERT INTO `city_info` VALUES (64, '防城港市', '广西壮族自治区');
INSERT INTO `city_info` VALUES (65, '佛山市', '广东省');
INSERT INTO `city_info` VALUES (66, '福州市', '福建省');
INSERT INTO `city_info` VALUES (67, '抚顺市', '辽宁省');
INSERT INTO `city_info` VALUES (68, '抚州市', '江西省');
INSERT INTO `city_info` VALUES (69, '阜新市', '辽宁省');
INSERT INTO `city_info` VALUES (70, '阜阳市', '安徽省');
INSERT INTO `city_info` VALUES (71, '甘南州', '甘肃省');
INSERT INTO `city_info` VALUES (72, '甘孜藏族自治州', '四川省');
INSERT INTO `city_info` VALUES (73, '赣州市', '江西省');
INSERT INTO `city_info` VALUES (74, '固原市', '宁夏回族自治区');
INSERT INTO `city_info` VALUES (75, '广安市', '四川省');
INSERT INTO `city_info` VALUES (76, '广元市', '四川省');
INSERT INTO `city_info` VALUES (77, '广州市', '广东省');
INSERT INTO `city_info` VALUES (78, '贵港市', '广西壮族自治区');
INSERT INTO `city_info` VALUES (79, '贵阳市', '贵州省');
INSERT INTO `city_info` VALUES (80, '桂林市', '广西壮族自治区');
INSERT INTO `city_info` VALUES (81, '果洛藏族自治州', '青海省');
INSERT INTO `city_info` VALUES (82, '哈尔滨市', '黑龙江省');
INSERT INTO `city_info` VALUES (83, '哈密地区', '新疆维吾尔自治区');
INSERT INTO `city_info` VALUES (84, '海北藏族自治州', '青海省');
INSERT INTO `city_info` VALUES (85, '海东地区', '青海省');
INSERT INTO `city_info` VALUES (86, '海口市', '海南省');
INSERT INTO `city_info` VALUES (87, '海南藏族自治州', '青海省');
INSERT INTO `city_info` VALUES (88, '海西蒙古族藏族自治州', '青海省');
INSERT INTO `city_info` VALUES (89, '邯郸市', '河北省');
INSERT INTO `city_info` VALUES (90, '汉中市', '陕西省');
INSERT INTO `city_info` VALUES (91, '杭州市', '浙江省');
INSERT INTO `city_info` VALUES (92, '毫州市', '安徽省');
INSERT INTO `city_info` VALUES (93, '合肥市', '安徽省');
INSERT INTO `city_info` VALUES (94, '和田地区', '新疆维吾尔自治区');
INSERT INTO `city_info` VALUES (95, '河池市', '广西壮族自治区');
INSERT INTO `city_info` VALUES (96, '河源市', '广东省');
INSERT INTO `city_info` VALUES (97, '菏泽市', '山东省');
INSERT INTO `city_info` VALUES (98, '贺州市', '广西壮族自治区');
INSERT INTO `city_info` VALUES (99, '鹤壁市', '河南省');
INSERT INTO `city_info` VALUES (100, '鹤岗市', '黑龙江省');
INSERT INTO `city_info` VALUES (101, '黑河市', '黑龙江省');
INSERT INTO `city_info` VALUES (102, '衡水市', '河北省');
INSERT INTO `city_info` VALUES (103, '衡阳市', '湖南省');
INSERT INTO `city_info` VALUES (104, '红河哈尼族彝族自治州', '云南省');
INSERT INTO `city_info` VALUES (105, '呼和浩特市', '内蒙古自治区');
INSERT INTO `city_info` VALUES (106, '呼伦贝尔市', '内蒙古自治区');
INSERT INTO `city_info` VALUES (107, '湖州市', '浙江省');
INSERT INTO `city_info` VALUES (108, '葫芦岛市', '辽宁省');
INSERT INTO `city_info` VALUES (109, '怀化市', '湖南省');
INSERT INTO `city_info` VALUES (110, '淮安市', '江苏省');
INSERT INTO `city_info` VALUES (111, '淮北市', '安徽省');
INSERT INTO `city_info` VALUES (112, '淮南市', '安徽省');
INSERT INTO `city_info` VALUES (113, '黄冈市', '湖北省');
INSERT INTO `city_info` VALUES (114, '黄南藏族自治州', '青海省');
INSERT INTO `city_info` VALUES (115, '黄山市', '安徽省');
INSERT INTO `city_info` VALUES (116, '黄石市', '湖北省');
INSERT INTO `city_info` VALUES (117, '惠州市', '广东省');
INSERT INTO `city_info` VALUES (118, '鸡西市', '黑龙江省');
INSERT INTO `city_info` VALUES (119, '吉安市', '江西省');
INSERT INTO `city_info` VALUES (120, '吉林市', '吉林省');
INSERT INTO `city_info` VALUES (121, '济南市', '山东省');
INSERT INTO `city_info` VALUES (122, '济宁市', '山东省');
INSERT INTO `city_info` VALUES (123, '佳木斯市', '黑龙江省');
INSERT INTO `city_info` VALUES (124, '嘉兴市', '浙江省');
INSERT INTO `city_info` VALUES (125, '嘉峪关市', '甘肃省');
INSERT INTO `city_info` VALUES (126, '江门市', '广东省');
INSERT INTO `city_info` VALUES (127, '焦作市', '河南省');
INSERT INTO `city_info` VALUES (128, '揭阳市', '广东省');
INSERT INTO `city_info` VALUES (129, '金昌市', '甘肃省');
INSERT INTO `city_info` VALUES (130, '金华市', '浙江省');
INSERT INTO `city_info` VALUES (131, '锦州市', '辽宁省');
INSERT INTO `city_info` VALUES (132, '晋城市', '山西省');
INSERT INTO `city_info` VALUES (133, '晋中市', '山西省');
INSERT INTO `city_info` VALUES (134, '荆门市', '湖北省');
INSERT INTO `city_info` VALUES (135, '荆州市', '湖北省');
INSERT INTO `city_info` VALUES (136, '景德镇市', '江西省');
INSERT INTO `city_info` VALUES (137, '九江市', '江西省');
INSERT INTO `city_info` VALUES (138, '酒泉市', '甘肃省');
INSERT INTO `city_info` VALUES (139, '喀什地区', '新疆维吾尔自治区');
INSERT INTO `city_info` VALUES (140, '开封市', '河南省');
INSERT INTO `city_info` VALUES (141, '克拉玛依市', '新疆维吾尔自治区');
INSERT INTO `city_info` VALUES (142, '克孜勒苏柯尔克孜自治州', '新疆维吾尔自治区');
INSERT INTO `city_info` VALUES (143, '昆明市', '云南省');
INSERT INTO `city_info` VALUES (144, '拉萨市', '西藏自治区');
INSERT INTO `city_info` VALUES (145, '来宾市', '广西壮族自治区');
INSERT INTO `city_info` VALUES (146, '莱芜市', '山东省');
INSERT INTO `city_info` VALUES (147, '兰州市', '甘肃省');
INSERT INTO `city_info` VALUES (148, '廊坊市', '河北省');
INSERT INTO `city_info` VALUES (149, '乐山市', '四川省');
INSERT INTO `city_info` VALUES (150, '丽江市', '云南省');
INSERT INTO `city_info` VALUES (151, '丽水市', '浙江省');
INSERT INTO `city_info` VALUES (152, '连云港市', '江苏省');
INSERT INTO `city_info` VALUES (153, '凉山彝族自治州', '四川省');
INSERT INTO `city_info` VALUES (154, '辽阳市', '辽宁省');
INSERT INTO `city_info` VALUES (155, '辽源市', '吉林省');
INSERT INTO `city_info` VALUES (156, '聊城市', '山东省');
INSERT INTO `city_info` VALUES (157, '林芝地区', '西藏自治区');
INSERT INTO `city_info` VALUES (158, '临沧市', '云南省');
INSERT INTO `city_info` VALUES (159, '临汾市', '山西省');
INSERT INTO `city_info` VALUES (160, '临夏州', '甘肃省');
INSERT INTO `city_info` VALUES (161, '临沂市', '山东省');
INSERT INTO `city_info` VALUES (162, '柳州市', '广西壮族自治区');
INSERT INTO `city_info` VALUES (163, '六安市', '安徽省');
INSERT INTO `city_info` VALUES (164, '六盘水市', '贵州省');
INSERT INTO `city_info` VALUES (165, '龙岩市', '福建省');
INSERT INTO `city_info` VALUES (166, '陇南市', '甘肃省');
INSERT INTO `city_info` VALUES (167, '娄底市', '湖南省');
INSERT INTO `city_info` VALUES (168, '泸州市', '四川省');
INSERT INTO `city_info` VALUES (169, '吕梁市', '山西省');
INSERT INTO `city_info` VALUES (170, '洛阳市', '河南省');
INSERT INTO `city_info` VALUES (171, '漯河市', '河南省');
INSERT INTO `city_info` VALUES (172, '马鞍山市', '安徽省');
INSERT INTO `city_info` VALUES (173, '茂名市', '广东省');
INSERT INTO `city_info` VALUES (174, '眉山市', '四川省');
INSERT INTO `city_info` VALUES (175, '梅州市', '广东省');
INSERT INTO `city_info` VALUES (176, '绵阳市', '四川省');
INSERT INTO `city_info` VALUES (177, '牡丹江市', '黑龙江省');
INSERT INTO `city_info` VALUES (178, '内江市', '四川省');
INSERT INTO `city_info` VALUES (179, '那曲地区', '西藏自治区');
INSERT INTO `city_info` VALUES (180, '南昌市', '江西省');
INSERT INTO `city_info` VALUES (181, '南充市', '四川省');
INSERT INTO `city_info` VALUES (182, '南京市', '江苏省');
INSERT INTO `city_info` VALUES (183, '南宁市', '广西壮族自治区');
INSERT INTO `city_info` VALUES (184, '南平市', '福建省');
INSERT INTO `city_info` VALUES (185, '南通市', '江苏省');
INSERT INTO `city_info` VALUES (186, '南阳市', '河南省');
INSERT INTO `city_info` VALUES (187, '宁波市', '浙江省');
INSERT INTO `city_info` VALUES (188, '宁德市', '福建省');
INSERT INTO `city_info` VALUES (189, '怒江傈僳族自治州', '云南省');
INSERT INTO `city_info` VALUES (190, '攀枝花市', '四川省');
INSERT INTO `city_info` VALUES (191, '盘锦市', '辽宁省');
INSERT INTO `city_info` VALUES (192, '平顶山市', '河南省');
INSERT INTO `city_info` VALUES (193, '平凉市', '甘肃省');
INSERT INTO `city_info` VALUES (194, '萍乡市', '江西省');
INSERT INTO `city_info` VALUES (195, '莆田市', '福建省');
INSERT INTO `city_info` VALUES (196, '濮阳市', '河南省');
INSERT INTO `city_info` VALUES (197, '普洱市', '云南省');
INSERT INTO `city_info` VALUES (198, '七台河市', '黑龙江省');
INSERT INTO `city_info` VALUES (199, '齐齐哈尔市', '黑龙江省');
INSERT INTO `city_info` VALUES (200, '黔东南苗族侗族自治州', '贵州省');
INSERT INTO `city_info` VALUES (201, '黔南布依族苗族自治州', '贵州省');
INSERT INTO `city_info` VALUES (202, '黔西南布依族苗族自治州', '贵州省');
INSERT INTO `city_info` VALUES (203, '钦州市', '广西壮族自治区');
INSERT INTO `city_info` VALUES (204, '秦皇岛市', '河北省');
INSERT INTO `city_info` VALUES (205, '青岛市', '山东省');
INSERT INTO `city_info` VALUES (206, '清远市', '广东省');
INSERT INTO `city_info` VALUES (207, '庆阳市', '甘肃省');
INSERT INTO `city_info` VALUES (208, '曲靖市', '云南省');
INSERT INTO `city_info` VALUES (209, '衢州市', '浙江省');
INSERT INTO `city_info` VALUES (210, '泉州市', '福建省');
INSERT INTO `city_info` VALUES (211, '日喀则地区', '西藏自治区');
INSERT INTO `city_info` VALUES (212, '日照市', '山东省');
INSERT INTO `city_info` VALUES (213, '三门峡市', '河南省');
INSERT INTO `city_info` VALUES (214, '三明市', '福建省');
INSERT INTO `city_info` VALUES (215, '三亚市', '海南省');
INSERT INTO `city_info` VALUES (216, '山南地区', '西藏自治区');
INSERT INTO `city_info` VALUES (217, '汕头市', '广东省');
INSERT INTO `city_info` VALUES (218, '汕尾市', '广东省');
INSERT INTO `city_info` VALUES (219, '商洛市', '陕西省');
INSERT INTO `city_info` VALUES (220, '商丘市', '河南省');
INSERT INTO `city_info` VALUES (221, '上饶市', '江西省');
INSERT INTO `city_info` VALUES (222, '韶关市', '广东省');
INSERT INTO `city_info` VALUES (223, '邵阳市', '湖南省');
INSERT INTO `city_info` VALUES (224, '绍兴市', '浙江省');
INSERT INTO `city_info` VALUES (225, '深圳市', '广东省');
INSERT INTO `city_info` VALUES (226, '沈阳市', '辽宁省');
INSERT INTO `city_info` VALUES (227, '十堰市', '湖北省');
INSERT INTO `city_info` VALUES (228, '石家庄市', '河北省');
INSERT INTO `city_info` VALUES (229, '石嘴山市', '宁夏回族自治区');
INSERT INTO `city_info` VALUES (230, '双鸭山市', '黑龙江省');
INSERT INTO `city_info` VALUES (231, '朔州市', '山西省');
INSERT INTO `city_info` VALUES (232, '四平市', '吉林省');
INSERT INTO `city_info` VALUES (233, '松原市', '吉林省');
INSERT INTO `city_info` VALUES (234, '苏州市', '江苏省');
INSERT INTO `city_info` VALUES (235, '宿迁市', '江苏省');
INSERT INTO `city_info` VALUES (236, '宿州市', '安徽省');
INSERT INTO `city_info` VALUES (237, '绥化市', '黑龙江省');
INSERT INTO `city_info` VALUES (238, '随州市', '湖北省');
INSERT INTO `city_info` VALUES (239, '遂宁市', '四川省');
INSERT INTO `city_info` VALUES (240, '塔城地区', '新疆维吾尔自治区');
INSERT INTO `city_info` VALUES (241, '台州市', '浙江省');
INSERT INTO `city_info` VALUES (242, '太原市', '山西省');
INSERT INTO `city_info` VALUES (243, '泰安市', '山东省');
INSERT INTO `city_info` VALUES (244, '泰州市', '江苏省');
INSERT INTO `city_info` VALUES (245, '唐山市', '河北省');
INSERT INTO `city_info` VALUES (246, '天水市', '甘肃省');
INSERT INTO `city_info` VALUES (247, '铁岭市', '辽宁省');
INSERT INTO `city_info` VALUES (248, '通化市', '吉林省');
INSERT INTO `city_info` VALUES (249, '通辽市', '内蒙古自治区');
INSERT INTO `city_info` VALUES (250, '铜川市', '陕西省');
INSERT INTO `city_info` VALUES (251, '铜陵市', '安徽省');
INSERT INTO `city_info` VALUES (252, '铜仁市', '贵州省');
INSERT INTO `city_info` VALUES (253, '吐鲁番地区', '新疆维吾尔自治区');
INSERT INTO `city_info` VALUES (254, '威海市', '山东省');
INSERT INTO `city_info` VALUES (255, '潍坊市', '山东省');
INSERT INTO `city_info` VALUES (256, '渭南市', '陕西省');
INSERT INTO `city_info` VALUES (257, '温州市', '浙江省');
INSERT INTO `city_info` VALUES (258, '文山壮族苗族自治州', '云南省');
INSERT INTO `city_info` VALUES (259, '乌海市', '内蒙古自治区');
INSERT INTO `city_info` VALUES (260, '乌兰察布市', '内蒙古自治区');
INSERT INTO `city_info` VALUES (261, '乌鲁木齐市', '新疆维吾尔自治区');
INSERT INTO `city_info` VALUES (262, '无锡市', '江苏省');
INSERT INTO `city_info` VALUES (263, '吴忠市', '宁夏回族自治区');
INSERT INTO `city_info` VALUES (264, '芜湖市', '安徽省');
INSERT INTO `city_info` VALUES (265, '梧州市', '广西壮族自治区');
INSERT INTO `city_info` VALUES (266, '武汉市', '湖北省');
INSERT INTO `city_info` VALUES (267, '武威市', '甘肃省');
INSERT INTO `city_info` VALUES (268, '西安市', '陕西省');
INSERT INTO `city_info` VALUES (269, '西宁市', '青海省');
INSERT INTO `city_info` VALUES (270, '西双版纳傣族自治州', '云南省');
INSERT INTO `city_info` VALUES (271, '锡林郭勒盟', '内蒙古自治区');
INSERT INTO `city_info` VALUES (272, '厦门市', '福建省');
INSERT INTO `city_info` VALUES (273, '咸宁市', '湖北省');
INSERT INTO `city_info` VALUES (274, '咸阳市', '陕西省');
INSERT INTO `city_info` VALUES (275, '湘潭市', '湖南省');
INSERT INTO `city_info` VALUES (276, '湘西土家族苗族自治州', '湖南省');
INSERT INTO `city_info` VALUES (277, '襄樊市', '湖北省');
INSERT INTO `city_info` VALUES (278, '孝感市', '湖北省');
INSERT INTO `city_info` VALUES (279, '忻州市', '山西省');
INSERT INTO `city_info` VALUES (280, '新乡市', '河南省');
INSERT INTO `city_info` VALUES (281, '新余市', '江西省');
INSERT INTO `city_info` VALUES (282, '信阳市', '河南省');
INSERT INTO `city_info` VALUES (283, '兴安盟', '内蒙古自治区');
INSERT INTO `city_info` VALUES (284, '邢台市', '河北省');
INSERT INTO `city_info` VALUES (285, '徐州市', '江苏省');
INSERT INTO `city_info` VALUES (286, '许昌市', '河南省');
INSERT INTO `city_info` VALUES (287, '宣城市', '安徽省');
INSERT INTO `city_info` VALUES (288, '雅安市', '四川省');
INSERT INTO `city_info` VALUES (289, '烟台市', '山东省');
INSERT INTO `city_info` VALUES (290, '延安市', '陕西省');
INSERT INTO `city_info` VALUES (291, '延边朝鲜族自治州', '吉林省');
INSERT INTO `city_info` VALUES (292, '盐城市', '江苏省');
INSERT INTO `city_info` VALUES (293, '扬州市', '江苏省');
INSERT INTO `city_info` VALUES (294, '阳江市', '广东省');
INSERT INTO `city_info` VALUES (295, '阳泉市', '山西省');
INSERT INTO `city_info` VALUES (296, '伊春市', '黑龙江省');
INSERT INTO `city_info` VALUES (297, '伊犁哈萨克自治州', '新疆维吾尔自治区');
INSERT INTO `city_info` VALUES (298, '宜宾市', '四川省');
INSERT INTO `city_info` VALUES (299, '宜昌市', '湖北省');
INSERT INTO `city_info` VALUES (300, '宜春市', '江西省');
INSERT INTO `city_info` VALUES (301, '益阳市', '湖南省');
INSERT INTO `city_info` VALUES (302, '银川市', '宁夏回族自治区');
INSERT INTO `city_info` VALUES (303, '鹰潭市', '江西省');
INSERT INTO `city_info` VALUES (304, '营口市', '辽宁省');
INSERT INTO `city_info` VALUES (305, '永州市', '湖南省');
INSERT INTO `city_info` VALUES (306, '榆林市', '陕西省');
INSERT INTO `city_info` VALUES (307, '玉林市', '广西壮族自治区');
INSERT INTO `city_info` VALUES (308, '玉树藏族自治州', '青海省');
INSERT INTO `city_info` VALUES (309, '玉溪市', '云南省');
INSERT INTO `city_info` VALUES (310, '岳阳市', '湖南省');
INSERT INTO `city_info` VALUES (311, '云浮市', '广东省');
INSERT INTO `city_info` VALUES (312, '运城市', '山西省');
INSERT INTO `city_info` VALUES (313, '枣庄市', '山东省');
INSERT INTO `city_info` VALUES (314, '湛江市', '广东省');
INSERT INTO `city_info` VALUES (315, '张家界市', '湖南省');
INSERT INTO `city_info` VALUES (316, '张家口市', '河北省');
INSERT INTO `city_info` VALUES (317, '张掖市', '甘肃省');
INSERT INTO `city_info` VALUES (318, '漳州市', '福建省');
INSERT INTO `city_info` VALUES (319, '昭通市', '云南省');
INSERT INTO `city_info` VALUES (320, '肇庆市', '广东省');
INSERT INTO `city_info` VALUES (321, '镇江市', '江苏省');
INSERT INTO `city_info` VALUES (322, '郑州市', '河南省');
INSERT INTO `city_info` VALUES (323, '中山市', '广东省');
INSERT INTO `city_info` VALUES (324, '中卫市', '宁夏回族自治区');
INSERT INTO `city_info` VALUES (325, '舟山市', '浙江省');
INSERT INTO `city_info` VALUES (326, '周口市', '河南省');
INSERT INTO `city_info` VALUES (327, '株洲市', '湖南省');
INSERT INTO `city_info` VALUES (328, '珠海市', '广东省');
INSERT INTO `city_info` VALUES (329, '驻马店市', '河南省');
INSERT INTO `city_info` VALUES (330, '资阳市', '四川省');
INSERT INTO `city_info` VALUES (331, '淄博市', '山东省');
INSERT INTO `city_info` VALUES (332, '自贡市', '四川省');
INSERT INTO `city_info` VALUES (333, '遵义市', '贵州省');
INSERT INTO `city_info` VALUES (334, '北京市', '北京市');
INSERT INTO `city_info` VALUES (335, '天津市', '天津市');
INSERT INTO `city_info` VALUES (336, '上海市', '上海市');
INSERT INTO `city_info` VALUES (337, '重庆市', '重庆市');

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
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '好乡镇宣传统计报表' ROW_FORMAT = DYNAMIC;

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
  `city_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '城市名称',
  `province_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '省名称',
  `pdesc` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '好乡镇宣传描述',
  `pfile_list` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '上传的图片等资源文件名称列表',
  `pbegin_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '开始宣传日期，默认提交日期',
  `pstate` int NULL DEFAULT NULL COMMENT '状态，0：已发布；-1：已取消',
  `pupdate_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改日期',
  PRIMARY KEY (`pid`) USING BTREE,
  INDEX `f1`(`puser_name` ASC) USING BTREE,
  INDEX `f2`(`type` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 35 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '好乡镇宣传信息表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of town_advocacy_info
-- ----------------------------
INSERT INTO `town_advocacy_info` VALUES (16, '郑州文化节', '民俗活动', 'Zhiend', '郑州', '郑州', '河南', '探索郑州的传统文化和美食', '87a83c90788245ccb4ced26be4bb395c.png', '2024-12-04 15:24:01', 0, '2024-12-07 22:44:13');
INSERT INTO `town_advocacy_info` VALUES (17, '开封历史游', '古建筑', 'You', '开封', '开封', '河南', '游览开封的古建筑，体验历史', '87a83c90788245ccb4ced26be4bb395c.png', '2024-12-04 15:24:01', 0, '2024-12-07 22:44:10');
INSERT INTO `town_advocacy_info` VALUES (18, '洛阳牡丹节', '自然风光秀丽', 'Zhiend', '洛阳', '洛阳', '河南', '欣赏洛阳牡丹，感受自然之美', '87a83c90788245ccb4ced26be4bb395c.png', '2024-12-04 15:24:01', 0, '2024-12-07 22:44:07');
INSERT INTO `town_advocacy_info` VALUES (19, '安阳文字之旅', '文化', 'You', '安阳', '安阳', '河南', '探索安阳甲骨文的起源', '87a83c90788245ccb4ced26be4bb395c.png', '2024-12-04 15:24:01', 0, '2024-12-07 22:44:04');
INSERT INTO `town_advocacy_info` VALUES (20, '新乡农业体验', '农家院', 'Zhiend', '新乡', '新乡', '河南', '体验新乡的农家生活和农产品', '87a83c90788245ccb4ced26be4bb395c.png', '2024-12-04 15:24:01', 0, '2024-12-07 22:44:02');
INSERT INTO `town_advocacy_info` VALUES (21, '南阳玉雕展', '特色小吃', 'You', '南阳', '南阳', '河南', '南阳玉雕艺术展示', '87a83c90788245ccb4ced26be4bb395c.png', '2024-12-04 15:24:01', 0, '2024-12-07 22:43:59');
INSERT INTO `town_advocacy_info` VALUES (23, '信阳茶文化节', '民俗活动', 'You', '信阳', '信阳', '河南', '体验信阳的茶文化和茶艺', '87a83c90788245ccb4ced26be4bb395c.png', '2024-12-04 15:24:01', 0, '2024-12-07 22:43:57');
INSERT INTO `town_advocacy_info` VALUES (28, '郑州文化节', ' 民俗活动', 'Zhiend', '中原区', '郑州1', '河南', '南阳玉雕艺术展示', '87a83c90788245ccb4ced26be4bb395c.png', '2024-12-07 01:31:07', 0, '2024-12-07 23:09:57');
INSERT INTO `town_advocacy_info` VALUES (29, '郑州文化节', '民俗活动', 'Zhiend', '中原区', '郑州', '河南', '南阳玉雕艺术展示', 'cc26cd083e4b4b539dd0fcb06330d96e.jpg', '2024-12-07 01:50:03', 0, '2024-12-07 22:51:02');
INSERT INTO `town_advocacy_info` VALUES (30, '郑州文化节', '民俗活动', 'Zhiend', '中原区', '郑州', '河南', '南阳玉雕艺术展示', '63869c9e5cc54080a56c2d4458abe8e2.jpg', '2024-12-07 01:51:29', 0, '2024-12-07 22:50:50');
INSERT INTO `town_advocacy_info` VALUES (31, '郑州文化节', '农家院', 'Zhiend', '中原区', '郑州', '河南', '南阳玉雕艺术展示', '5be88896dfb9476c810f599db6b452e7.jpg', '2024-12-07 01:56:18', 0, '2024-12-07 22:50:58');
INSERT INTO `town_advocacy_info` VALUES (32, '郑州文化节', '农家院', 'Zhiend', '中原区', '郑州', '河南', '南阳玉雕艺术展示', 'af44a4ceb986452891c59e93782a2e8b.mp4', '2024-12-07 20:44:59', 0, '2024-12-07 22:45:03');

-- ----------------------------
-- Table structure for town_support
-- ----------------------------
DROP TABLE IF EXISTS `town_support`;
CREATE TABLE `town_support`  (
  `sid` int NOT NULL AUTO_INCREMENT COMMENT '好乡镇宣传助力id',
  `suser_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '助力用户名',
  `pid` int NULL DEFAULT NULL COMMENT '对应的好乡镇宣传id',
  `stitle` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '助力标题',
  `sdesc` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '助力描述',
  `support_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建日期',
  `support_state` int NULL DEFAULT NULL COMMENT '状态，0：待接受；1：已接受；2：拒绝；3：取消',
  `update_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改日期',
  `sfile_list` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '上传的介绍图片等文件名称列表',
  PRIMARY KEY (`sid`) USING BTREE,
  INDEX `bid2`(`suser_name` ASC) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '好乡镇宣传助力信息表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of town_support
-- ----------------------------
INSERT INTO `town_support` VALUES (1, 'UserA', 16, '支持郑州文化节', '一起感受郑州的文化魅力', '2024-12-04 15:30:12', 0, '2024-12-07 23:19:48', '87a83c90788245ccb4ced26be4bb395c.png');
INSERT INTO `town_support` VALUES (2, 'UserB', 17, '开封历史游助力', '探索开封的历史古迹', '2024-12-04 15:30:12', 1, '2024-12-07 20:31:21', '87a83c90788245ccb4ced26be4bb395c.png');
INSERT INTO `town_support` VALUES (3, 'Zhiend', 18, '洛阳牡丹节赞助', '为洛阳牡丹节提供赞助', '2024-12-04 15:30:12', 2, '2024-12-08 12:47:00', '87a83c90788245ccb4ced26be4bb395c.png');
INSERT INTO `town_support` VALUES (4, 'Zhiend', 19, '安阳文字之旅支持', '支持安阳甲骨文的研究', '2024-12-04 15:30:12', 0, '2024-12-08 12:49:36', '87a83c90788245ccb4ced26be4bb395c.png');
INSERT INTO `town_support` VALUES (5, 'Zhiend', 20, '新乡农业体验助力', '助力新乡农业体验活动', '2024-12-04 15:30:12', 0, '2024-12-08 12:49:45', '87a83c90788245ccb4ced26be4bb395c.png');
INSERT INTO `town_support` VALUES (6, 'Zhiend', 21, '南阳玉雕展赞助', '为南阳玉雕展提供赞助', '2024-12-04 15:30:12', 0, '2024-12-08 12:49:50', '87a83c90788245ccb4ced26be4bb395c.png');
INSERT INTO `town_support` VALUES (7, 'Zhiend', 22, '商丘古城探秘支持', '支持商丘古城的探秘活动', '2024-12-04 15:30:12', 2, '2024-12-08 12:46:48', '87a83c90788245ccb4ced26be4bb395c.png');
INSERT INTO `town_support` VALUES (8, 'Zhiend', 23, '信阳茶文化节助力', '助力信阳茶文化节的举办', '2024-12-04 15:30:12', 1, '2024-12-08 12:46:44', '87a83c90788245ccb4ced26be4bb395c.png');
INSERT INTO `town_support` VALUES (10, 'Zhiend', 28, 'undefined', '1111', '2024-12-08 11:49:09', 0, '2024-12-08 12:46:49', '53984906f136448ba1ee2e5d0ce531bd.jpg');
INSERT INTO `town_support` VALUES (14, 'Zhiend', 28, '1', '1', '2024-12-08 12:39:44', 0, '2024-12-08 12:39:44', '718989a71db54056bfd12ea7aeec6d23.jpg');
INSERT INTO `town_support` VALUES (15, 'Zhiend', 28, '1', '1', '2024-12-08 12:47:53', 1, '2024-12-08 13:52:46', '1cbf5c17dbcd424b9483adc0ed7ad199.jpg');
INSERT INTO `town_support` VALUES (16, 'Zhiend', 29, '1', '1', '2024-12-08 12:47:58', 0, '2024-12-08 13:52:47', '67cf9435126b462a9ecaddbc0a87fa66.jpg');
INSERT INTO `town_support` VALUES (17, 'Zhiend', 31, '1', '1', '2024-12-08 12:48:00', 1, '2024-12-08 13:52:49', 'f3aac644e5a14575ae511e974e1fb95a.jpg');
INSERT INTO `town_support` VALUES (18, 'Zhiend', 32, '222', '22233333', '2024-12-08 14:39:32', 2, '2024-12-08 14:39:55', 'd9ad2295a87c4431a45768ef6232cb8d.png');

SET FOREIGN_KEY_CHECKS = 1;
