SELECT email from Person
GROUP BY email
HAVING COUNT(email) > 1;