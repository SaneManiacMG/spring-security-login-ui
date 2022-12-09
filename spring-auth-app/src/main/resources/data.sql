CREATE TABLE users (
   username VARCHAR(45) NOT NULL , password VARCHAR(45) NOT NULL ,
   account_non_locked TINYINT NOT NULL DEFAULT 1 ,
   PRIMARY KEY (username)
);

INSERT INTO users(username,password,account_non_locked)
VALUES ('user','12345', true);