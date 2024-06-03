#演示group by + having
CREATE TABLE dept(
	deptno MEDIUMINT UNSIGNED NOT NULL DEFAULT 0,
	dname VARCHAR(20) NOT NULL DEFAULT "",
	loc VARCHAR(13) NOT NULL DEFAULT "");
	
INSERT INTO dept VALUES
	(10,'ACCOUNTING','NEW YORK'),
	(20,'RESEARCH','DALLAS'), 
	(30,'SALES','CHICAGO'),
	(40,'OPERATIONS','BOSTON')
	
SELECT * FROM dept;

CREATE TABLE emp 
	(empno MEDIUMINT UNSIGNED NOT NULL DEFAULT 0,
	ename VARCHAR(20) NOT NULL DEFAULT "",
	job VARCHAR(9) NOT NULL DEFAULT "",
	mgr MEDIUMINT UNSIGNED,
	hiredate DATE NOT NULL,
	sal DECIMAL(7,2) NOT NULL,
	comm DECIMAL(7,2) ,
	deptno MEDIUMINT UNSIGNED NOT NULL DEFAULT 0);
	
#添加测试数据
INSERT INTO emp VALUES 
	(7369,'SMITH','CLERK',7902,'1990-12-17',800.00,NULL,20),
	(7499,'ALLEN','SALESMAN',7698,'1991-02-20',1600.00,300.00,30),
	(7521,'WARD','SALESMAN',7698,'1991-02-22',1250.00,500.00,30),
	(7566,'JONES','MANAGER',7839,'1991-04-02',2975.00,NULL,20);
	
SELECT * FROM emp;
	
#如何显示每个部门的平均工资和最高工资
SELECT AVG(sal),MAX(sal),deptno
	FROM emp GROUP BY deptno;

SELECT AVG(sal),MIN(sal),deptno,job 
	FROM emp GROUP BY deptno,job ;
	
SELECT AVG(sal),depno
	FROM emp GROUP BY deptno HAVING AVG(sal) < 2000;

SELECT AVG(sal) AS avg_sal,depno
	FROM emp GROUP BY deptno HAVING avg_sal < 2000;


	



	
	
	 




