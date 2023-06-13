SELECT A.AUTHOR_ID
      ,B.AUTHOR_NAME
      ,A.CATEGORY
      ,SUM(A.PRICE * C.SALES) AS TOTAL_SALES
FROM BOOK A INNER JOIN AUTHOR B ON A.AUTHOR_ID = B.AUTHOR_ID
            INNER JOIN BOOK_SALES C ON A.BOOK_ID = C.BOOK_ID
WHERE C.SALES_DATE BETWEEN  DATE_FORMAT('20220101','%Y-%m-%d') AND DATE_FORMAT('20220131','%Y-%m-%d') 
GROUP BY A.AUTHOR_ID,B.AUTHOR_NAME,A.CATEGORY
ORDER BY A.AUTHOR_ID,A.CATEGORY DESC;