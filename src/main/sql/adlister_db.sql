CREATE DATABASE IF NOT EXISTS adlister_db;

CREATE USER 'db_administrator'@'localhost' IDENTIFIED BY 'adminpassword';

GRANT CREATE, ALTER, INSERT, DROP ON adlister_db.* TO 'db_administrator'@'localhost';

CREATE TABLE table_name (
    column1_name data_type,
    column2_name data_type,
    ...
);

CREATE TABLE users (
    id int(50),
    username  VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
);

CREATE TABLE ads (
    id int(10),
    user_id VARCHAR(100) NOT NULL,
    title TEXT NOT NULL,
    password TEXT NOT NULL
);

FOREIGN KEY (user_id) references (user_id);