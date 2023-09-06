-- 직급 테이블 데이터 추가
INSERT INTO `POSITION`(PO_NAME) VALUES('사원'),('주임'),('대리'),('과장'),('차장'),('부장');

-- 근무상태 테이블 데이터 추가
INSERT INTO `STATE`(ST_TYPE) VALUES('재직'),('휴직'),('퇴직');

-- 부서 테이블 데이터 추가
INSERT INTO `DEPARTMENT`(DM_NAME) VALUES('기획부서'),('마케팅부서'),('시스템부서'),('금융부서');

-- 직원 테이블 데이터 추가 
INSERT INTO `EMPLOYEE`(EP_NAME, EP_EMAIL, EP_PHONE_NUM, EP_DM_NUM, EP_PO_NUM, EP_ST_NUM, EP_LEAVE, EP_SALAY)
values
	('김첨지', 'kcj@pmcompany.kr', '010-1111-1111', 1, 6, 1, 15, 500),
	('홍길동', 'hkd@pmcompany.kr', '010-2222-2222', 2, 6, 1, 15, 500),
    ('임창정', 'lcj@pmcompany.kr', '010-3333-3333', 3, 6, 1, 15, 500),
    ('이순신', 'lss@pmcompany.kr', '010-4444-4444', 4, 6, 1, 15, 500),
    ('김중배', 'kjb@pmcompany.kr', '010-1234-1111', 1, 5, 1, 15, 450),
    ('박나라', 'pnl@pmcompany.kr', '010-5678-2222', 2, 5, 1, 15, 450),
    ('정도전', 'jdj@pmcompany.kr', '010-9123-3333', 3, 5, 1, 15, 450),
    ('민기옥', 'mko@pmcompany.kr', '010-4567-4444', 4, 5, 1, 15, 450),
    ('전해리', 'jhl@pmcompany.kr', '010-4321-1111', 1, 4, 1, 15, 400),
    ('유해진', 'lhj@pmcompany.kr', '010-8765-2222', 2, 4, 1, 15, 400),
    ('고길동', 'ggd@pmcompany.kr', '010-3219-3333', 3, 4, 1, 15, 400),
    ('신선아', 'ssa@pmcompany.kr', '010-7654-4444', 4, 4, 1, 15, 500),
    ('구하라', 'ghr@pmcompany.kr', '010-1212-1111', 1, 3, 1, 15, 500),
    ('이병헌', 'lbh@pmcompany.kr', '010-2323-2222', 2, 3, 1, 15, 500),
    ('박서준', 'psj@pmcompany.kr', '010-3434-3333', 3, 3, 1, 15, 500),
    ('이형기', 'lhk@pmcompany.kr', '010-4545-4444', 4, 3, 1, 15, 500),
    ('추신수', 'css@pmcompany.kr', '010-5555-1111', 1, 2, 1, 15, 500),
    ('이만기', 'lmk@pmcompany.kr', '010-6666-2222', 2, 2, 1, 15, 500),
    ('마소희', 'msh@pmcompany.kr', '010-7777-3333', 3, 2, 1, 15, 500),
    ('김진수', 'kjs@pmcompany.kr', '010-8888-4444', 4, 2, 1, 15, 500),
    ('오만수', 'oms@pmcompany.kr', '010-5656-1111', 1, 1, 1, 15, 500),
    ('구본혁', 'kbh@pmcompany.kr', '010-6767-2222', 2, 1, 1, 15, 500),
    ('강기혁', 'kkh@pmcompany.kr', '010-7878-3333', 3, 1, 1, 15, 500),
    ('정주영', 'jjy@pmcompany.kr', '010-8989-4444', 4, 1, 1, 15, 500),
    ('김휴직', 'khj@pmcompany.kr', '010-0000-0000', 3, 5, 2, 15, 500),
    ('이퇴직', 'ltj@pmcompany.kr', '010-0101-0101', 4, 4, 3, 15, 500)
    ;

-- 프로젝트 테이블 데이터 추가
INSERT INTO `PROJECT`(PJ_NAME, PJ_START_DATE, PJ_END_DATE, PJ_STATE) 
VALUES
	('종료 프로젝트1', '2022-09-06', '2023-03-21', '종료'),
    ('종료 프로젝트2', '2022-11-12', '2023-06-30', '종료'),
    ('진행 프로젝트1', '2023-04-07', '', '진행'),
    ('진행 프로젝트2', '2023-08-02', '', '진행'),
    ('예정 프로젝트1', '', '', '예정');
    
-- 프로젝트정보 테이블 데이터 추가
-- INSERT INTO `PROJECT_INFO`(Pi_EP_ID, PI_PJ_NUM, PI_ROLE) values(,,);

-- 부서이동내역 테이블 데이터 추가
-- INSERT INTO `TRANSFER`(TR_DATE, TR_REASON, TR_EP_ID, TR_DM_NUM) VALUES(,,,);

-- 휴가 테이블 데이터 추가
-- INSERT INTO `LEAVE`(LE_START_NUM, LE_END_DATE, LE_TYPE, LE_EP_ID) VALUES(,,,);

-- 급여사유
INSERT INTO `PROJECT` VALUES('월급'),('성과금'),('퇴직금'); 

