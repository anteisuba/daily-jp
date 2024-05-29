SELECT * FROM student WHERE id = '1' 

# 备份文件
mysqldump -u root -p -B hsp_db02 hsp_db03 > /Users/fulina/IT/数据库

# 恢复数据库
source /Users/fulina/IT/数据库/demo.sql


