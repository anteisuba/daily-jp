#多表查询
SELECT deptno,AVG(sal) AS avg_sal
	FROM emp
	GROUP BY deptno
	HAVING avg_sal > 1000
	ORDER BY avg_sal DESC
	LIMIT 0,2 #前面两行

#雇员工资及所在的部门的名字
#雇员名，雇员工资来自emp表
#部门名字来自dept表

SELECT ename,sal,dname,emp.deptno
  FROM emp,dept
	WHERE emp.deptno = dept.deptno AND emp.deptno = 20
	
SELECT ename,sal,grade FROM emp,salgrade
	WHERE sal BETWEEN losal and hisal;



	
