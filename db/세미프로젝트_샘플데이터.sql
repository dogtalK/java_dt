-- 직급 테이블 데이터 추가
INSERT INTO `POSITION`(PO_NAME) VALUES('사원'),('주임'),('대리'),('과장'),('차장'),('부장');

-- 근무상태 테이블 데이터 추가
INSERT INTO `STATUS`(ST_TYPE) VALUES('재직'),('휴직'),('퇴직');

-- 부서 테이블 데이터 추가
INSERT INTO `DEPARTMENT`(DM_NAME) VALUES('대기'),('기획부서'),('마케팅부서'),('시스템부서'),('금융부서');

-- 직원 테이블 데이터 추가 (EP_DM_NUM, EP_PO_NUM, EP_ST_NUM 디폴트 = 1, EP_LEAVE 디폴트 = 15)
INSERT INTO `EMPLOYEE`(EP_ID, EP_NAME, EP_EMAIL, EP_PHONE_NUM, EP_DM_NUM, EP_PO_NUM, EP_ST_NUM, EP_LEAVE, EP_SALAY)
values
	('PM00001', '김첨지', 'kcj@pmcompany.kr', '010-1111-1111', 2, 6, 1, 10, 500),
	('PM00002', '홍길동', 'hkd@pmcompany.kr', '010-2222-2222', 3, 6, 1, 8, 500),
    ('PM00003', '임창정', 'lcj@pmcompany.kr', '010-3333-3333', 4, 6, 1, 12, 500),
    ('PM00004', '이순신', 'lss@pmcompany.kr', '010-4444-4444', 5, 6, 1, 6, 500),
    ('PM00005', '김중배', 'kjb@pmcompany.kr', '010-1234-1111', 2, 5, 1, 2, 450),
    ('PM00006', '박나라', 'pnl@pmcompany.kr', '010-5678-2222', 3, 5, 1, 11, 450),
    ('PM00007', '정도전', 'jdj@pmcompany.kr', '010-9123-3333', 4, 5, 1, 7, 450),
    ('PM00008', '민기옥', 'mko@pmcompany.kr', '010-4567-4444', 5, 5, 1, 14, 450),
    ('PM00009', '전해리', 'jhl@pmcompany.kr', '010-4321-1111', 2, 4, 1, 7, 400),
    ('PM00010', '유해진', 'lhj@pmcompany.kr', '010-8765-2222', 3, 4, 1, 6, 400),
    ('PM00011', '고길동', 'ggd@pmcompany.kr', '010-3219-3333', 4, 4, 1, 12, 400),
    ('PM00012', '신선아', 'ssa@pmcompany.kr', '010-7654-4444', 5, 4, 1, 9, 400),
    ('PM00013', '구하라', 'ghr@pmcompany.kr', '010-1212-1111', 2, 3, 1, 3, 350),
    ('PM00014', '이병헌', 'lbh@pmcompany.kr', '010-2323-2222', 3, 3, 1, 9, 350),
    ('PM00015', '박서준', 'psj@pmcompany.kr', '010-3434-3333', 4, 3, 1, 8, 350),
    ('PM00016', '이형기', 'lhk@pmcompany.kr', '010-4545-4444', 5, 3, 1, 7, 350),
    ('PM00017', '추신수', 'css@pmcompany.kr', '010-5555-1111', 2, 2, 1, 3, 300),
    ('PM00018', '이만기', 'lmk@pmcompany.kr', '010-6666-2222', 3, 2, 1, 4, 300),
    ('PM00019', '마소희', 'msh@pmcompany.kr', '010-7777-3333', 4, 2, 1, 6, 300),
    ('PM00020', '김진수', 'kjs@pmcompany.kr', '010-8888-4444', 5, 2, 1, 10, 300),
    ('PM00021', '오만수', 'oms@pmcompany.kr', '010-5656-1111', 2, 1, 1, 8, 250),
    ('PM00022', '구본혁', 'kbh@pmcompany.kr', '010-6767-2222', 3, 1, 1, 7, 250),
    ('PM00023', '강기혁', 'kkh@pmcompany.kr', '010-7878-3333', 4, 1, 1, 7, 250),
    ('PM00024', '정주영', 'jjy@pmcompany.kr', '010-8989-4444', 5, 1, 1, 6, 250),
    ('PM00025', '최대기', 'cdk@pmcompany.kr', '010-9999-9999', 1, 1, 1, 6, 250),
    -- 아래부터 26번
    ('PM00026', '김휴직', 'khj@pmcompany.kr', '010-0000-0000', 4, 5, 2, 8, 0),
    ('PM00027', '이퇴직', 'ltj@pmcompany.kr', '010-0101-0101', 5, 4, 3, 0, 0),
    ('PM00028', '나애진', 'naj@pmcompany.kr', '010-0202-0202', 2, 1, 3, 0, 0)
    ;

-- 프로젝트 테이블 데이터 추가
INSERT INTO `PROJECT`(PJ_NAME, PJ_START_DATE, PJ_END_DATE, PJ_STATE) 
VALUES
	('종료 프로젝트1', '2022-09-06', '2023-03-21', '종료'),
    ('종료 프로젝트2', '2022-11-12', '2023-06-30', '종료'),
    ('진행 프로젝트1', '2023-04-07', NULL, '진행'),
    ('진행 프로젝트2', '2023-08-02', NULL, '진행'),
    ('예정 프로젝트1', NULL, NULL, '예정');
    
-- 프로젝트정보 테이블 데이터 추가
INSERT INTO `PROJECT_INFO`(Pi_EP_ID, PI_PJ_NUM, PI_ROLE) 
values
	('PM00001',1,'팀장'),('PM00026',1,'부팀장'),('PM00010',1,'팀원'),('PM00015',1,'팀원'),('PM00018',1,'팀원'),('PM00028',1,'팀원'),
    ('PM00002',2,'팀장'),('PM00007',2,'부팀장'),('PM00027',2,'팀원'),('PM00014',2,'팀원'),('PM00017',2,'팀원'),('PM00021',2,'팀원'),
    ('PM00003',3,'팀장'),('PM00006',3,'부팀장'),('PM00012',3,'팀원'),('PM00016',3,'팀원'),('PM00019',3,'팀원'),('PM00022',3,'팀원'),
    ('PM00004',4,'팀장'),('PM00008',4,'부팀장'),('PM00009',4,'팀원'),('PM00013',4,'팀원'),('PM00020',4,'팀원'),('PM00027',4,'팀원'),
    ('PM00001',5,'팀장'),('PM00005',5,'부팀장'),('PM00011',5,'팀원'),('PM00014',5,'팀원'),('PM00017',5,'팀원'),('PM00023',5,'팀원');

-- 부서이동내역 테이블 데이터 추가
INSERT INTO `TRANSFER`(TR_DATE, TR_REASON, TR_EP_ID, TR_DM_NUM) 
VALUES
	('2023-02-27', '공석 보충', 'PM00012', 5),
    ('2023-05-30', '공석 보충', 'PM00023', 2);

-- 휴가 테이블 데이터 추가
INSERT INTO `LEAVE`(LE_START_DATE, LE_END_DATE, LE_TYPE, LE_EP_ID) 
VALUES
	('2022-12-24', '2022-12-24', '연차', 'PM00012'),
    ('2023-03-02', '2022-03-05', '경조사', 'PM00005'),
    ('2023-08-16', '2023-08-16', '연차', 'PM00017'),
    ('2023-01-16', '2023-08-16', '육아휴직', 'PM00026');
    
-- 퇴직 정보 테이블 데이터 추가
INSERT INTO `TERMINATION`(TM_DATE, TM_REASON, TM_EP_ID) 
VALUES ('2023-07-03', '퇴직', 'PM00027'), ('2023-05-29', '퇴직', 'PM00028');

-- 급여사유 테이블 데이터 추가
INSERT INTO `PAY`() VALUES('월급'),('성과금'),('퇴직금'),('유급 휴가'); 

-- 급여이력 테이블 데이터 추가
INSERT INTO `SALARYHISTORY` (SH_PAYDAY, SH_EP_ID, SH_PA_TYPE, SH_TYPE_DETAIL, SH_SALARY)
VALUES
	('2023-04-01', 'PM00026', '월급', '3월 월급', 450), ('2023-07-01', 'PM00027', '월급', '6월 월급', 400), ('2023-05-01', 'PM00028', '월급', '4월 월급', 250),
    ('2023-05-01', 'PM00026', '유급 휴가', '유급 휴가', 450), ('2023-07-04', 'PM00027', '퇴직금', '퇴직금', 400), ('2023-04-01', 'PM00028', '성과금', '프로젝트 성과금', 100),
	('2023-08-01', 'PM00001', '월급', '7월 월급', 500), ('2023-08-01', 'PM00002', '월급', '7월 월급', 500), ('2023-08-01', 'PM00003', '월급', '7월 월급', 500),
    ('2023-08-01', 'PM00004', '월급', '7월 월급', 500), ('2023-08-01', 'PM00005', '월급', '7월 월급', 450), ('2023-08-01', 'PM00006', '월급', '7월 월급', 450),
    ('2023-08-01', 'PM00007', '월급', '7월 월급', 450), ('2023-08-01', 'PM00008', '월급', '7월 월급', 450), ('2023-08-01', 'PM00009', '월급', '7월 월급', 400),
    ('2023-08-01', 'PM00010', '월급', '7월 월급', 400), ('2023-08-01', 'PM00011', '월급', '7월 월급', 400), ('2023-08-01', 'PM00012', '월급', '7월 월급', 400),
    ('2023-08-01', 'PM00013', '월급', '7월 월급', 350), ('2023-08-01', 'PM00014', '월급', '7월 월급', 350), ('2023-08-01', 'PM00015', '월급', '7월 월급', 350),
    ('2023-08-01', 'PM00016', '월급', '7월 월급', 350), ('2023-08-01', 'PM00017', '월급', '7월 월급', 300), ('2023-08-01', 'PM00018', '월급', '7월 월급', 300),
    ('2023-08-01', 'PM00019', '월급', '7월 월급', 300), ('2023-08-01', 'PM00020', '월급', '7월 월급', 300), ('2023-08-01', 'PM00021', '월급', '7월 월급', 250),
    ('2023-08-01', 'PM00022', '월급', '7월 월급', 250), ('2023-08-01', 'PM00023', '월급', '7월 월급', 250), ('2023-08-01', 'PM00024', '월급', '7월 월급', 250);

-- 근태정보 테이블 데이터 추가
INSERT INTO `ATTENDANCE_TYPE`(AT_TYPE) VALUES('결근'),('출근'),('재택'),('출장'),('조퇴');

-- 출결관리 테이블 데이터 추가
INSERT INTO `ATTENDANCE`(AD_DATE, AD_EP_ID, AD_AT_NUM) 
VALUES
	('2023-09-05', 'PM00001', 2), ('2023-09-05', 'PM00002', 3), ('2023-09-05', 'PM00003', 2), ('2023-09-05', 'PM00004', 2), ('2023-09-05', 'PM00005', 2), 
    ('2023-09-05', 'PM00006', 2), ('2023-09-05', 'PM00007', 4), ('2023-09-05', 'PM00008', 3), ('2023-09-05', 'PM00009', 2), ('2023-09-05', 'PM00010', 2), 
    ('2023-09-05', 'PM00011', 4), ('2023-09-05', 'PM00012', 2), ('2023-09-05', 'PM00013', 2), ('2023-09-05', 'PM00014', 2), ('2023-09-05', 'PM00015', 2), 
    ('2023-09-05', 'PM00016', 2), ('2023-09-05', 'PM00017', 2), ('2023-09-05', 'PM00018', 4), ('2023-09-05', 'PM00019', 1), ('2023-09-05', 'PM00020', 2), 
    ('2023-09-05', 'PM00021', 2), ('2023-09-05', 'PM00022', 2), ('2023-09-05', 'PM00023', 2), ('2023-09-05', 'PM00024', 2), ('2023-09-05', 'PM00025', 3),
    ('2023-09-06', 'PM00001', 2), ('2023-09-06', 'PM00002', 3), ('2023-09-06', 'PM00003', 2), ('2023-09-06', 'PM00004', 2), ('2023-09-06', 'PM00005', 2), 
    ('2023-09-06', 'PM00006', 2), ('2023-09-06', 'PM00007', 4), ('2023-09-06', 'PM00008', 3), ('2023-09-06', 'PM00009', 2), ('2023-09-06', 'PM00010', 2), 
    ('2023-09-06', 'PM00011', 4), ('2023-09-06', 'PM00012', 2), ('2023-09-06', 'PM00013', 2), ('2023-09-06', 'PM00014', 2), ('2023-09-06', 'PM00015', 2), 
    ('2023-09-06', 'PM00016', 2), ('2023-09-06', 'PM00017', 2), ('2023-09-06', 'PM00018', 4), ('2023-09-06', 'PM00019', 1), ('2023-09-06', 'PM00020', 2), 
    ('2023-09-06', 'PM00021', 2), ('2023-09-06', 'PM00022', 2), ('2023-09-06', 'PM00023', 2), ('2023-09-06', 'PM00024', 2), ('2023-09-06', 'PM00025', 3);

INSERT INTO `AT_RECORD`(AR_AD_NUM, AR_ST_TIME, AR_END_TIME)
VALUES
	(1, NULL, NULL), (2, '08:00:00', '17:00:00'),
    (3, '08:00:00', '17:00:00'), (4, NULL, NULL),
    (5, '08:00:00', '17:00:00'), (6, '08:00:00', '17:00:00'),
    (7, NULL, NULL), (8, '08:00:00', '17:00:00'),
	(9, '08:00:00', '17:00:00'), (10, '08:00:00', '17:00:00'),
	(11, NULL, NULL), (12, '08:00:00', '17:00:00'),
	(13, '08:00:00', '17:00:00'), (14, '08:00:00', '17:00:00'),
    (15, '08:00:00', '17:00:00'), (16, '08:00:00', '17:00:00'),
    (17, '08:00:00', '17:00:00'), (18, NULL, NULL),
    (19, NULL, NULL), (20, '08:00:00', '17:00:00'),
    (21, '08:00:00', '17:00:00'), (22, '08:00:00', '17:00:00'),
    (23, '08:00:00', '17:00:00'), (24, '08:00:00', '17:00:00'),
    (25, '08:00:00', '17:00:00'), (26, '08:00:00', '17:00:00'),
    (27, '08:00:00', '17:00:00'), (28, '08:00:00', '17:00:00'),
    (29, '08:00:00', '17:00:00'), (30, '08:00:00', '17:00:00'),
    (31, '08:00:00', '17:00:00'), (32, NULL, NULL), 
    (33, '08:00:00', '17:00:00'), (34, '08:00:00', '17:00:00'), 
    (35, '08:00:00', '17:00:00'), (36, NULL, NULL), 
    (37, '08:00:00', '17:00:00'), (38, '08:00:00', '17:00:00'), 
    (39, NULL, NULL), (40, '08:00:00', '17:00:00'), 
    (41, '08:00:00', '17:00:00'), (42, '08:00:00', '17:00:00'), 
    (43, NULL, NULL), (44, '08:00:00', '17:00:00'), 
    (45, '08:00:00', '17:00:00'), (46, NULL, NULL), 
    (47, '08:00:00', '17:00:00'), (48, '08:00:00', '17:00:00'), 
    (49, '08:00:00', '17:00:00'), (50, '08:00:00', '17:00:00');