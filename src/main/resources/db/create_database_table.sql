DROP USER IF EXISTS 'wizardcalidad'@'localhost';
CREATE USER 'wizardcalidad'@'localhost' IDENTIFIED BY 'wizardcalidad';
GRANT ALL PRIVILEGES ON speak.* TO 'wizardcalidad'@'localhost';
FLUSH PRIVILEGES ;

DROP DATABASE IF EXISTS speak;
CREATE DATABASE speak;
ENGINE=INNODB;

CREATE TABLE [IF NOT EXISTS] speak_user (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR (100) NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR (100) NOT NULL,
    password VARCHAR (200) NOT NULL,
    phone_number VARCHAR (20) NULL,
    address VARCHAR (300) NULL,
    gender VARCHAR (10) NULL,
    date_of_birth DATE NOT NULL,
    date_created TIMESTAMP,

) ENGINE=INNODB;