CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `user_password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL,
  `sex` int(2) DEFAULT NULL,
  `type` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;