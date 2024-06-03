# 多列子查询
# 得到smith的部门和岗位
SELECT deptno,job
	FROM emp
	WHERE ename = 'SMITH'

# 把上面的查询做子查询来使用，并使用多列子查询的语法进行匹配
SELECT * 
	FROM emp
	WHERE (deptno,job) = (
		SELECT deptno,job
		FROM emp
		WHERE ename = 'SMITH'
	) AND ename != 'SMITH'
	
	SELECT * FROM student02;
	
	SELECT * FROM student02
		WHERE (chinese,english,math) = (
			SELECT chinese,english,math
			FROM student02 
			WHERE name = 'song'
		) AND name != 'song'
	