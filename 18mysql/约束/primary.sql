#主键使用

CREATE TABLE t17
	(id INT PRIMARY KEY,
	name VARCHAR(32),
	email VARCHAR(32));

-- 主键列的值是不可以重复的
INSERT INTO t17
	VALUES(1,'jack','jack@souhu.com');
	
INSERT INTO t17
	VALUES(2,'tom','tom@souhu.com');
	
INSERT INTO t17
	VALUES(1,'yan','yan@souhu.com');
	
INSERT into t17
	VALUES(NULL,'hsp','hsp@souhu.com');
	
#复合主键(id 和name做成复合主键
CREATE TABLE t18
	(id INT,
	name VARCHAR(32),
	enmail VARCHAR(32),
	PRIMARY KEY(id,name));

DESC t18







	