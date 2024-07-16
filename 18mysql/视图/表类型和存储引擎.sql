#表类型和存储引擎

SHOW ENGINES

-- innodb 存储引擎
-- 支持事务 支持外键 支持行级锁

-- myisam 存储引擎
CREATE TABLE t28 (
		id INT,
		name VARCHAR(32)) ENGINE MYISAM
-- 添加速度快  不支持外键和事务  支持表级锁

START TRANSACTION;
SAVEPOINT t1 
INSERT INTO t28 VALUES(1,'jack');
SELECT * FROM t28;

ROLLBACK TO t1

-- memory 存储引擎
-- 数据存储在内存中[关闭了mysql服务，数据丢失，但是表结构还在]
-- 执行速度很快（没有IO读写）
-- 默认支持索引 (hash表）
CREATE TABLE t29 (
		id INT,
		name VARCHAR(32)) ENGINE MEMORY
	
DESC t29	
INSERT INTO t29
		VALUES(1,'tom'),(2,'jack'),(3,'yang');
		
SELECT * FROM t29


















