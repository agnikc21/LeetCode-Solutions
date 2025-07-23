with weights as(
    select *, sum(weight) over(order by turn) as rt
    from Queue
), cte as(
    select person_name,rt from weights where rt<=1000 order by rt desc
)
select person_name from cte limit 1;