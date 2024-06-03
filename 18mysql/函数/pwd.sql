#可以查看登录到mysql的有哪些用户，以及登录的IP
SELECT USER() FROM DUAL;
#查询当前使用的数据库名称
SELECT DATABASE();
#为字符串算出一个MD5 32的字符串，常用用户密码加密
SELECT MD5('hsp') FROM DUAL;
SELECT LENGTH(MD5('hsp')) FROM DUAL;
#演示用户表，存放密码时，是md5
CREATE TABLE users04 
	(id INT,
	name VARCHAR(32) NOT NULL DEFAULT '',
	pwd CHAR(32) NOT NULL DEFAULT '');
	

INSERT INTO users04
	VALUES(100,'yang',MD5('qazyang'));
SELECT * FROM users04;	
SELECT * FROM users04
	WHERE `name` = 'yang' AND pwd = MD5('qazyang');
#PASSWORD(str) 加密函数
SELECT PASSWORD('yang') FROM DUAL;
SELECT * FROM mysql.user
#流程控制
SELECT IF(TRUE,'北京','上海') FROM DUAL;

SELECT IFNULL(NULL,'yan') FROM DUAL;

SELECT CASE
	WHEN TRUE THEN 'jack' 
	WHEN FALSE THEN 'tom'
	ELSE 'marry' END

SELECT ename, IF(comm IS NULL , 0.0 , comm)
	FROM emp;

SELECT ename, IFNULL(comm,0.0) 
	FROM emp;

SELECT ename,(SELECT CASE
	WHEN job = 'CLERK' THEN '职员' 
	WHEN job = 'MANAGER' THEN '经理'
	WHEN job = 'SALESMAN' THEN '销售人员'
	ELSE job END) AS '工作名称'
	FROM emp;
CREATE TABLE salgrade
	(grade INT,
	losal INT,
	hisal INT);

INSERT INTO salgrade VALUES(1,700,1200);
INSERT INTO salgrade VALUES(2,1201,1400);
INSERT INTO salgrade VALUES(3,1401,2000);
INSERT INTO salgrade VALUES(4,2001,3000);
INSERT INTO salgrade VALUES(5,3001,9999);





SELECT * FROM emp;
SELECT * FROM dept;
SELECT * FROM salgrade;
















