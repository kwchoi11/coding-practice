SELECT *
FROM(SELECT I.NAME, I.DATETIME 
     FROM ANIMAL_INS I FULL JOIN ANIMAL_OUTS O ON I.ANIMAL_ID = O.ANIMAL_ID
     WHERE O.ANIMAL_ID IS NULL
     ORDER BY I.DATETIME)
WHERE ROWNUM < 4;