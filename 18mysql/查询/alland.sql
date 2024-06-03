#all和any的使用
#工资显示比部门30的所有员工的工资高的员工的姓名，工资和部门号
SELECT ename,sal,deptno
		FROM emp
		WHERE sal > ALL(
				SELECT sal
					FROM emp
					WHERE deptno = 30
			)