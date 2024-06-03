# 查询姓名为xx的学生成绩
SELECT * FROM student02
	WHERE `name` = 'yan';
# 查询英语成绩大于90分的同学
SELECT * FROM student02
	WHERE english > 90;
# 查询总分大于200分的所有同学
SELECT * FROM student02
	WHERE (english + chinese + math) > 200;

SELECT * FROM student02
	WHERE math > 60 AND id < 90;
	
SELECT * FROM student02
	WHERE english > chinese;

SELECT * FROM student02 
	WHERE (chinese + english + math) > 200 AND math < chinese AND `name` LIKE 'y%';

SELECT * FROM student02
	WHERE english BETWEEN 80 AND 90;
	
SELECT * FROM student02 
	WHERE math IN (89,90,91);

SELECT * FROM student02
	WHERE `name` LIKE 'ya%';
	
SELECT * FROM student02 
	WHERE math > 80 and chinese > 80;







	











