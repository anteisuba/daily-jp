#增强group by 的使用
SELECT COUNT(*) ,AVG(sal),job
	FROM emp 
	GROUP BY job;
	
SELECT COUNT(*),COUNT(comm)
	FROM emp;

SELECT COUNT(*),COUNT(IF(comm IS NULL,1,NULL))
	FROM emp;
	
SELECT COUNT(*),COUNT(*) - COUNT(comm)
	FROM emp;
	
SELECT COUNT(DISTINCT mgr)
	FROM emp;
	
SELECT MAX(sal) - MIN(sal)
	FROM emp;	
	
SELECT * FROM emp;


SELECT deptno,AVG(sal) AS avg_sal
	FROM emp
	GROUP BY deptno
	HAVING avg_sal > 1000
	ORDER BY avg_sal DESC
	LIMIT 0,2








