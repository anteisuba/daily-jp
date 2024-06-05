-- unique的使用


CREATE TABLE t19
	(id INT,
	name VARCHAR(32),
	enmail VARCHAR(32),
	PRIMARY KEY(id,name));

CREATE TABLE t20
	(id INT UNIQUE,  #表示id列是不可重复的
	name VARCHAR(32),
	enmail VARCHAR(32));

INSERT INTO t20 
	VALUES(1,'jack','jack@shou.com');

INSERT INTO t20 
	VALUES(1,'tom','tom@shou.com');
	
INSERT INTO t20 
	VALUES(NULL,'jack','jack@shou.com');
	
DESC t20


















