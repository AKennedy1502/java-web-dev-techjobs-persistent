## Part 1: Test it with SQL
CREATE TABLE job (
id INTEGER,
employer VARCHAR(100),
name VARCHAR(50),
skills VARCHAR(100)
);

## Part 2: Test it with SQL
SELECT name
FROM employer
WHERE location = "St. Louis";

## Part 3: Test it with SQL

drop table job;

## Part 4: Test it with SQL
select name, description from skill where id in(select skills_id from job_skills where skills_id is not null)