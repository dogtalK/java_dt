DROP DATABASE IF EXISTS PMproject;

CREATE DATABASE PMproject;

USE PMproject;

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
	`ep_id`	INT	NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`ep_name`	VARCHAR(20)	NOT NULL,
	`ep_email`	VARCHAR(50)	NOT NULL,
	`ep_phone_num`	VARCHAR(15)	NOT NULL,
	`ep_dm_num`	INT	NOT NULL DEFAULT 1,
	`ep_po_num`	INT	NOT NULL DEFAULT 1,
	`ep_st_num`	int	NOT NULL DEFAULT 1,
	`ep_leave`	int	NOT NULL DEFAULT 15,
    `ep_salay`	VARCHAR(255)	NOT NULL
);

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
	`dm_num`	INT	NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`dm_name`	VARCHAR(255)	NOT NULL
);

DROP TABLE IF EXISTS `position`;

CREATE TABLE `position` (
	`po_num`	INT	NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`po_name`	VARCHAR(255)	NOT NULL
);

DROP TABLE IF EXISTS `Leave`;

CREATE TABLE `Leave` (
	`le_num`	INT	NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`le_start_date`	DATE	NOT NULL,
	`le_end_date`	DATE	NOT NULL,
	`le_type`	VARCHAR(30)	NOT NULL,
	`le_ep_id`	INT	NOT NULL
);

DROP TABLE IF EXISTS `salaryHistory`;

CREATE TABLE `salaryHistory` (
	`sh_num`	INT	NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`sh_payday`	DATE	NOT NULL,
	`sh_ep_id`	INT	NOT NULL,
	`sh_pa_type`	VARCHAR(20)	NOT NULL,
    `sh_type_detail`	VARCHAR(20)	NOT NULL,
	`sh_salary`	INT	NOT NULL
);

DROP TABLE IF EXISTS `project`;

CREATE TABLE `project` (
	`pj_num`	INT	NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`pj_name`	VARCHAR(255)	NOT NULL,
	`pj_start_date`	DATE	NULL,
	`pj_end_date`	DATE	NULL,
	`pj_state`	VARCHAR(15)	NOT NULL
);

DROP TABLE IF EXISTS `Termination`;

CREATE TABLE `Termination` (
	`tm_num`	INT	NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`tm_date`	DATE	NOT NULL,
	`tm_return_date`	DATE	NULL,
	`tm_reason`	VARCHAR(30)	NOT NULL,
	`tm_ep_id`	INT	NOT NULL
);

DROP TABLE IF EXISTS `at_record`;

CREATE TABLE `at_record` (
	`ar_ad_num`	INT	NOT NULL,
	`ar_st_time`	TIME	NULL,
	`ar_end_time`	TIME	NULL
);

DROP TABLE IF EXISTS `attendance_type`;

CREATE TABLE `attendance_type` (
	`at_num`	INT	NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`at_type`	VARCHAR(15)	NOT NULL
);

DROP TABLE IF EXISTS `project_info`;

CREATE TABLE `project_info` (
	`pi_num`	INT	NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`pi_ep_id`	INT	NOT NULL,
	`pi_pj_num`	INT	NOT NULL,
	`pi_role`	VARCHAR(20)	NOT NULL
);

DROP TABLE IF EXISTS `status`;

CREATE TABLE `status` (
	`st_num`	INT	NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`st_type`	VARCHAR(20)	NOT NULL
);

DROP TABLE IF EXISTS `transfer`;

CREATE TABLE `transfer` (
	`tr_num`	INT	NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`tr_date`	DATE	NOT NULL,
    `tr_reason`	VARCHAR(30)	NOT NULL,
	`tr_ep_id`	INT	NOT NULL,
	`tr_dm_num`	INT	NOT NULL
);

DROP TABLE IF EXISTS `pay`;

CREATE TABLE `pay` (
	`pa_type`	VARCHAR(20)	NOT NULL PRIMARY KEY
);

DROP TABLE IF EXISTS `attendance`;

CREATE TABLE `attendance` (
	`ad_num`	INT	NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`ad_date`	DATE	NOT NULL,
    `ad_ep_id`	INT	NOT NULL,
    `ad_at_num`	INT	NOT NULL DEFAULT 1
);

ALTER TABLE `employee` ADD CONSTRAINT `FK_department_TO_employee_1` FOREIGN KEY (
	`ep_dm_num`
)
REFERENCES `department` (
	`dm_num`
);

ALTER TABLE `employee` ADD CONSTRAINT `FK_position_TO_employee_1` FOREIGN KEY (
	`ep_po_num`
)
REFERENCES `position` (
	`po_num`
);

ALTER TABLE `employee` ADD CONSTRAINT `FK_status_TO_employee_1` FOREIGN KEY (
	`ep_st_num`
)
REFERENCES `status` (
	`st_num`
);

ALTER TABLE `Leave` ADD CONSTRAINT `FK_employee_TO_Leave_1` FOREIGN KEY (
	`le_ep_id`
)
REFERENCES `employee` (
	`ep_id`
);

ALTER TABLE `salaryHistory` ADD CONSTRAINT `FK_employee_TO_salaryHistory_1` FOREIGN KEY (
	`sh_ep_id`
)
REFERENCES `employee` (
	`ep_id`
);

ALTER TABLE `salaryHistory` ADD CONSTRAINT `FK_pay_TO_salaryHistory_1` FOREIGN KEY (
	`sh_pa_type`
)
REFERENCES `pay` (
	`pa_type`
);

ALTER TABLE `Termination` ADD CONSTRAINT `FK_employee_TO_Termination_1` FOREIGN KEY (
	`tm_ep_id`
)
REFERENCES `employee` (
	`ep_id`
);

ALTER TABLE `at_record` ADD CONSTRAINT `FK_attendance_TO_at_record_1` FOREIGN KEY (
	`ar_ad_num`
)
REFERENCES `attendance` (
	`ad_num`
);

ALTER TABLE `project_info` ADD CONSTRAINT `FK_employee_TO_project_info_1` FOREIGN KEY (
	`pi_ep_id`
)
REFERENCES `employee` (
	`ep_id`
);

ALTER TABLE `project_info` ADD CONSTRAINT `FK_project_TO_project_info_1` FOREIGN KEY (
	`pi_pj_num`
)
REFERENCES `project` (
	`pj_num`
);

ALTER TABLE `transfer` ADD CONSTRAINT `FK_employee_TO_transfer_1` FOREIGN KEY (
	`tr_ep_id`
)
REFERENCES `employee` (
	`ep_id`
);

ALTER TABLE `transfer` ADD CONSTRAINT `FK_department_TO_transfer_1` FOREIGN KEY (
	`tr_dm_num`
)
REFERENCES `department` (
	`dm_num`
);

ALTER TABLE `attendance` ADD CONSTRAINT `FK_attendance_type_TO_attendance_1` FOREIGN KEY (
	`ad_at_num`
)
REFERENCES `attendance_type` (
	`at_num`
);

ALTER TABLE `attendance` ADD CONSTRAINT `FK_employee_TO_attendance_1` FOREIGN KEY (
	`ad_ep_id`
)
REFERENCES `employee` (
	`ep_id`
);

