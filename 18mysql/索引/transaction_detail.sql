-- 讨论事务细节

INSERT INTO t27 VALUES(300,'milan');

SELECT * FROM t27

START TRANSACTION

INSERT INTO t27 VALUES(400,'king');
INSERT INTO t27 VALUES(500,'scott');
ROLLBACK  #表示直接回退到事务开始的状态
COMMIT

-- 查看当前会话隔离级别
SELECT @@tx_isolation

-- 查看系统当前隔离级别
SELECT @@global.tx_isolation

-- 设置当前会话隔离级别
SET SESSION TRANSACTION ISOLATION LEVEL READ UNCOMMITTED

-- 设置系统当前隔离级别
SET GLOBAL TRANSACTION ISOLATION LEVEL []

-- mysql默认的事务隔离级别是repeatable read，一般情况下，没有特殊要求，没有必要修改





























