/* Write your T-SQL query statement below */
with cte as (
    select * from Products where change_date<='2019-08-16'
), cte2 as(
    select *, dense_rank() over(partition by product_id order by change_date desc) as rank
    from cte
)
select product_id,new_price as price from cte2 where rank=1
union 
select product_id , 10 from Products where product_id not in (select distinct(product_id) from cte);