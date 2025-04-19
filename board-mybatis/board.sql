CREATE TABLE `board` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`subject` VARCHAR(100) NULL DEFAULT NULL COLLATE 'utf8mb4_uca1400_ai_ci',
	`content` TEXT NULL DEFAULT NULL COLLATE 'utf8mb4_uca1400_ai_ci',
	`regdate` DATETIME NULL DEFAULT current_timestamp(),
	`hit` INT(11) NULL DEFAULT '0',
	PRIMARY KEY (`id`) USING BTREE
)
COLLATE='utf8mb4_uca1400_ai_ci'
ENGINE=InnoDB
AUTO_INCREMENT=5
;