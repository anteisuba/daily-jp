-- mysql用户的管理
-- 当我们做项目开发时，可以根据不同的开发人员，赋给他相应的mysql操作权限
-- 所以，mysql数据库管理人员（root），根据需要创建不同的用户，赋给相应的权限，供人员使用

-- 创建新的用户
-- 'yang'@'localhost'表示用户完整信息'yang'@'localhost'登录的ip
-- 123456密码，但是注意存放到mysql. 表时，时password（123456）加密后的密码
CREATE USER 'yang'@'localhost' IDENTIFIED BY '123456'

SELECT * FROM mysql.user 

-- 赋予权限
GRANT SELECT,INSERT
		ON testdb.news
		TO 'shunping'@'localhost'


