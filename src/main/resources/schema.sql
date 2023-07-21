CREATE TABLE `requisitions` (
  `id` int NOT NULL,
  `name` varchar(250) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `datesubmitted` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;