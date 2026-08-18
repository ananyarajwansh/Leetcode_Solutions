# Write your MySQL query statement below
select p.product_name, sales.year, sales.price
from sales 
left join product as p
on sales.product_id = p.product_id;