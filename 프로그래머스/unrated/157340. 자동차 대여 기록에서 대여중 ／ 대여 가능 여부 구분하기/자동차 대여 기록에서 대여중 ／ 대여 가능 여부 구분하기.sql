SELECT CAR_ID
      ,MAX(AVAILABILITY) AS AVAILABILITY
FROM  
      (SELECT CAR_ID
             ,CASE WHEN TO_DATE('20221016','YYYY-MM-DD') BETWEEN START_DATE AND END_DATE
                   THEN '대여중' ELSE '대여 가능' END AS AVAILABILITY
       FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY) 
GROUP BY CAR_ID
ORDER BY CAR_ID DESC;