DROP USER IF EXISTS 'petuser'@'localhost';
CREATE USER 'petuser'@'localhost' IDENTIFIED BY 'petuser123';
GRANT ALL PRIVILEGES ON speakdb.* TO 'petuser'@'localhost';
FLUSH PRIVILEGES ;

DROP DATABASE IF EXISTS speakdb;
CREATE DATABASE speakdb;

CREATE TABLE [IF NOT EXISTS] speak_user (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR (100) NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR (100),

) ENGINE=INNODB;