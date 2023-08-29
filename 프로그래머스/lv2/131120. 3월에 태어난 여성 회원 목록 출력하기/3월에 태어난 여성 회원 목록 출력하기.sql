SELECT MEMBER_ID
,      MEMBER_NAME
,      GENDER
,      TO_CHAR(DATE_OF_BIRTH, 'YYYY-MM-DD') AS DATE_OF_BIRTH
FROM MEMBER_PROFILE
WHERE GENDER = 'W'
AND TO_CHAR(DATE_OF_BIRTH, 'YYYY-MM-DD') LIKE '%03%' 
AND TLNO IS NOT NULL
ORDER BY MEMBER_ID;