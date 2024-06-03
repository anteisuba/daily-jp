#多表查询的自连接
#显示公司员工和他的上级的名字

SELECT worker.ename AS '职员' , boss.ename AS '上级名'
	FROM emp worker,emp boss
	WHERE worker.mgr = boss.empno;

SELECT * FROM emp;