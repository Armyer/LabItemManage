/*
Navicat MySQL Data Transfer

Source Server         : test1
Source Server Version : 50096
Source Host           : localhost:3306
Source Database       : szu

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2020-06-02 17:25:29
*/

SET FOREIGN_KEY_CHECKS=0;

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
INSERT INTO `device_teacher` VALUES ('1', '1', '5201');

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
-- Table structure for szu_admin
-- ----------------------------
DROP TABLE IF EXISTS `szu_admin`;
CREATE TABLE `szu_admin` (
  `id` bigint(20) unsigned NOT NULL auto_increment,
  `admin` varchar(20) character set utf8 NOT NULL COMMENT '管理员账户',
  `adminpassword` varchar(20) NOT NULL COMMENT '管理员密码',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1 COMMENT='管理系统-管理员表';

-- ----------------------------
-- Records of szu_admin
-- ----------------------------
INSERT INTO `szu_admin` VALUES ('1', 'admin', 'admin');

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
  `create_time` bigint(20) NOT NULL default '0' COMMENT '创建时间',
  `status` char(10) character set utf8 NOT NULL COMMENT '状态',
  PRIMARY KEY  (`id`),
  KEY `teacher_id` (`teacher_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1 COMMENT='管理系统-教师表';

-- ----------------------------
-- Records of szu_teacher
-- ----------------------------
INSERT INTO `szu_teacher` VALUES ('1', '5201', '陈剑勇', '0000', '0000', '0', '正常');
INSERT INTO `szu_teacher` VALUES ('2', '5202', '林秋镇', '1111', '1111', '0', '正常');
INSERT INTO `szu_teacher` VALUES ('3', '5203', '罗', '222', '222', '0', '正常');

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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of szu_user
-- ----------------------------
INSERT INTO `szu_user` VALUES ('1', '181027', '123456', 'cs', '2020-06-02', null, '', null);
