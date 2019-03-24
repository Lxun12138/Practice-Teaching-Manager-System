/*
SQLyog Enterprise v12.5.1 (64 bit)
MySQL - 5.7.23 : Database - ptms
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ptms` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ptms`;

/*Table structure for table `class` */

DROP TABLE IF EXISTS `class`;

CREATE TABLE `class` (
  `class_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '班级id',
  `college` varchar(20) NOT NULL COMMENT '学院',
  `profession` varchar(20) NOT NULL COMMENT '专业',
  `classes` varchar(20) NOT NULL COMMENT '班级',
  `class_num` int(11) NOT NULL COMMENT '班级人数',
  PRIMARY KEY (`class_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `class` */

/*Table structure for table `course` */

DROP TABLE IF EXISTS `course`;

CREATE TABLE `course` (
  `course_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '课程id',
  `course_name` varchar(20) NOT NULL COMMENT '课程名称',
  `course_introduction` varchar(100) DEFAULT NULL COMMENT '课程介绍',
  `course_number` int(11) NOT NULL COMMENT '课时',
  `course_credit` int(11) DEFAULT NULL COMMENT '学分',
  PRIMARY KEY (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `course` */

/*Table structure for table `course_time_schedule` */

DROP TABLE IF EXISTS `course_time_schedule`;

CREATE TABLE `course_time_schedule` (
  `sche_id` int(11) NOT NULL COMMENT '计划id',
  `emp_course_id` int(11) NOT NULL COMMENT '教师课程信息id',
  `time_id` int(11) NOT NULL COMMENT '节次id',
  `lab_id` int(11) NOT NULL COMMENT '实验室id',
  `class_id` int(11) NOT NULL COMMENT '班级id',
  PRIMARY KEY (`sche_id`),
  KEY `time_id` (`time_id`),
  KEY `emp_course_id` (`emp_course_id`),
  KEY `class_id` (`class_id`),
  KEY `lab_id` (`lab_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `course_time_schedule` */

/*Table structure for table `course_type` */

DROP TABLE IF EXISTS `course_type`;

CREATE TABLE `course_type` (
  `course_type_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '课时类型id',
  `course_id` int(11) NOT NULL COMMENT '课程id',
  `course_type` int(1) NOT NULL COMMENT '课时类型（0理论课 1实践课）',
  PRIMARY KEY (`course_type_id`),
  KEY `course_id` (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `course_type` */

/*Table structure for table `emp_class` */

DROP TABLE IF EXISTS `emp_class`;

CREATE TABLE `emp_class` (
  `emp_class_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '学生老师——班级表',
  `emp_id` int(11) NOT NULL COMMENT '学生、老师id',
  `class_id` int(11) NOT NULL COMMENT '班级id',
  PRIMARY KEY (`emp_class_id`),
  KEY `emp_id` (`emp_id`),
  KEY `class_id` (`class_id`),
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `emp_class` */

/*Table structure for table `emp_course` */

DROP TABLE IF EXISTS `emp_course`;

CREATE TABLE `emp_course` (
  `emp_course_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '教师任课信息表id',
  `emp_id` int(11) NOT NULL COMMENT '教师id',
  `course_id` int(11) NOT NULL COMMENT '课程id',
  PRIMARY KEY (`emp_course_id`),
  KEY `emp_id` (`emp_id`),
  KEY `course_id` (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `emp_course` */

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `emp_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '人员id',
  `emp_no` varchar(20) NOT NULL COMMENT '人员编号',
  `emp_pass` varchar(20) NOT NULL COMMENT '登录密码',
  `emp_name` varchar(10) NOT NULL COMMENT '姓名',
  `emp_tel_num` bigint(20) DEFAULT NULL COMMENT '电话',
  `emp_age` int(10) DEFAULT NULL COMMENT '年龄',
  `emp_sex` varchar(10) DEFAULT NULL COMMENT '性别',
  `emp_address` varchar(100) DEFAULT NULL COMMENT '地址',
  `emp_email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `emp_department` varchar(100) NOT NULL COMMENT '院系',
  `emp_flag` int(10) NOT NULL COMMENT '类型（0教务处 1实验室管理员 2代课老师 3学生）',
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `employee` */

/*Table structure for table `lab_emp` */

DROP TABLE IF EXISTS `lab_emp`;

CREATE TABLE `lab_emp` (
  `lab_emp_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '实验室_管理人员id',
  `lab_id` int(11) NOT NULL COMMENT '实验室id',
  `emp_id` int(11) NOT NULL COMMENT '管理员id',
  PRIMARY KEY (`lab_emp_id`),
  KEY `lab_id` (`lab_id`),
  KEY `emp_id` (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `lab_emp` */

/*Table structure for table `laboratory` */

DROP TABLE IF EXISTS `laboratory`;

CREATE TABLE `laboratory` (
  `lab_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '实验室id',
  `lab_no` varchar(11) NOT NULL COMMENT '实验室编号',
  `lab_name` varchar(50) NOT NULL COMMENT '实验室名称',
  `lab_max_num` int(10) NOT NULL COMMENT '实验室仪器数量',
  `lab_introduction` varchar(100) DEFAULT NULL COMMENT '实验室介绍',
  `lab_flag` int(10) NOT NULL DEFAULT '0' COMMENT '实验室开放情况（0开放 1关闭）',
  PRIMARY KEY (`lab_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `laboratory` */

/*Table structure for table `time` */

DROP TABLE IF EXISTS `time`;

CREATE TABLE `time` (
  `time_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '时间表',
  `time_academic_year` varchar(20) NOT NULL COMMENT '学年',
  `time_semester` int(10) NOT NULL COMMENT '学期',
  `time_week` int(10) NOT NULL COMMENT '星期',
  `time_class` int(11) NOT NULL COMMENT '节次',
  PRIMARY KEY (`time_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `time` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
