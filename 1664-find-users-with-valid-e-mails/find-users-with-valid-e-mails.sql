-- Write your PostgreSQL query statement below
select * from Users where mail ~ '^[A-Z a-z][A-Z a-z 0-9 . _ -]*@leetcode[.]com$'