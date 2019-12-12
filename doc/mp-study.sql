/*
 Navicat Premium Data Transfer

 Source Server         : local_mysql
 Source Server Type    : MySQL
 Source Server Version : 80013
 Source Host           : localhost:3306
 Source Schema         : mp-study

 Target Server Type    : MySQL
 Target Server Version : 80013
 File Encoding         : 65001

 Date: 12/12/2019 08:46:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `create_by` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_by` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `age` int(3) NULL DEFAULT NULL,
  `version` int(6) NULL DEFAULT 0,
  `tenant_id` int(2) NULL DEFAULT NULL,
  `del_flag` tinyint(1) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, NULL, '2019-12-12 08:42:08', '张三', NULL, '张三', 12, 0, 1, 0);
INSERT INTO `t_user` VALUES (2, NULL, '2019-12-07 08:42:42', '李四', NULL, '李四', 22, 0, 1, 0);
INSERT INTO `t_user` VALUES (3, NULL, '2019-12-02 08:43:03', '王五', NULL, '王五', 32, 0, 1, 0);
INSERT INTO `t_user` VALUES (4, NULL, '2019-12-02 08:44:06', '赵六', NULL, '赵六', 22, 0, 2, 0);
INSERT INTO `t_user` VALUES (5, NULL, '2019-12-10 08:44:41', '孙七', NULL, '孙七', 66, 0, 2, 0);

SET FOREIGN_KEY_CHECKS = 1;
