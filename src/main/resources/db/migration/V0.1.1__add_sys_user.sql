
-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
                             `uid` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
                             `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户名',
                             `nick_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '昵称',
                             `phone` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '手机号',
                             `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '邮箱',
                             `create_time` bigint(50) NULL DEFAULT NULL COMMENT '创建时间',
                             `update_time` bigint(50) NULL DEFAULT NULL COMMENT '更新时间',
                             `create_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '创建人',
                             `update_by` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '更新人',
                             PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('123', 'pony-admin', 'Pony', '13200000000', 'm_zhifu@163.com', NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
