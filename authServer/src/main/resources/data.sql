INSERT IGNORE INTO `spring`.`user` (`id`, `username`, `password`)
    VALUES ('1', 'vlad', '12345');

INSERT IGNORE INTO `spring`.`role` (`id`, `name`, `user`)  VALUES ('1', 'read', '1');
