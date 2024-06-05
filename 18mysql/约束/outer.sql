-- 外连接
-- 无法显示没有员工的部门

SELECT dname,ename,job 
	FROM emp,dept
	WHERE emp.deptno = dept.deptno
	ORDER BY dname
	
SELECT * FROM dept;

CREATE TABLE stu (
	id INT,
	name VARCHAR(32));
DROP TABLE stu
INSERT INTO stu VALUES
	(1,'jack'),
	(2,'tom'),
	(3,'kity'),
	(4,'nono');
SELECT * FROM stu;
CREATE TABLE exam(
	id INT,
	grade INT);
	
INSERT INTO exam VALUES
	(1,56),
	(2,76),
	(11,8);	
	
SELECT * FROM exam;

# 使用左连接，显示所有人的成绩，如果没有成绩，也要显示该人的姓名和id号，成绩显示为空

SELECT `name`,stu.id,grade
	FROM stu,exam
	WHERE stu.id = exam.id;

#左外连接
SELECT `name`,stu.id,grade
	FROM stu LEFT JOIN exam
	ON stu.id = exam.id
	
#右外连接 
SELECT `name`,stu.id,grade
	FROM stu RIGHT JOIN exam
	ON stu.id = exam.id

SELECT dname,ename,job
	FROM dept LEFT JOIN emp
	ON dept.deptno = emp.deptno
	










