-- SELECT NAME
-- FROM
-- (SELECT *
--  FROM ANIMAL_INS
--  ORDER BY DATETIME
-- )
-- WHERE ROWNUM = 1;

SELECT NAME
FROM ANIMAL_INS
ORDER BY DATETIME
FETCH FIRST 1 ROW ONLY;