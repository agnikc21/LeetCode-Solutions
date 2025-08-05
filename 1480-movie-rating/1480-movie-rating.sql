# Write your MySQL query statement below
(SELECT u.name as results FROM MovieRating m 
join Users u on u.user_id=m.user_id
group by u.user_id order by count(m.rating) desc,name limit 1)
union all
(select title from Movies natural join MovieRating 
where created_at between '2020-02-01' and '2020-02-29'
group by movie_id order by avg(rating) desc, title limit 1);