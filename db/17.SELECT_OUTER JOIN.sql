/*
INNER JOIN : 두 테이블이 외래키로 연결 되었을 때, 양쪽 다 데이터가 있는 경우
OUTER JOIN : 두 테이블이 외래키로 연결 되었을때, 한 테이블을 기준으로 연결할 때 사용


- 상품별 리뷰수를 조회하는 경우, 리뷰가 등록이 안된 상품들은 INNER JOIN을 이용하여 리뷰수를 알수가 없음 

- OUTER JOIN 문법 : 기준 테이블이 매우 중요
  INNER JOIN은 A JOIN B, B JOIN A가 같지만
  OUTER JOIN은 A OUTER JOIN B와 B OUTER JOIN A는 결과가 다름 
- 종류 : LEFT, RIGHT
- LEFT JOIN : 기준 테이블을 기준으로 연결
- RIGHT JOIN: 참조 테이블을 기준으로 연결

A LEFT JOIN B == B RIGHT JOIN A 

SELECT * FROM 기준테이블
	JOIN 참조테이블
    ON 기준테이블.외래키 = 참조테이블.기본키
[WHERE절]
[GROUP BY절]
[HAVING절]
[ORDER BY절]
[LIMIT절]
*/
-- 리뷰별 리뷰 개수를 조회하는 쿼리(리뷰가 등록된 제품만 조회)
SELECT OP_PR_CODE AS 제품코드, COUNT(RE_NUM) AS 리뷰수
FROM REVIEW
	RIGHT JOIN `OPTION` ON OP_NUM = RE_OP_NUM
    GROUP BY OP_PR_CODE;
-- 제품별 옵션의 개수를 조회하는 쿼리(제품명, 옵션수)
SELECT PR_NAME AS 제품명, COUNT(OP_PR_CODE)
FROM `OPTION`
JOIN PRODUCT ON OP_PR_CODE = PR_CODE
GROUP BY PR_CODE;

-- 제품별 판매량(반품, 환불을 제외한)을 조회하는 쿼리(제품명, 판매량)
SELECT PR_NAME AS 제품명, SUM(OL_AMOUNT) AS 판매수 
FROM PRODUCT 
	JOIN `OPTION` ON OP_PR_CODE = PR_CODE
    LEFT JOIN ORDER_LIST ON OL_OP_NUM = OP_NUM
    LEFT JOIN `ORDER` ON OR_NUM = OL_OR_NUM
    WHERE OR_STATE IS NULL OR OR_STATE NOT IN('반품', '환불')
    GROUP BY PR_CODE;
-- 제품 옵션별 판매량(반품, 환불을 제외한)을 조회하는 쿼리(제품명,옵션명,판매량)
SELECT PR_NAME AS 제품명, OP_NAME AS 옵션명, IFNULL(SUM(OL_AMOUNT),0) AS 판매수 
FROM PRODUCT 
	JOIN `OPTION` ON OP_PR_CODE = PR_CODE
    LEFT JOIN ORDER_LIST ON OL_OP_NUM = OP_NUM
    LEFT JOIN `ORDER` ON OR_NUM = OL_OR_NUM
    WHERE OR_STATE IS NULL OR OR_STATE NOT IN('반품', '환불')
    GROUP BY OP_NUM;
-- 제품 옵션별 판매량(반품, 환불을 제외한)을 조회하는 쿼리(제품명,옵션명,판매량,총판매금액)
SELECT PR_NAME AS 제품명, OP_NAME AS 옵션명, IFNULL(SUM(OL_AMOUNT),0) AS 판매수, IFNULL(SUM(OL_PRICE),0) AS 총판매액
FROM PRODUCT 
	JOIN `OPTION` ON OP_PR_CODE = PR_CODE
    LEFT JOIN ORDER_LIST ON OL_OP_NUM = OP_NUM
    LEFT JOIN `ORDER` ON OR_NUM = OL_OR_NUM
    WHERE OR_STATE IS NULL OR OR_STATE NOT IN('반품', '환불')
    GROUP BY OP_NUM;
    -- 옵션별 리뷰수를 조회하는 쿼리(제품명, 옵션명, 리뷰수)
    SELECT PR_NAME AS 제품명, OP_NAME AS 옵션명, COUNT(RE_NUM) AS 리뷰수
    FROM REVIEW
		RIGHT JOIN `OPTION` ON RE_OP_NUM = OP_NUM
        GROUP BY OP_PR_CODE;
	



