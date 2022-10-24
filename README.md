# mybatis-reading

DDL

```sql
CREATE TABLE `subjects` (
  `id` int NOT NULL,
  `name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '科目',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


CREATE TABLE `users` (
  `id` int NOT NULL,
  `name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


CREATE TABLE `score` (
  `id` int NOT NULL,
  `user_id` int DEFAULT NULL,
  `subject_id` int DEFAULT NULL,
  `score` tinyint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


INSERT INTO `test`.`score` (`id`, `user_id`, `subject_id`, `score`) VALUES (1, 1, 1, 76);
INSERT INTO `test`.`score` (`id`, `user_id`, `subject_id`, `score`) VALUES (2, 1, 2, 32);
INSERT INTO `test`.`score` (`id`, `user_id`, `subject_id`, `score`) VALUES (3, 1, 3, 67);
INSERT INTO `test`.`score` (`id`, `user_id`, `subject_id`, `score`) VALUES (4, 1, 4, 12);
INSERT INTO `test`.`score` (`id`, `user_id`, `subject_id`, `score`) VALUES (5, 2, 1, 42);
INSERT INTO `test`.`score` (`id`, `user_id`, `subject_id`, `score`) VALUES (6, 2, 2, 27);
INSERT INTO `test`.`score` (`id`, `user_id`, `subject_id`, `score`) VALUES (7, 2, 3, 99);
INSERT INTO `test`.`score` (`id`, `user_id`, `subject_id`, `score`) VALUES (8, 2, 4, 12);
INSERT INTO `test`.`score` (`id`, `user_id`, `subject_id`, `score`) VALUES (9, 3, 1, 89);
INSERT INTO `test`.`score` (`id`, `user_id`, `subject_id`, `score`) VALUES (10, 3, 2, 98);
INSERT INTO `test`.`score` (`id`, `user_id`, `subject_id`, `score`) VALUES (11, 3, 3, 90);
INSERT INTO `test`.`score` (`id`, `user_id`, `subject_id`, `score`) VALUES (12, 3, 4, 97);


INSERT INTO `test`.`subjects` (`id`, `name`) VALUES (1, 'java');
INSERT INTO `test`.`subjects` (`id`, `name`) VALUES (2, 'C');
INSERT INTO `test`.`subjects` (`id`, `name`) VALUES (3, 'C#');
INSERT INTO `test`.`subjects` (`id`, `name`) VALUES (4, 'Python');



INSERT INTO `test`.`users` (`id`, `name`) VALUES (1, '沸羊羊');
INSERT INTO `test`.`users` (`id`, `name`) VALUES (2, '懒羊羊');
INSERT INTO `test`.`users` (`id`, `name`) VALUES (3, '喜羊羊');

```