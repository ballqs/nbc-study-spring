CREATE TABLE `member` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `email` varchar(200) NOT NULL,
    `name` varchar(20) NOT NULL,
    `is_deleted` tinyint(1) NOT NULL DEFAULT 0,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci
;