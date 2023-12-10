SELECT TO_CHAR(event_day, 'yyyy-mm-dd') AS day, emp_id, SUM(out_time - in_time) AS total_time
FROM Employees
GROUP BY emp_id, event_day;