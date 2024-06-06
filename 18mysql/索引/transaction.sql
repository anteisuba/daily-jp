-- 事务的一个重要的概念和具体的操作
CREATE TABLE t27 (
		id INT,
		name VARCHAR(32));
		
-- 开始事务
START TRANSACTION

-- 设置保存点
SAVEPOINT a 

-- 执行dml操作
INSERT INTO t27 VALUES(100,'tom');
SELECT * FROM t27;

SAVEPOINT b
-- 执行dml操作

INSERT INTO t27 VALUES(200,'jack');

-- 回退到b
ROLLBACK TO b;

ROLLBACK TO a;

COMMIT




