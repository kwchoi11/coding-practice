-- SELECT ANIMAL_ID
-- ,      NAME
-- ,      SEX_UPON_INTAKE
-- FROM ANIMAL_INS
-- WHERE NAME = 'Lucy'
-- OR NAME = 'Pickle'
-- OR NAME = 'Rogan'
-- OR NAME = 'Sabrina'
-- OR NAME = 'Mitty'
-- ORDER BY ANIMAL_ID;

SELECT ANIMAL_ID
    , NAME
    , SEX_UPON_INTAKE
FROM ANIMAL_INS 
WHERE REGEXP_LIKE(NAME, '^(Lucy|Ella|Pickle|Rogan|Sabrina|Mitty)$')
ORDER BY ANIMAL_ID