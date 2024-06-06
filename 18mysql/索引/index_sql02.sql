CREATE TABLE t26 (
	id INT,
	name VARCHAR(32));
	
-- 查询表是否有索引
SHOW INDEXES FROM t25

-- 添加索引
-- 添加唯一索引
CREATE UNIQUE INDEX id_index ON t25 (id);
-- 普通索引
CREATE INDEX id_index ON t25 (id);
-- 添加普通索引方式2
ALTER TABLE t25 ADD INDEX id_index(id)

-- 添加主键索引
ALTER TABLE t26 ADD PRIMARY KEY (id)

-- 删除索引
DROP INDEX id_index ON t25

-- 删除主键索引
ALTER TABLE t26 DROP PRIMARY KEY

-- 查询索引
SHOW INDEX FROM t25
-- 查询索引2
SHOW INDEXES FROM t25
-- 查询索引3
SHOW KEYS FROM t25
-- 查询索引4
DESC t25











