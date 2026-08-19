# Write your MySQL query statement below
select c.id, c.movie, c.description, c.rating
from cinema as c
where c.description != "boring" and c.id % 2 = 1
order by c.rating desc;
