SELECT * FROM dept

DESC dept
DESC emp
SELECT * FROM emp

SELECT dname 
		FROM dept;
		
SELECT ename,(sal + IFNULL(comm,0)) * 13 AS '年收入'
	FROM emp
	
SELECT ename,sal
	FROM emp
	WHERE sal > 2850
	
SELECT ename,sal 
	FROM emp
	WHERE sal < 1500 AND sal > 2850
	
-- 排序数据

SELECT ename,job,hiredate
		FROM emp
		WHERE hiredate >= '1991-02-01' AND hiredate <= '1991-05-01' 
		ORDER BY hiredate
		
-- 降序排序
SELECT ename,sal,comm
		FROM emp
		ORDER BY sal DESC
		







