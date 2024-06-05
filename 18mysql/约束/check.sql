#演示check的使用

CREATE TABLE t23 (
		id INT PRIMARY KEY,
		name VARCHAR(32),
		sex VARCHAR(6) CHECK (sex IN('man','woman')),
		sal DOUBLE CHECK (sal > 1000 AND sal < 2000)); 
		
INSERT INTO t23 
		VALUES(1,'man','man',1100);

SELECT * FROM t23;
		