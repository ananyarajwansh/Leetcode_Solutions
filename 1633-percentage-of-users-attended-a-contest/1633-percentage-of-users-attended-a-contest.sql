# Write your MySQL query statement below
select r.contest_id, 
round((count(r.user_id)*100)/(select count(*) from users),2) as percentage
from users as u
right join register as r
on u.user_id = r.user_id
group by r.contest_id
order by percentage desc, r.contest_id asc;