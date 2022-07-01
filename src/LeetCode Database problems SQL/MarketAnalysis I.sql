# Write your MySQL query statement below
Select u.user_id as buyer_id, u.join_date, SUM(CASE WHEN YEAR(o.order_date) = 2019 THEN 1 ELSE 0 END)
                 As orders_in_2019
From Users u
         Left Join Orders o ON u.user_id = o.buyer_id

Group By u.user_id