/*
Navicat MySQL Data Transfer

Source Server         : test1
Source Server Version : 50096
Source Host           : localhost:3306
Source Database       : labitemmanage

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2020-06-07 02:53:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for country
-- ----------------------------
DROP TABLE IF EXISTS `country`;
CREATE TABLE `country` (
  `id` int(11) NOT NULL auto_increment,
  `countryname` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of country
-- ----------------------------

-- ----------------------------
-- Table structure for device_teacher
-- ----------------------------
DROP TABLE IF EXISTS `device_teacher`;
CREATE TABLE `device_teacher` (
  `id` bigint(20) unsigned NOT NULL auto_increment,
  `device_id` varchar(20) NOT NULL COMMENT '设备ID',
  `teacher_id` varchar(20) NOT NULL COMMENT '老师ID',
  PRIMARY KEY  (`id`),
  KEY `device_id` (`device_id`),
  KEY `teacher_id` (`teacher_id`),
  CONSTRAINT `device_teacher_ibfk_2` FOREIGN KEY (`teacher_id`) REFERENCES `szu_teacher` (`teacher_id`),
  CONSTRAINT `device_teacher_ibfk_1` FOREIGN KEY (`device_id`) REFERENCES `szu_device` (`device_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1 COMMENT='设备与老师关联表';

-- ----------------------------
-- Records of device_teacher
-- ----------------------------

-- ----------------------------
-- Table structure for device_user
-- ----------------------------
DROP TABLE IF EXISTS `device_user`;
CREATE TABLE `device_user` (
  `id` bigint(20) unsigned NOT NULL auto_increment,
  `device_id` varchar(20) NOT NULL COMMENT '设备ID',
  `username` varchar(20) character set utf8 NOT NULL COMMENT '用户ID',
  `usetime` datetime NOT NULL,
  PRIMARY KEY  (`id`),
  KEY `device_id` (`device_id`),
  KEY `username` (`username`),
  CONSTRAINT `device_user_ibfk_2` FOREIGN KEY (`device_id`) REFERENCES `szu_device` (`device_id`),
  CONSTRAINT `device_user_ibfk_3` FOREIGN KEY (`username`) REFERENCES `szu_user` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1 COMMENT='设备与用户关联表';

-- ----------------------------
-- Records of device_user
-- ----------------------------
INSERT INTO `device_user` VALUES ('1', '1', '181027', '2020-06-02 17:25:18');

-- ----------------------------
-- Table structure for system_shiro_permission
-- ----------------------------
DROP TABLE IF EXISTS `system_shiro_permission`;
CREATE TABLE `system_shiro_permission` (
  `id` int(11) NOT NULL auto_increment,
  `description` varchar(255) default NULL,
  `name` varchar(255) default NULL,
  `url` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of system_shiro_permission
-- ----------------------------

-- ----------------------------
-- Table structure for system_shiro_role
-- ----------------------------
DROP TABLE IF EXISTS `system_shiro_role`;
CREATE TABLE `system_shiro_role` (
  `id` int(11) NOT NULL auto_increment,
  `description` varchar(255) default NULL,
  `name` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of system_shiro_role
-- ----------------------------

-- ----------------------------
-- Table structure for system_shiro_role_permissions
-- ----------------------------
DROP TABLE IF EXISTS `system_shiro_role_permissions`;
CREATE TABLE `system_shiro_role_permissions` (
  `role_id` int(11) NOT NULL,
  `permissions_id` int(11) NOT NULL,
  UNIQUE KEY `UK_9bgrr9y35k9deh6os7fq2hxjc` (`permissions_id`),
  KEY `FKid5g3kh3jhoj05a1jbt3gwxe9` (`role_id`),
  CONSTRAINT `FKid5g3kh3jhoj05a1jbt3gwxe9` FOREIGN KEY (`role_id`) REFERENCES `system_shiro_role` (`id`),
  CONSTRAINT `FKbcw322i3a5p5h7oxkj1np3num` FOREIGN KEY (`permissions_id`) REFERENCES `system_shiro_permission` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of system_shiro_role_permissions
-- ----------------------------

-- ----------------------------
-- Table structure for system_shiro_user
-- ----------------------------
DROP TABLE IF EXISTS `system_shiro_user`;
CREATE TABLE `system_shiro_user` (
  `id` int(11) NOT NULL auto_increment,
  `password` varchar(255) default NULL,
  `username` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of system_shiro_user
-- ----------------------------

-- ----------------------------
-- Table structure for system_shiro_user_roles
-- ----------------------------
DROP TABLE IF EXISTS `system_shiro_user_roles`;
CREATE TABLE `system_shiro_user_roles` (
  `shiro_user_id` int(11) NOT NULL,
  `roles_id` int(11) NOT NULL,
  UNIQUE KEY `UK_i8llcnohdpe9u5xfnba0g4jqy` (`roles_id`),
  KEY `FKj4gcmlp5wm0fapx9vuuois1mf` (`shiro_user_id`),
  CONSTRAINT `FKj4gcmlp5wm0fapx9vuuois1mf` FOREIGN KEY (`shiro_user_id`) REFERENCES `system_shiro_user` (`id`),
  CONSTRAINT `FK17tnfmqx52t71ct60elbg66rv` FOREIGN KEY (`roles_id`) REFERENCES `system_shiro_role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of system_shiro_user_roles
-- ----------------------------

-- ----------------------------
-- Table structure for szu_admin
-- ----------------------------
DROP TABLE IF EXISTS `szu_admin`;
CREATE TABLE `szu_admin` (
  `id` bigint(20) unsigned NOT NULL auto_increment,
  `adminname` varchar(20) character set utf8 NOT NULL COMMENT '管理员账户',
  `adminpassword` varchar(20) NOT NULL COMMENT '管理员密码',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1 COMMENT='管理系统-管理员表';

-- ----------------------------
-- Records of szu_admin
-- ----------------------------
INSERT INTO `szu_admin` VALUES ('1', 'admin', 'admin');
INSERT INTO `szu_admin` VALUES ('2', '1', '1');

-- ----------------------------
-- Table structure for szu_device
-- ----------------------------
DROP TABLE IF EXISTS `szu_device`;
CREATE TABLE `szu_device` (
  `id` bigint(20) unsigned NOT NULL auto_increment,
  `device_id` varchar(20) default NULL COMMENT '设备编号',
  `device_name` varchar(100) character set utf8 default NULL COMMENT '设备名称',
  `device_value` varchar(100) default NULL COMMENT '设备价格',
  `device_time` datetime default NULL COMMENT '设备购买时间',
  `device_remark` varchar(500) character set utf8 default NULL COMMENT '备注',
  PRIMARY KEY  (`id`),
  KEY `device_id` (`device_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1 COMMENT='设备表';

-- ----------------------------
-- Records of szu_device
-- ----------------------------
INSERT INTO `szu_device` VALUES ('1', '1', 'GTX1070显卡', '1500', '2020-06-02 16:51:30', '这个显卡  可以玩很多游戏，没有光追  可惜了');

-- ----------------------------
-- Table structure for szu_teacher
-- ----------------------------
DROP TABLE IF EXISTS `szu_teacher`;
CREATE TABLE `szu_teacher` (
  `id` bigint(20) unsigned NOT NULL auto_increment,
  `teacher_id` varchar(20) NOT NULL,
  `teacher_name` varchar(20) character set utf8 NOT NULL COMMENT '老师姓名',
  `mobile` varchar(20) NOT NULL COMMENT '手机号',
  `email` varchar(255) NOT NULL COMMENT '邮箱',
  `create_time` date NOT NULL default '0000-00-00' COMMENT '创建时间',
  `status` varchar(10) character set utf8 NOT NULL COMMENT '状态',
  PRIMARY KEY  (`id`),
  KEY `teacher_id` (`teacher_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1 COMMENT='管理系统-教师表';

-- ----------------------------
-- Records of szu_teacher
-- ----------------------------
INSERT INTO `szu_teacher` VALUES ('1', '5201', '陈剑勇', '111', '111', '2020-06-07', '1');

-- ----------------------------
-- Table structure for szu_user
-- ----------------------------
DROP TABLE IF EXISTS `szu_user`;
CREATE TABLE `szu_user` (
  `id` int(11) NOT NULL auto_increment,
  `username` varchar(20) NOT NULL,
  `password` varchar(40) NOT NULL,
  `userfullname` varchar(10) default NULL,
  `createtime` date default NULL,
  `isdeleted` varchar(2) default NULL,
  `sex` varchar(2) default NULL,
  `address` varchar(40) default NULL,
  PRIMARY KEY  (`id`),
  KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of szu_user
-- ----------------------------
INSERT INTO `szu_user` VALUES ('1', '181027', '123456', 'cs', '2020-06-02', null, '', null);

-- ----------------------------
-- Table structure for user2
-- ----------------------------
DROP TABLE IF EXISTS `user2`;
CREATE TABLE `user2` (
  `id` int(11) NOT NULL auto_increment,
  `address` varchar(255) default NULL,
  `createtime` datetime default NULL,
  `isdeleted` varchar(255) default NULL,
  `password` varchar(255) default NULL,
  `sex` varchar(255) default NULL,
  `userfullname` varchar(255) default NULL,
  `username` varchar(255) default NULL,
  `country_id` int(11) default NULL,
  PRIMARY KEY  (`id`),
  KEY `FK7pbuv6u730marax4lerumgy4s` (`country_id`),
  CONSTRAINT `FK7pbuv6u730marax4lerumgy4s` FOREIGN KEY (`country_id`) REFERENCES `country` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user2
-- ----------------------------
