SELECT * FROM 
		emp
		WHERE deptno = 30
		
SELECT ename,empno,deptno,job FROM 
		emp
		WHERE job = 'CLERK'
		
SELECT * FROM 
		emp
		WHERE IFNULL(comm) > sal
		
SELECT * FROM 
		emp
		WHERE IFNULL(comm) > sal * 0.6
		
SELECT * FROM 
		emp 
		WHERE (deptno = 10 AND job = 'MANAGER') 
		OR (deptno = 20 AND job = 'CLERK')


SELECT * FROM 
		emp 
		WHERE (deptno = 10 AND job = 'MANAGER') 
		OR (deptno = 20 AND job = 'CLERK')
		OR (job != 'MANAGER' AND job != 'CLERK' AND sal >= 2000 )
		
SELECT DISTINCT job FROM emp
		WHERE comm IS NOT NULL 

SELECT * FROM emp
		WHERE comm IS NULL OR IFNULL(comm,0) < 100

-- last_day 可以反应该日期所在月份的最后一天
SELECT LAST_DAY(NOW()) - 2

SELECT * FROM emp
		WHERE LAST_DAY(hiredate) - 2 == hiredate 
		
SELECT * FROM emp
		WHERE DATE_ADD(hiredate,INTERVAL 12 YEAR) < NOW()
		
SELECT CONCAT(LCASE(SUBSTRING(ename,1,1)),SUBSTRING(ename,2)) FROM emp;

SELECT * FROM emp
		WHERE LENGTH(ename) = 5
		
SELECT * FROM emp
		WHERE ename NOT LIKE '%R%'
		
SELECT LEFT(ename,3) 
			FROM emp
	
-- 替换
SELECT REPLACE(ename,'A','a')
	FROM emp

-- 满十年员工的姓名和受雇日期
SELECT ename,hiredate 
	FROM emp
	WHERE DATE_ADD(hiredate,INTERVAL 10 YEAR) <= NOW()
	
SELECT ename,hiredate 
	FROM emp
	ORDER BY hiredate
	
SELECT ename ,job,sal
	FROM emp
	ORDER BY job DESC,sal

SELECT ename,CONCAT(YEAR(hiredate),' ',MONTH(hiredate))
	FROM emp
	ORDER BY MONTH(hiredate),YEAR(hiredate)
	
SELECT FLOOR(sal / 30),sal / 30
	FROM emp;
	
SELECT * FROM emp
	WHERE MONTH(hiredate) = 2;
	
SELECT ename,DATEDIFF(NOW(),hiredate)
	FROM emp
	
SELECT * FROM emp
	WHERE ename LIKE '%A%'
	
SELECT ename,FLOOR(DATEDIFF(NOW(),hiredate) / 365) AS "工作年",
	FLOOR(DATEDIzFF(NOW(),hiredate) % 365 / 31) AS "工作月",
	DATEDIFF(NOW(),hiredate) % 31 AS "工作天"
	FROM emp
	

	







		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	