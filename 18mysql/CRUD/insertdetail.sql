# 演示update语句
# 如果没有where语句，会修改所有的记录，因此一定要小心

UPDATE user SET password = 50000 

UPDATE user 
	SET `password` = `password` + 10000
	WHERE `name` = 'yang';

INSERT INTO user (id,name,password,brithday)
	VALUES(3,'hua',12345,0421),(2,'jian',32456,0323);
SELECT * FROM user;
# 删除语句
DELETE FROM user 
	WHERE `name` = 'yang';
	
UPDATE `user` SET `password` = '' WHERE `name` = 'jian';

