DROP TABLE cre;

CREATE TABLE crea (
	id INT,
	nam VARCHAR(32),
	sex CHAR(1),
	birthday DATE,
	entry_date DATETIME,
	job VARCHAR(32),
	salary DOUBLE,
	resume TEXT ) CHARSET utf8mb4 COLLATE utf8mb4_bin;
	
INSERT INTO crea 
	VALUES(100,'yan','男','2011-11-11','2011-11-10 11:11:11','巡山的',3000,'jieshao');
	
SELECT * FROM crea;