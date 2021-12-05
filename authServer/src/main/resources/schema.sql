CREATE TABLE IF NOT EXISTS `spring`.`user`(
    `id` int not null auto_increment,
    `username` varchar(45) not null,
    `password` varchar(2000) not null,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `spring`.`role` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(45) NOT NULL,
    `user` INT NOT NULL,
PRIMARY KEY (`id`));

