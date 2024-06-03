#查询加强
#在mysql中，日期类型可以直接比较

SELECT * FROM emp
	WHERE hiredate <= '1992-01-01'
	
SELECT ename,sal FROM emp
	WHERE ename LIKE 'S%'
	
SELECT ename,sal FROM emp
	WHERE ename LIKE '__o%'
	
SELECT * FROM emp
	WHERE mgr IS NULL;
	
#查看表的结构
DESC emp

SELECT * FROM emp
	ORDER BY sal DESC
	
SELECT * FROM emp
	ORDER BY deptno ASC,
	sal DESC





