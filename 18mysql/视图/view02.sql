-- 视图的课堂练习

-- 三表联合查询，得到结果

CREATE VIEW emp_view03 
		AS 
		SELECT empno,ename,dname,grade
		FROM emp,dept,salgrade
		WHERE emp.deptno = dept.deptno AND (sal BETWEEN losal AND hisal)
		 
DESC emp_view03		
	
SELECT * FROM emp_view03
		
		
		
		
		
		
		
		
		