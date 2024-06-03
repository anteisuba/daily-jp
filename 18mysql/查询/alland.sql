#all和any的使用

SELECT ename,sal,deptno
		FROM emp,
		WHERE sal > ALL(
			SELECT sal
				FROM emp
				WHERE deptno = 30
			)