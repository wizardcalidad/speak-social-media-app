DROP USER IF EXISTS 'petuser'@'localhost';
CREATE USER 'petuser'@'localhost' IDENTIFIED BY 'petuser123';
GRANT ALL PRIVILEGES ON speakdb.* TO 'petuser'@'localhost';
FLUSH PRIVILEGES ;

DROP DATABASE IF EXISTS speakdb;
CREATE DATABASE speakdb;
ENGINE=INNODB;

-- CREATE TABLE [IF NOT EXISTS] speak_user (
--     id INT AUTO_INCREMENT PRIMARY KEY,
--     username VARCHAR (100) NOT NULL,
--     first_name VARCHAR(50) NOT NULL,
--     last_name VARCHAR(50) NOT NULL,
--     email VARCHAR (100) NOT NULL,
--     password VARCHAR (200) NOT NULL,
--     phone_number VARCHAR (20) NULL,
--     address VARCHAR (300) NULL,
--     gender VARCHAR (10) NULL,
--     date_of_birth DATE NOT NULL,
--     date_created TIMESTAMP,
--
-- ) ENGINE=INNODB;