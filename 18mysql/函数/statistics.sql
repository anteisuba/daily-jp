# 演示mysql的统计函数的使用
SELECT * FROM student;

SELECT COUNT(*) FROM student02;

SELECT COUNT(*) FROM student02
	WHERE math  > 90;
	
SELECT COUNT(*) FROM student02
	WHERE (math + english + chinese)  > 250;

CREATE TABLE t10 (
	name VARCHAR(20))
	
INSERT INTO t10 VALUES('tom');
INSERT INTO t10 VALUES('jack');
INSERT INTO t10 VALUES('marry');
INSERT INTO t10 VALUES(NULL);

SELECT * FROM t10;

SELECT COUNT(*) FROM t10;
SELECT COUNT(`name`) FROM t10;

#sum函数
SELECT SUM(math) FROM student02;

SELECT SUM(math),SUM(english),SUM(chinese) FROM student02

SELECT SUM(math + english + chinese) AS total_score FROM student02

SELECT SUM(math)/ COUNT(*) FROM student02;

#avg使用
SELECT AVG(math) FROM student02;

SELECT AVG(math + chinese + english) FROM student02;

# max和min的使用
SELECT MAX(math + english + chinese) AS max_score ,MIN(math + english + chinese) AS min_score FROM student02;

SELECT MAX(math),MIN(math) FROM student02;









