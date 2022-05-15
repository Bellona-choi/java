desc hubo; #후보 테이블의 구조 확인

delete from hubo where kiho>0; #기호가 0보다 큰 행 다 삭제
insert into hubo values(1,"나연","세금 감소"); #기호1번 나연 데이터
insert into hubo values(2,"정연","주4일제 실현");#기호2번 정연 데이터
insert into hubo values(3,"모모","최저 임금 폐지");#기호3번 모모 데이터
insert into hubo values(4,"사나","노조 폐지");#기호4번 사나 데이터
insert into hubo values(5,"지효","검찰 개혁");#기호5번 지효 데이터
insert into hubo values(6,"미나","가구당 2억 주기");#기호6번 미나 데이터
insert into hubo values(7,"다현","한미동맹 파기");#기호7번 다현 데이터
insert into hubo values(8,"채영","북진 통일");#기호8번 채영 데이터
insert into hubo values(9,"쯔위","평화 통일");#기호9번 쯔위 데이터
select kiho as 기호, name as 성명, gongyak as 공약 from hubo; #기호, 성명, 공약 후보 테이블에서 조회.



delete from typyo where kiho > 0;#기호가 0보다 큰 레코드 값 삭제.
drop PROCEDURE IF EXISTS insert_tupyo;#insert_tupyo 프로시져가 존재할 경우 삭제.
DELIMITER $$   
#프로시져 시작을 알리는 문장.
Create PROCEDURE insert_tupyo( _limit integer) 
#프로시져 insert_tupyo를 생성. _limit를 매개변수로 받음.
BEGIN
#프로시져 내용 시작.
DECLARE _cnt integer; #_cnt 정수형 변수 선언.(반복문 빠져나가기 위함)
SET _cnt = 0; #_cnt 값을 0으로 초기화.
   _loop: LOOP
    -- 반복문 시작.
      SET _cnt = _cnt + 1;#한 번 반복할 때마다 1씩 더해준다.
        Insert Into tupyo Value (rand()*8+1,rand()*8+1); #기호와 연령대에 1~9까지 무작위로 삽입한다.	
        IF _cnt = _limit Then#만약 _cnt가 마지막이라면
         Leave _loop;#반복문문 종료
        END IF;#if문 종료
   END LOOP _loop;#반복문 종료
END $$#프로시저 종료
DELIMITER ;
call insert_tupyo(1000);
select kiho as 기호, name as 성명, gongyak as 공약 from hubo;

select kiho as 투표한기호, age*10 as 투표자연령대 from hubo_tupyo;         
select kiho, count(*) from hubo_tupyo group by kiho;

-- join hubo_tupyo테이블을 a로 지정, hubo테이블을 b로지정 hubo테이블의 이름과 공약 hubo_tupyo테이블의 kiho컬럼을 count해서 득표수로 지정 후 출력
select b.name as 이름, b.gongyak as 공약, count(a.kiho) as 득표수 from hubo_tupyo as a , hubo as b
   where a.kiho = b.kiho group by a.kiho; 
   
-- select안에 select문 (hubo테이블의 name,gongyak을 이름,공약 컬럼으로 지정),(hubo_tupyo테이블의 kiho컬럼을 count해서 득표수로 지정 후 출력)
select (select name from hubo where kiho = a.kiho) as 이름,(select gongyak from hubo where kiho = a.kiho) as 공약,
count(a.kiho) as 득표수 from hubo_tupyo as a group by a.kiho;
-- ================================================================
-- 호감도 투표2 시작 
drop table if exists tupyo2;
create table tupyo2(kiho1 int, kiho2 int, kiho3 int, age int);
desc tupyo2;
-- ======================================    프로시져 생성 부분
-- delete from tupyo2 where tupyo2 > 0;#기호가 0보다 큰 레코드 값 삭제.
drop PROCEDURE IF EXISTS insert_tupyo2;#insert_tupyo2 프로시져가 존재할 경우 삭제.
DELIMITER $$   
#프로시져 시작을 알리는 문장
Create PROCEDURE insert_tupyo2( _limit integer) 
#프로시져 insert_tupyo를 생성. _limit를 매개변수로 받음.
BEGIN
#프로시져 내용 시작.
DECLARE _cnt integer; #_cnt 정수형 변수 선언.(반복문 빠져나가기 위함)
SET _cnt = 0; #_cnt 값을 0으로 초기화.
   _loop: LOOP
    -- 반복문 시작.
      SET _cnt = _cnt + 1;#한 번 반복할 때마다 1씩 더해준다.
        Insert Into tupyo2 Value (rand()*8+1,rand()*8+1,rand()*8+1,rand()*8+1); #기호와 연령대에 1~9까지 무작위로 삽입한다.
        IF _cnt = _limit Then #만약 _cnt가 _limit(지정한 값)이라면
         Leave _loop; #_loop 종료 하기
        END IF; #if문 종료
   END LOOP _loop; #_loop 종료
END $$ #프로시저 종료
DELIMITER ;
call insert_tupyo2(1000);  #  insert_tupyo2프로시저에 값을 1000입력
-- ============================ 호감도 투표 2 시작
select * from tupyo2; #tupyo2 출력


-- join
-- tupyo2컬럼의 age의 index값을 연령댜 컬럼으로,  hubo컬럼의 이름을 h1,h2,h3로 지정
select a.age*10 as 연령대,h1.name as 투표1,h2.name as 투표2,h3.name as 투표3 
from tupyo2 as a, hubo as h1, hubo as h2, hubo as h3
where a.kiho1 = h1.kiho and a.kiho2 = h2.kiho and a.kiho3 = h3.kiho;

-- select문 안에 select문
select age*10 as 연령대,
(select name from hubo where a.kiho1=kiho) as 투표1, 
(select name from hubo where a.kiho2=kiho) as 투표2,
(select name from hubo where a.kiho3=kiho) as 투표3
 from tupyo2 as a;  
 -- ============================ 호감도 투표 3,4 시작
 -- select문 안에 select문 호감도 투표 4
 select 
 (select count(*) from tupyo2 where kiho1 = 1 or kiho2 = 1 or kiho3 = 1) as "나연",
 (select count(*) from tupyo2 where kiho1 = 2 or kiho2 = 2 or kiho3 = 2) as "정연",
 (select count(*) from tupyo2 where kiho1 = 3 or kiho2 = 3 or kiho3 = 3) as "모모",
 (select count(*) from tupyo2 where kiho1 = 4 or kiho2 = 4 or kiho3 = 4) as "사나",
 (select count(*) from tupyo2 where kiho1 = 5 or kiho2 = 5 or kiho3 = 5) as "지효",
 (select count(*) from tupyo2 where kiho1 = 6 or kiho2 = 6 or kiho3 = 6) as "미나",
 (select count(*) from tupyo2 where kiho1 = 7 or kiho2 = 7 or kiho3 = 7) as "다현",
 (select count(*) from tupyo2 where kiho1 = 8 or kiho2 = 8 or kiho3 = 8) as "채영",
 (select count(*) from tupyo2 where kiho1 = 9 or kiho2 = 9 or kiho3 = 9) as "쯔위",
 ((select count(*) from tupyo2 where kiho1 = 1 or kiho2 = 1 or kiho3 = 1)+
 (select count(*) from tupyo2 where kiho1 = 2 or kiho2 = 2 or kiho3 = 2)+
 (select count(*) from tupyo2 where kiho1 = 3 or kiho2 = 3 or kiho3 = 3)+
 (select count(*) from tupyo2 where kiho1 = 4 or kiho2 = 4 or kiho3 = 4)+
 (select count(*) from tupyo2 where kiho1 = 5 or kiho2 = 5 or kiho3 = 5)+
 (select count(*) from tupyo2 where kiho1 = 6 or kiho2 = 6 or kiho3 = 6)+
 (select count(*) from tupyo2 where kiho1 = 7 or kiho2 = 7 or kiho3 = 7)+
 (select count(*) from tupyo2 where kiho1 = 8 or kiho2 = 8 or kiho3 = 8)+
 (select count(*) from tupyo2 where kiho1 = 9 or kiho2 = 9 or kiho3 = 9)) as "총합",
 (select count(*) from tupyo2 where kiho1=kiho2 or kiho1 = kiho3 or kiho2 = kiho3) as "2중복",
 (select count(*) from tupyo2 where kiho1=kiho2 and kiho1=kiho3) as "3중복"
 from tupyo2 limit 1;
 
-- =======================================================================여기서부터 examtable4 시작   

--  examtable4만들고 임의로 1000명 집어넣기
use kopoctc;
drop table if exists examtable4; #examtable4테이블 제거
create table examtable4( name varchar(20),id int not null primary key, kor int, eng int, mat int); #examtable4 만들기
desc examtable4;
delete from examtable4 where id > 0; #id가 0보다 큰 레코드 값 삭제.
DROP PROCEDURE IF EXISTS insert_examtable4; #insert_examtable4프로시저 제거
# 프로시저 시작
DELIMITER $$    
Create PROCEDURE insert_examtable4(_limit integer) #insert_examtable4프로시저 생성
BEGIN
DECLARE _name varchar(20); #내부에서 사용할 값
DECLARE _id integer; #내부에서 사용할 값
DECLARE _cnt integer; #내부에서 사용할 값
SET _cnt = 0; #set으로 _cnt값 지정
   _loop: LOOP #반복문 시작
      SET _cnt = _cnt + 1; #set으로 돌때마다 _cnt+1
      SET _name = concat("홍길", cast(_cnt as char(4))) ; #set으로 이름 지정
      SET _id = 209900+_cnt; #set으로 _id지정 및 돌때마다 +1
      Insert into examtable4 value(_name,_id,rand()*100, rand()*100, rand()*100); #examtable4의 값을 추가하기
    
      IF _cnt = _limit THEN #만약 _cnt가 지정한 값이 되면
         LEAVE _loop; #반복문을 나가기
      END IF; # if문 종료
   END LOOP _loop; #반복문 종료
END $$ 
DELIMITER ; #프로시저 종료
call insert_examtable4(1000); #insert_examtable4 호출 및 값 지정(1000)
select * from examtable4; #examtable4보기

-- ========================== examview view 만들기

DROP view if exists examview; #examview 제거
create view examview(name,id,kor,eng,mat,tot,ave,ranking) #examview 만들기
as select *, #이름,학번,국어,영어,수학
   b.kor+b.eng+b.mat, #총점
   (b.kor+b.eng+b.mat)/3,#평균
    (select count(*) + 1 from examtable4 as a 
      where (a.kor+a.eng+a.mat) > (b.kor + b.eng + b.mat)) #등수
        from examtable4 as b;
select * from examview; #뷰 전체 출력.
select name, ranking from examview; #뷰에서 이름과 등수만 출력.

select * from examview where ranking > 5 order by ranking asc; #examview에 랭킹이 5이상인 것만 출력
insert into examview values("나연",309933,100,100,100,300,100,1); #examview 값을 추가하지만 오류
   
   
-- insert 안에 select 사용하기   
drop table if exists examtableEX;
create table examtableEX(
      name varchar(20), id int not null primary key, kor int, eng int, mat int,sum int, ave double, ranking int);
desc examtableEX;

# insert 안에 select 사용해서 examtableEX에 값 집어넣기
insert into examtableEX
   select *,b.kor+b.eng+b.mat,(b.kor+b.eng+b.mat)/3,(select count(*)+1 from examtable4 as a 
    where (a.kor+a.eng+a.mat) > (b.kor+b.eng+b.mat)) from examtable4 as b;
 #  examtableEX테이블에 ranking을 기준으로 내림차순 후 출력
select * from examtableEX order by ranking desc;    
-- ++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 시험처리 시작
use kopoctc;
drop table if exists Answer; #Answer테이블 제거
-- 정답 답안지 테이블 생성.
create table Answer(
   subjectID int not null primary key,
    a01 int, a02 int, a03 int, a04 int, a05 int, a06 int, a07 int, a08 int, a09 int, a10 int,
    a11 int, a12 int, a13 int, a14 int, a15 int, a16 int, a17 int, a18 int, a19 int, a20 int);
    drop table if exists Testing;
-- 답안지 테이블 생성    
    create table Testing(
      subjectID int not null, stu_name varchar(20),
        stu_id int not null,
        a01 int, a02 int, a03 int, a04 int, a05 int, a06 int, a07 int, a08 int, a09 int, a10 int,
        a11 int, a12 int, a13 int, a14 int, a15 int, a16 int, a17 int, a18 int, a19 int, a20 int,
        primary key(subjectID,stu_id));
   drop table if exists Scoring;
 -- 채점 테이블 생성   
    create table Scoring(
    subjectID int not null,
    stu_name varchar(20),stu_id int not null,
    a01 int, a02 int, a03 int, a04 int, a05 int, a06 int, a07 int, a08 int, a09 int, a10 int,
   a11 int, a12 int, a13 int, a14 int, a15 int, a16 int, a17 int, a18 int, a19 int, a20 int,
    score int, primary key(subjectID, stu_id));
    
    drop table if exists ReportTable;
-- 채점 리포트 테이블 생성
    create table ReportTable(
    stu_name varchar(20),stu_id int not null,
    kor int, eng int, mat int, primary key(stu_id));
desc Answer;#Answer 테이블 확인
desc Testing;#Testing 테이블 확인
desc Scoring;#Scoring 테이블 확인
desc ReportTable;# ReportTable 테이블 확인

-- 답안 데이터 넣기
desc Answer;
insert into Answer value
(1, rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,
rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1);
#국어 과목코드는 1이고, 답을 임의로 넣어줌. 보기는 4개
insert into Answer value
(2, rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,
rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1);
#영어 과목코드는 2이고, 답을 임의로 넣어줌. 보기는 4개
insert into Answer value
(3, rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,
rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1);
#수학 과목코드는 3이고, 답을 임의로 넣어줌. 보기는 4개
select * from Answer; #값이 잘 들어갔는지 확인하기.
-- 답안 데이터 과목별로 다 집어 넣음.

-- ================================ 홍길동 답안지 답 넣기 =====================================
use kopoctc;
drop table Testing;
create table Testing(
      subjectID int not null, stu_name varchar(20),
        stu_id int not null,
        a01 int, a02 int, a03 int, a04 int, a05 int, a06 int, a07 int, a08 int, a09 int, a10 int,
        a11 int, a12 int, a13 int, a14 int, a15 int, a16 int, a17 int, a18 int, a19 int, a20 int,
        primary key(subjectID,stu_id));
        
-- insert into Testing value();
-- drop table if exists Testing;
desc Testing;
delete from Testing where subjectID > 0;
DROP PROCEDURE IF EXISTS insert_Testing;
DELIMITER $$    
Create PROCEDURE insert_Testing(_limit integer)
BEGIN
DECLARE _name varchar(20);
DECLARE _id integer;
DECLARE _cnt integer;
SET _cnt = 0;
      _loop: LOOP
         SET _cnt = _cnt + 1;
         SET _name = concat("홍길동", cast(_cnt as char(6))) ;
         SET _id = 209900+_cnt;
         Insert into Testing value(1,_name,_id,
            rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,
            rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1);
          Insert into Testing value(2,_name,_id,
            rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,
            rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1);
         Insert into Testing value(3,_name,_id,
            rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,
            rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1,rand()*3+1);
            
         IF _cnt = _limit THEN
            LEAVE _loop;
         END IF;
      END LOOP _loop;
END $$
DELIMITER ;
call insert_Testing(1000);
select * from Testing;
select count(*) from Testing;

-- ================================================채점하기==========================================
use kopoctc;
desc Scoring;
select * from Scoring;    
delete from Scoring where subjectID >0;
insert into Scoring select b.subjectID,b.stu_name,b.stu_id,
(select count(*) from Answer as a where b.a01 = a.a01 and b.subjectID=a.subjectID),(select count(*) from Answer as a where b.a02 = a.a02 and b.subjectID=a.subjectID),
(select count(*) from Answer as a where b.a03 = a.a03 and b.subjectID=a.subjectID),(select count(*) from Answer as a where b.a04 = a.a04 and b.subjectID=a.subjectID),
(select count(*) from Answer as a where b.a05 = a.a05 and b.subjectID=a.subjectID),(select count(*) from Answer as a where b.a06 = a.a06 and b.subjectID=a.subjectID),
(select count(*) from Answer as a where b.a07 = a.a07 and b.subjectID=a.subjectID),(select count(*) from Answer as a where b.a08 = a.a08 and b.subjectID=a.subjectID),
(select count(*) from Answer as a where b.a09 = a.a09 and b.subjectID=a.subjectID),(select count(*) from Answer as a where b.a10 = a.a10 and b.subjectID=a.subjectID),
(select count(*) from Answer as a where b.a11 = a.a11 and b.subjectID=a.subjectID),(select count(*) from Answer as a where b.a12 = a.a12 and b.subjectID=a.subjectID),
(select count(*) from Answer as a where b.a13 = a.a13 and b.subjectID=a.subjectID),(select count(*) from Answer as a where b.a14 = a.a14 and b.subjectID=a.subjectID),
(select count(*) from Answer as a where b.a15 = a.a15 and b.subjectID=a.subjectID),(select count(*) from Answer as a where b.a16 = a.a16 and b.subjectID=a.subjectID),
(select count(*) from Answer as a where b.a17 = a.a17 and b.subjectID=a.subjectID),(select count(*) from Answer as a where b.a18 = a.a18 and b.subjectID=a.subjectID),
(select count(*) from Answer as a where b.a19 = a.a19 and b.subjectID=a.subjectID),(select count(*) from Answer as a where b.a20 = a.a20 and b.subjectID=a.subjectID),
(((select count(*) from Answer as a where b.a01 = a.a01 and b.subjectID=a.subjectID)+(select count(*) from Answer as a where b.a02 = a.a02 and b.subjectID=a.subjectID)+
(select count(*) from Answer as a where b.a03 = a.a03 and b.subjectID=a.subjectID)+(select count(*) from Answer as a where b.a04 = a.a04 and b.subjectID=a.subjectID)+
(select count(*) from Answer as a where b.a05 = a.a05 and b.subjectID=a.subjectID)+(select count(*) from Answer as a where b.a04 = a.a04 and b.subjectID=a.subjectID)+
(select count(*) from Answer as a where b.a07 = a.a07 and b.subjectID=a.subjectID)+(select count(*) from Answer as a where b.a08 = a.a08 and b.subjectID=a.subjectID)+
(select count(*) from Answer as a where b.a09 = a.a09 and b.subjectID=a.subjectID)+(select count(*) from Answer as a where b.a10 = a.a10 and b.subjectID=a.subjectID)+
(select count(*) from Answer as a where b.a11 = a.a11 and b.subjectID=a.subjectID)+(select count(*) from Answer as a where b.a12 = a.a12 and b.subjectID=a.subjectID)+
(select count(*) from Answer as a where b.a13 = a.a13 and b.subjectID=a.subjectID)+(select count(*) from Answer as a where b.a14 = a.a14 and b.subjectID=a.subjectID)+
(select count(*) from Answer as a where b.a15 = a.a15 and b.subjectID=a.subjectID)+(select count(*) from Answer as a where b.a16 = a.a16 and b.subjectID=a.subjectID)+
(select count(*) from Answer as a where b.a17 = a.a17 and b.subjectID=a.subjectID)+(select count(*) from Answer as a where b.a18 = a.a18 and b.subjectID=a.subjectID)+
(select count(*) from Answer as a where b.a19 = a.a19 and b.subjectID=a.subjectID)+(select count(*) from Answer as a where b.a20 = a.a20 and b.subjectID=a.subjectID)))*5 as Score from Testing as b; 
desc ReportTable;
desc Scoring;
select * from Scoring;
select * from Testing;  
select * from ReportTable; 

-- 채점리포트테이블에 값 추가하기

drop view if exists  ReportTable_view;
create view ReportTable_view(stu_name,stu_id,kor,eng,mat)
as select a.stu_name,a.stu_id,(select b.score from Scoring as b where subjectID = 1 and b.stu_id = a.stu_id),
(select b.score from Scoring as b where subjectID = 2 and b.stu_id = a.stu_id),(select b.score from Scoring as b where subjectID = 3 and b.stu_id = a.stu_id) from Testing as a;



insert into ReportTable (stu_name, stu_id, kor, eng, mat)select distinct a.stu_name,a.stu_id,(select b.score from Scoring as b where subjectID = 1 and b.stu_id = a.stu_id),
(select b.score from Scoring as b where subjectID = 2 and b.stu_id = a.stu_id),(select b.score from Scoring as b where subjectID = 3 and b.stu_id = a.stu_id) from Testing as a;

-- 채점리포트테이블 확인
select * from ReportTable; 
-- 채점리포트테이블 개수확인
select count(*) from ReportTable; 
-- 채점리포트 합 평균 랭크

select *,b.kor+b.eng+b.mat as sum,(b.kor+b.eng+b.mat)/3 as ave,(select count(*)+1 from ReportTable as a 
where (a.kor+a.eng+a.mat) > (b.kor+b.eng+b.mat)) as ranking from ReportTable as b;

-- 과목별 득점자수와 득점률
-- 국어 
select kor, count(*) as 득점자수, count(kor)/(select count(*) from ReportTable)*100 as 득점율 from ReportTable group by kor order by 득점자수 desc;

-- 영어
select eng, count(*) as 득점자수, count(eng)/(select count(*) from ReportTable)*100 as 득점율 from ReportTable group by eng order by 득점자수 desc;

-- 수학
select mat, count(*) as 득점자수, count(mat)/(select count(*) from ReportTable)*100 as 득점율 from ReportTable group by mat order by 득점자수 desc;



-- 문제별 득점자수와 득점률
select a01, count(*) as 득점자수, count(a01)/(select count(*) from Scoring)*100 as 득점율 from Scoring group by a01 order by 득점자수 desc;
select a02, count(*) as 득점자수, count(a02)/(select count(*) from Scoring)*100 as 득점율 from Scoring group by a02 order by 득점자수 desc;
select a03, count(*) as 득점자수, count(a03)/(select count(*) from Scoring)*100 as 득점율 from Scoring group by a03 order by 득점자수 desc;
select a04, count(*) as 득점자수, count(a04)/(select count(*) from Scoring)*100 as 득점율 from Scoring group by a04 order by 득점자수 desc;
select a05, count(*) as 득점자수, count(a05)/(select count(*) from Scoring)*100 as 득점율 from Scoring group by a05 order by 득점자수 desc;
select a06, count(*) as 득점자수, count(a06)/(select count(*) from Scoring)*100 as 득점율 from Scoring group by a06 order by 득점자수 desc;
select a07, count(*) as 득점자수, count(a07)/(select count(*) from Scoring)*100 as 득점율 from Scoring group by a07 order by 득점자수 desc;
select a08, count(*) as 득점자수, count(a08)/(select count(*) from Scoring)*100 as 득점율 from Scoring group by a08 order by 득점자수 desc;
select a09, count(*) as 득점자수, count(a09)/(select count(*) from Scoring)*100 as 득점율 from Scoring group by a09 order by 득점자수 desc;
select a10, count(*) as 득점자수, count(a10)/(select count(*) from Scoring)*100 as 득점율 from Scoring group by a10 order by 득점자수 desc;
select a11, count(*) as 득점자수, count(a11)/(select count(*) from Scoring)*100 as 득점율 from Scoring group by a11 order by 득점자수 desc;
select a12, count(*) as 득점자수, count(a12)/(select count(*) from Scoring)*100 as 득점율 from Scoring group by a12 order by 득점자수 desc;
select a13, count(*) as 득점자수, count(a13)/(select count(*) from Scoring)*100 as 득점율 from Scoring group by a13 order by 득점자수 desc;
select a14, count(*) as 득점자수, count(a14)/(select count(*) from Scoring)*100 as 득점율 from Scoring group by a14 order by 득점자수 desc;
select a15, count(*) as 득점자수, count(a15)/(select count(*) from Scoring)*100 as 득점율 from Scoring group by a15 order by 득점자수 desc;
select a16, count(*) as 득점자수, count(a16)/(select count(*) from Scoring)*100 as 득점율 from Scoring group by a16 order by 득점자수 desc;
select a17, count(*) as 득점자수, count(a17)/(select count(*) from Scoring)*100 as 득점율 from Scoring group by a17 order by 득점자수 desc;
select a18, count(*) as 득점자수, count(a18)/(select count(*) from Scoring)*100 as 득점율 from Scoring group by a18 order by 득점자수 desc;
select a19, count(*) as 득점자수, count(a19)/(select count(*) from Scoring)*100 as 득점율 from Scoring group by a19 order by 득점자수 desc;
select a20, count(*) as 득점자수, count(a20)/(select count(*) from Scoring)*100 as 득점율 from Scoring group by a20 order by 득점자수 desc;

-- 국어 문재당 득점자수 득점율
drop table korScore;
create table korScore(number varchar(20),collectCnt int);
insert into korScore values('a01',(select count(a01) from Scoring where subjectID = 1 and a01 =1));
insert into korScore values('a02',(select count(a02) from Scoring where subjectID = 1 and a02 =1));
insert into korScore values('a03',(select count(a03) from Scoring where subjectID = 1 and a03 =1));
insert into korScore values('a04',(select count(a04) from Scoring where subjectID = 1 and a04 =1));
insert into korScore values('a05',(select count(a05) from Scoring where subjectID = 1 and a05 =1));
insert into korScore values('a06',(select count(a06) from Scoring where subjectID = 1 and a06 =1));
insert into korScore values('a07',(select count(a07) from Scoring where subjectID = 1 and a07 =1));
insert into korScore values('a08',(select count(a08) from Scoring where subjectID = 1 and a08 =1));
insert into korScore values('a09',(select count(a09) from Scoring where subjectID = 1 and a09 =1));
insert into korScore values('a10',(select count(a10) from Scoring where subjectID = 1 and a10 =1));
insert into korScore values('a11',(select count(a11) from Scoring where subjectID = 1 and a11 =1));
insert into korScore values('a12',(select count(a12) from Scoring where subjectID = 1 and a12 =1));
insert into korScore values('a13',(select count(a13) from Scoring where subjectID = 1 and a13 =1));
insert into korScore values('a14',(select count(a14) from Scoring where subjectID = 1 and a14 =1));
insert into korScore values('a15',(select count(a15) from Scoring where subjectID = 1 and a15 =1));
insert into korScore values('a16',(select count(a16) from Scoring where subjectID = 1 and a16 =1));
insert into korScore values('a17',(select count(a17) from Scoring where subjectID = 1 and a17 =1));
insert into korScore values('a18',(select count(a18) from Scoring where subjectID = 1 and a18 =1));
insert into korScore values('a19',(select count(a19) from Scoring where subjectID = 1 and a19 =1));
insert into korScore values('a20',(select count(a20) from Scoring where subjectID = 1 and a20 =1));       
select number as 문제,collectCnt as 득점자수,collectCnt/1000*100 as 득점율 from korScore;


drop table eng_Score;
create table eng_Score(number varchar(20),collectCnt int);
insert into eng_Score values('a01',(select count(a01) from Scoring where subjectID = 2 and a01 =1));
insert into eng_Score values('a02',(select count(a02) from Scoring where subjectID = 2 and a02 =1));
insert into eng_Score values('a03',(select count(a03) from Scoring where subjectID = 2 and a03 =1));
insert into eng_Score values('a04',(select count(a04) from Scoring where subjectID = 2 and a04 =1));
insert into eng_Score values('a05',(select count(a05) from Scoring where subjectID = 2 and a05 =1));
insert into eng_Score values('a06',(select count(a06) from Scoring where subjectID = 2 and a06 =1));
insert into eng_Score values('a07',(select count(a07) from Scoring where subjectID = 2 and a07 =1));
insert into eng_Score values('a08',(select count(a08) from Scoring where subjectID = 2 and a08 =1));
insert into eng_Score values('a09',(select count(a09) from Scoring where subjectID = 2 and a09 =1));
insert into eng_Score values('a10',(select count(a10) from Scoring where subjectID = 2 and a10 =1));
insert into eng_Score values('a11',(select count(a11) from Scoring where subjectID = 2 and a11 =1));
insert into eng_Score values('a12',(select count(a12) from Scoring where subjectID = 2 and a12 =1));
insert into eng_Score values('a13',(select count(a13) from Scoring where subjectID = 2 and a13 =1));
insert into eng_Score values('a14',(select count(a14) from Scoring where subjectID = 2 and a14 =1));
insert into eng_Score values('a15',(select count(a15) from Scoring where subjectID = 2 and a15 =1));
insert into eng_Score values('a16',(select count(a16) from Scoring where subjectID = 2 and a16 =1));
insert into eng_Score values('a17',(select count(a17) from Scoring where subjectID = 2 and a17 =1));
insert into eng_Score values('a18',(select count(a18) from Scoring where subjectID = 2 and a18 =1));
insert into eng_Score values('a19',(select count(a19) from Scoring where subjectID = 2 and a19 =1));
insert into eng_Score values('a20',(select count(a20) from Scoring where subjectID = 2 and a20 =1));         

select number as 문제,collectCnt as 영어득점자수,collectCnt/1000*100 as 영어득점율 from eng_Score;

-- P25
drop table reservation;
create table reservation(
	name varchar(10),
    reserve_date date,
    room int,
    addr varchar(20),
    tel varchar(20),
    ipgum_name varchar(20),
    memo varchar(50),
    input_date timestamp default NOW());
insert into reservation values("나연","2021-05-09",2,"서울","010-0101-0101","나연","따듯한방 주세요",NOW());
insert into reservation values("정연","2021-05-09",3,"서울","010-0101-0101","나연","따듯한방 주세요",NOW());
insert into reservation values("모모","2021-05-10",1,"서울","010-0101-0101","나연","따듯한방 주세요",NOW());
insert into reservation values("사나","2021-05-12",1,"서울","010-0101-0101","나연","따듯한방 주세요",NOW());
insert into reservation values("지효","2021-05-13",1,"서울","010-0101-0101","나연","따듯한방 주세요",NOW());

-- reservation 출력 확인
select * from reservation;
use kopoctc;
-- 예약 프로시저
drop procedure if exists resvstat_calc;
DELIMITER $$
create procedure resvstat_calc()
begin
	declare _date date;
    declare _cnt integer;
    declare _room1 varchar(20);
    declare _room2 varchar(20);
    declare _room3 varchar(20);
    
    set _date = date_format(now(),'%Y-%m-%d');
    SET _cnt=0;
    
    -- 테이블 만들기
	drop table if exists reserv_stat;
    create table reserv_stat(
		reserv_date date not null,
        room1 varchar(20),
        room2 varchar(20),
        room3 varchar(20),
        primary key(reserv_date));
	delete from reserve_stat;  
	_loop: LOOP
      SET _cnt = _cnt + 1;
     
       insert into reserv_stat (reserv_date, room1, room2, room3)
         select distinct (date_add(date_format(now(),'%Y-%m-%d'), interval _cnt day)),
            (select ifnull((select a.name from reservation as a where a.reserv_date = (date_add(date_format(now(),'%Y-%m-%d'), interval _cnt day)) and a.room =1), '예약가능')),
            (select ifnull((select a.name from reservation as a where a.reserv_date = (date_add(date_format(now(),'%Y-%m-%d'), interval _cnt day)) and a.room =2), '예약가능')),
            (select ifnull((select a.name from reservation as a where a.reserv_date = (date_add(date_format(now(),'%Y-%m-%d'), interval _cnt day)) and a.room =3), '예약가능'))
         from reservation as a;
         select * from reserv_stat;

    
      IF _cnt = 30 THEN
         LEAVE _loop;
      END IF;
   END LOOP _loop;
END $$
DELIMITER ;
call resvstat_calc();
select * from resvstat_calc;