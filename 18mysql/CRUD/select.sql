# select 语句 【重点 难点】

CREATE TABLE student02 (
	id INT NOT NULL DEFAULT 1,
	name VARCHAR(20) NOT NULL DEFAULT' ',
	chinese FLOAT NOT NULL DEFAULT 0.0,
	english FLOAT NOT NULL DEFAULT 0.0,
	math FLOAT NOT NULL DEFAULT 0.0);

SELECT * FROM student02;

INSERT INTO student02(id,name,chinese,english,math) VALUES(1,'yan',89,78,90);
INSERT INTO student02(id,name,chinese,english,math) VALUES(2,'zhan',67,98,56);
INSERT INTO student02(id,name,chinese,english,math) VALUES(3,'song',87,78,77);
INSERT INTO student02(id,name,chinese,english,math) VALUES(4,'guan',88,98,90);
INSERT INTO student02(id,name,chinese,english,math) VALUES(5,'zhao',82,84,45);
INSERT INTO student02(id,name,chinese,english,math) VALUES(6,'ou',55,85,45);
INSERT INTO student02(id,name,chinese,english,math) VALUES(7,'yang',39,78,90);


#查询表中所有学生的姓名和对应的英语成绩
SELECT `name`,english FROM student02;
#过滤表中的重复数据 distinct
SELECT DISTINCT english FROM student02;
#要查询的记录，每个字段都相同，才会去重
SELECT DISTINCT `name` ,english FROM student02;














