-- SELECT FIRST_HALF.FLAVOR 
-- FROM FIRST_HALF JOIN ICECREAM_INFO ON FIRST_HALF.FLAVOR = ICECREAM_INFO.FLAVOR
-- WHERE TOTAL_ORDER > 3000
-- AND INGREDIENT_TYPE = 'fruit_based'
-- ORDER BY TOTAL_ORDER DESC

SELECT FH.FLAVOR
FROM FIRST_HALF FH, ICECREAM_INFO II
WHERE TOTAL_ORDER > 3000
AND INGREDIENT_TYPE LIKE 'fruit_based'
AND FH.FLAVOR = II.FLAVOR
ORDER BY TOTAL_ORDER DESC;

