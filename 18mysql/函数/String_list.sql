#CHARSET(str)返回字串字符集
SELECT CHARSET(ename) FROM emp;
#连接字串
SELECT CONCAT(ename,' job is ',job) FROM emp;
# dual 亚元表，系统表，可以作为测试表使用
SELECT INSTR('yangjina','yan') FROM DUAL;
# 转成大写,小写
SELECT UCASE(ename) FROM emp;
SELECT LCASE(ename) FROM emp;

SELECT LEFT(ename,2) FROM emp;
SELECT RIGHT(ename,2) FROM emp;

SELECT LENGTH(ename) FROM emp;

SELECT * FROM emp; 
SELECT ename,REPLACE(job,'MANAGER','经理') FROM emp;

SELECT STRCMP('hsp','jsp') FROM DUAL;

SELECT SUBSTRING(ename,1,2) FROM emp;

SELECT LTRIM('    yangjian  ') FROM DUAL;
SELECT RTRIM('    yangjian  ') FROM DUAL;
SELECT TRIM('    yangjian  ') FROM DUAL;


SELECT CONCAT( LCASE(SUBSTRING(ename,1,1)) , SUBSTRING(ename,2))
	FROM emp;













  



