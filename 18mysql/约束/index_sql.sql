#empno_index 索引名称
#ON emp(empno):表示在emp表的empno列创建索引
#索引本身也会占用空间
CREATE INDEX empno_index ON emp(empno)

SELECT * FROM emp
	WHERE empno = 1234568

-- 创建索引后，只对创建索引的列有效 
SELECT * FROM emp
	WHERE ename = 'axjxct'

CREATE INDEX ename_index ON emp(ename) #在ename上创建索引

