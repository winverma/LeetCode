-- Write your PostgreSQL query statement below
select s.year, s.price, p.product_name from Sales s join Product p on s.product_id = p.product_id