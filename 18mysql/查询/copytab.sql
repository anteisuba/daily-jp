#表的复制

CREATE TABLE my_tab01
	(id INT,
	name VARCHAR(32),
	sal DOUBLE,
	job VARCHAR(32),
	deptno INT);
DESC my_tab01
SELECT * FROM my_tab01

-- 1 先把emp表的记录复制到 my_tab01
INSERT INTO my_tab01 
		(id,name,sal,job,deptno)
		SELECT empno,ename,sal,job,deptno FROM emp;

-- 2 自我复制
INSERT INTO my_tab01
	SELECT * FROM my_tab01;

SELECT COUNT(*) FROM my_tab01;

-- 去重


CREATE TABLE my_tab02 LIKE emp;  #把cmp表的结构复制到my_tab02

DESC my_tab02;

INSERT INTO my_tab02
	SELECT * FROM emp;

SELECT * FROM my_tab02;
-- 先创建my_tab，该表的结构和my_tab02一样
-- 把my_tab的记录，通过distanct关键字处理后，把记录复制到my_tmp
-- 清除掉my_tab02记录，把mt_tmp表的记录复制到my_tab02
-- drop 掉 临时表my_tmp
CREATE TABLE my_tmp01 LIKE my_tab02

INSERT INTO my_tmp01
	SELECT DISTINCT * FROM my_tab02;

SELECT * FROM my_tmp01

DELETE FROM my_tab02;

INSERT INTO my_tab02
	SELECT * FROM my_tmp01;

DROP TABLE my_tmp01;









