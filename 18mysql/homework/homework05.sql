CREATE TABLE DEPARMENT (
	departmentid VARCHAR(32) PRIMARY KEY,
	deptname VARCHAR(32) UNIQUE NOT NULL)
	
DROP TABLE student
CREATE TABLE class (
	classid INT PRIMARY KEY,
	subject VARCHAR(32) NOT NULL DEFAULT '',
	deptname VARCHAR(32), 
	enrolltime INT NOT NULL DEFAULT 2000,
	num INT NULL DEFAULT 0,
	FOREIGN KEY (deptname) REFERENCES DEPARMENT(deptname));
	
CREATE TABLE student (
	studentid INT PRIMARY KEY,
	name VARCHAR(32) NOT NULL DEFAULT 0,
	age INT NOT NULL DEFAULT 0,
	classid INT,
	FOREIGN KEY (classid) REFERENCES class(classid);

	
	
	
	
	
	
	
	
	