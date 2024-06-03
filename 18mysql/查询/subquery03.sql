#子查询联系

# 先得到每个部门的部门号和对应的平均工资
SELECT deptno,AVG(sal) AS avg_sal
	FROM emp 
	GROUP BY deptno
#把上面的结果当作子查询，和emp进行多表查询
SELECT ename,sal,temp.avg_sal,emp.deptno
	FROM emp,(
		SELECT deptno,AVG(sal) AS avg_sal
		FROM emp 
		GROUP BY deptno
	) temp 
	WHERE emp.deptno = temp.deptno AND emp.sal > temp.avg_sal
	
	
	SELECT ename,sal,temp.max_sal,emp.deptno
	FROM emp,(
		SELECT deptno,MAX(sal) AS max_sal
		FROM emp 
		GROUP BY deptno
	) temp 
	WHERE emp.deptno = temp.deptno AND emp.sal = temp.max_sal
	
	#查询每个部门的信息（部门名，编号，地址）和人员数量
SELECT COUNT(*),deptno
	FROM emp
	GROUP BY deptno;

SELECT dname,dept.deptno,loc,tmp.per_num AS '人数'
	FROM dept,(
		SELECT COUNT(*) AS per_num,deptno
		FROM emp
		GROUP BY deptno
	) tmp
	WHERE tmp.deptno = dept.deptno
	
SELECT tmp.*，dname,loc #表示将该表所有列显示出来
	FROM dept,(
		SELECT COUNT(*) AS per_num,deptno
		FROM emp
		GROUP BY deptno
	) tmp
	WHERE tmp.deptno = dept.deptno
	
	
	
	
	
	
	
	
	
	
