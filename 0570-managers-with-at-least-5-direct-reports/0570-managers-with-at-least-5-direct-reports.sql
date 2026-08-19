# Write your MySQL query statement below
select e.name
from employee as e
inner join employee as m
on e.id = m.managerID
group by m.managerID
having count(m.managerID) >= 5;
