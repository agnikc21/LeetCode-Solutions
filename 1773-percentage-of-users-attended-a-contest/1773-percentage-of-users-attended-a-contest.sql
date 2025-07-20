# Write your MySQL query statement below
SELECT contest_id, ROUND(COUNT(*) *100 /(SELECT COUNT(*) FROM Users),2) AS percentage 
FROM Users u RIGHT JOIN Register r ON u.user_id = r.user_id GROUP BY contest_id ORDER BY percentage DESC, contest_id;