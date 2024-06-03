#子查询
SELECT deptno 
	FROM emp
	WHERE ename = 'SMITH'
	
SELECT * FROM emp
	WHERE deptno = (
		SELECT deptno 
		FROM emp 
		WHERE ename = 'SMITH'
	)
	
SELECT DISTINCT job 
	FROM emp
	WHERE deptno = 20;
	
SELECT ename,job,sal,deptno
	FROM emp
	WHERE job IN (
		SELECT DISTINCT job
		FROM emp
		WHERE deptno = 30
	) AND deptno != 20;
	
select good_id,temp.cat_id,goods_name,shop_price
	FROM (
			SELECT cat_id,MAX(shop_price) AS max_price
			FROM ecs_goods
			GROUP BY cat_id
		) temp,ecs_goods
		WHERE temp.cat_id = ecs.goods.cat_id 
		AND temp.max_price = ecs_goods.shop_price

	
	
	
	
	
	
	
	
	
	
	
	
	