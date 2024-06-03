# 修改表的操作练习
ALTER TABLE user02 
	ADD image VARCHAR(32) NOT NULL DEFAULT ' ' 

DESC user02

ALTER TABLE user02
	MODIFY password VARCHAR(60) NOT NULL DEFAULT ' '

#删除name列
ALTER TABLE user02
	DROP name 

#修改表名
RENAME TABLE user02 TO user03

DESC user03
#修改字符集
ALTER TABLE user03 CHARACTER SET utf8mb4
#列名修改为user_name
ALTER TABLE user03 
	CHANGE NAME 'id' 'user_name' VARCHAR(64) NOT NULL DEFAULT ' '



	
