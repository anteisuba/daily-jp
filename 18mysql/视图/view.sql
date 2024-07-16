#视图的使用

CREATE VIEW emp_view01
		AS 
		SELECT empno,ename,job,deptno FROM emp;
		
DESC emp_view01

SELECT empno,job FROM emp_view01;

-- 查看创建视图的指定
SHOW CREATE VIEW emp_view01

-- 删除视图
DROP VIEW emp_view01;

-- 视图的细节
-- 修改视图
UPDATE emp_view01
		SET job = 'MANAGER'
		WHERE empno = 7369
	
SELECT * FROM emp;

SELECT * FROM emp_view01
-- 修改基本表，会影响到视图
UPDATE emp
		SET job = 'SALESMAN'
		WHERE empno = 7369
-- 视图中可以再使用视图，比如从emp_view01视图中，选出empno和ename
DESC emp_view01

CREATE VIEW emp_view02
		AS 
		SELECT empno,ename FROM emp_view01












