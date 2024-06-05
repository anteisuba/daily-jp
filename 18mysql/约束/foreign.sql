-- 外键演示

-- 创建主表my_class

CREATE TABLE my_class
		(id INT PRIMARY KEY,
		name VARCHAR(32) NOT NULL DEFAULT '');
--  创建从表 my_stu
CREATE TABLE my_stu(
		id INT PRIMARY KEY,
	  name VARCHAR(32) NOT NULL DEFAULT '',
		class_id INT,
-- 		指定一个外键关系
		FOREIGN KEY my_stu(class_id) REFERENCES my_class(id))

-- 测试数据
INSERT INTO my_class
		VALUES(100,'java'),
		(200,'web');
		
SELECT * FROM my_class;

INSERT INTO my_stu
	VALUES(1,'tom',100);

INSERT INTO my_stu
	VALUES(2,'jack',200);

INSERT INTO my_stu
	VALUES(3,'hsp',300); #会失败，因为300号班级不存在

SELECT * FROM my_stu;

-- 一旦建立主外键的关系，数据不能随意删除了













