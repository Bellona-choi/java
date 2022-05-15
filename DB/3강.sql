use kopoctc;
drop procedure if exists get_sum;#프로시저 제거
DELIMITER $$#프로시저 시작
create procedure get_sum(#프로시저 in, out 정의
	in _id integer,#_id는 인트형태로
    out _name varchar(20),#_name은 char형태20자 이내로
    out _sum integer #_sum은 인트형태로
)
begin
	declare _kor integer;#내부에서 사용되는 국어변수지정
    declare _eng integer;#내부에서 사용되는 영어변수지정
    declare _mat integer;#내부에서 사용되는 수학변수지정
    set _kor=0;#set으로 정의하고 국어점수를 넣는다
    
    select name, kor, eng, mat 
		into _name, _kor, _eng, _mat from examtable where id = _id;#결과를 변수로 받기
        
	set _sum = _kor+_eng+_mat;
end $$
DELIMITER ;#프로시저 종료

call get_sum(209901,@name,@sum);#만든 get_sum 프로시저 호출
select @name,@sum;#결과값 보기(@이는 프로시저에서 사용)

drop function if exists f_get_sum;#프로시저 제거
DELIMITER $$#프로시저 시작
create function f_get_sum(_id integer) returns integer #프로시저 만들고 리턴값 정의
begin
	declare _sum integer; #내부에서 사용되는 변수지정
    select kor+eng+mat into _sum from examtable where id=_id; #_sum컬럼 생성하고 변수 받기examtable id기준
return _sum;#리턴값
end $$#리턴값 보내기
DELIMITER ; #프로시저 종료
select * ,f_get_sum(id) from examtable;
show global variables like 'log_bin_trust_function_creators';
set global log_bin_trust_function_creators = 'on';

drop procedure if exists insert_examtable;#프로시저 제거
#프로시저 시작
DELIMITER $$
#프로시저 만들기
create procedure insert_examtable(_last integer)
begin
declare _name varchar(20); #내부에서 사용되는 변수 정의
declare _id integer; #내부에서 사용되는 변수 정의
declare _cnt integer; #내부에서 사용되는 변수 정의
set _cnt=0;  #set으로 정의하고 _cnt를 0대입
-- delete from examtable where id>0;
	_loop:LOOP #반복문
		SET _cnt = _cnt+1; #반복문이 돌때마다 _cnt +1추가 및 정의
        set _name = concat("홍길",cast(_cnt as char(4))); #이름에 _cnt를 합해준다 _cnt는 char형태로 4이하
        set _id =209900+_cnt; #_id 는 209900부터 시작하고 _cnt를 합해준다
        insert into examtable value(_name,_id,rand()*100,rand()*100,rand()*100); #이름, id 국어(랜덤),영어(랜덤),수학(랜덤)점수 추가
        
        if _cnt=_last then #만약 _cnt가 프로시저를 만들때 정의해준 _last이라면
			leave _loop; # 반복문을 나간다
		end if; #if문 종료
	end loop _loop; #_loop의 조건이 맞으면 반복문 종료
#리턴값 보내기
end $$ 

call insert_examtable(1000);#insert_examtable을 호출(1000번)
select * from examtable; #examtable의 모든 필드 선택
select *, kor+eng+mat as sum, (kor+eng+mat)/3 as ave from examtable limit 30,59; #kor+eng+mat을 sum으로 정의,(kor+eng+mat)/3을 ave로 정의하고 sum기준으로 오름차순

drop table examtable;#테이블 제거
create table examtable(#테이블 생성
	name varchar(20),#테이블 name컬럼은 char형태로 20글자까지
    id int not null, #테이블 id 컬럼은 빈칸이 될수 없고 int형태로
    kor int, #테이블 kor컬럼은 int형태로
    eng int, #테이블 eng컬럼은 int형태로
    mat int, #테이블 mat컬럼은 int형태로
    primary key(id)); #테이블 primary key는 id컬럼으로 지정

DROP PROCEDURE IF EXISTS print_rank; #프로시저 제거
#프로시저시작
DELIMITER $$
CREATE PROCEDURE print_rank(_last integer)#프로시저 정의
BEGIN
declare _name varchar(20); #내부에서 사용되는 변수 정의
declare _id integer; #내부에서 사용되는 변수 정의
declare _cnt integer; #내부에서 사용되는 변수 정의
set _cnt=0;  #set으로 정의하고 _cnt를 0대입
-- delete from examtable where id>0;
	_loop:LOOP #반복문
		SET _cnt = _cnt+1; #반복문이 돌때마다 _cnt +1추가 및 정의
        set _name = concat("홍길",cast(_cnt as char(4))); #이름에 _cnt를 합해준다 _cnt는 char형태로 4이하
        set _id =220000+_cnt; #_id 는 209900부터 시작하고 _cnt를 합해준다
        insert into examtable value(_name,_id,rand()*100,rand()*100,rand()*100); #이름, id 국어(랜덤),영어(랜덤),수학(랜덤)점수 추가
        
        if _cnt=_last then #만약 _cnt가 프로시저를 만들때 정의해준 _last이라면
			leave _loop; # 반복문을 나간다
		end if; #if문 종료
	end loop _loop; #_loop의 조건이 맞으면 반복문 종료
#리턴값 보내기
end $$ 
   
call print_rank(100); #print_rank 호출(100)

select *, (b.kor+b.eng+b.mat) as 총점, (b.kor+b.eng+b.mat)/3 as 평균, (# 내부에서 사용되는 변수 정의(총점,평균)
select count(*)+1 from examtable as a where (a.kor+a.eng+a.mat) > (b.kor+b.eng+b.mat)) as 등수 from examtable as b order by 등수 asc;# 내부에서 사용되는 변수 정의(등수,내림차순)

-- Training(1)

# 성적 테이블 만들기
drop table examtableTest;#테이블 삭제
create table examtableTest(id int, name varchar(10), kor int, eng int, mat int);#테이블 생성(학번,이름,국어,영어,수학)


# 중복 프로시저 삭제
DROP PROCEDURE IF EXISTS insert_examtableTest;
# 프로시저 선언
DELIMITER $$
CREATE PROCEDURE insert_examtableTest(_last integer)
BEGIN
   DECLARE _name varchar(20);#내부에서 사용되는 변수지정(이름)
    DECLARE _id integer;#내부에서 사용되는 변수지정(id)
    DECLARE _cnt integer;#내부에서 사용되는 변수지정
    SET _cnt=0;#set으로 _cnt선언
    -- delete from examtable where id > 0;
      _loop: LOOP#반복문 시작
        SET _cnt = _cnt+1;#반복문이 돌떄마다 _cnt+1
		SET _name = concat("홍길",cast(_cnt as char(4))); #이름에 _cnt를 합해준다 _cnt는 char형태로 4이하
        SET _id = _cnt; #_id는 _cnt로 정의
    
         INSERT INTO examtableTest VALUE (_cnt ,_name, rand()*100 + 1, rand()*100 + 1, rand()*100 + 1); #examtableTest테이블에 값을 넣어준다(id,이름,(국,영,수(점수)))
            
            IF _cnt = _last THEN #만약 _cnt가 지정해준(_last)  것이라면
            LEAVE _loop; #반복문을 나간다
         END IF; #if문 종료
      END LOOP _loop; #반복문 종료
END $$ #리턴값 보내기
call insert_examtableTest(1000);# insert_examtableTest 프로시저 호출(인원은1000명)
#examtableTest에 값이 잘 들어갔는지 확인
select * from examtableTest


#프로시저 제거
DROP PROCEDURE IF EXISTS print_report;
# 프로시저 시작
DELIMITER $$
#프로시저 생성
CREATE PROCEDURE print_report(_currentPage int, _pageStudentNumber int)
BEGIN
   declare start_person integer;#내부에서 사용되는 변수지정(시작 페이지 인원)
   declare last_person integer;#내부에서 사용되는 변수지정(마지막 페이지 인원)
   declare last_page integer;#내부에서 사용되는 변수지정(마지막 페이지)
   declare _page integer;#내부에서 사용되는 변수지정(페이지수)
   declare _person integer;#내부에서 사용되는 변수지정(인원)
    
    set _person = _pageStudentNumber; # set을 사용하여 _person에 페이지당 인원수 정의 
    set _page = _currentPage; # set을 사용하여 _page에 현재페이지 정의
    set last_page = ceiling(1000/_person); #set을 사용하여 last_page에 마지막 인원 정의((ceiling을 사용하여 올림처리)1000/페이지당 인원)
    if _page < 1 then #만약 현재 페이지가 1보다 작으면
      set _page = 1; #현재페이지 정의
   end if; #if문 종료
   if _page > last_page then #만약 현재페이지가 마지막 페이지보다 크면
      set _page = last_page; #현재페이지는 마지막 페이지로 정의
   end if; #if문 종료
    set start_person = (_page - 1) * _person; #시작인원 정의
    set last_person = _page * _person; #마지막 인원 정의

   # 현재 페이지 인원 출력
   select *, (b.kor+b.eng+b.mat) as 총점, (b.kor+b.eng+b.mat)/3 as 평균, (select count(*)+1 from examtableTest as a where (a.kor+a.eng+a.mat) > (b.kor+b.eng+b.mat)) as 등수 from examtableTest as b 
   limit start_person, _person;
   # 현재 페이지 성적 정보
   select sum(kor), sum(eng), sum(mat), sum(kor+eng+mat), sum((kor+eng+mat)/3), avg(kor), avg(eng), avg(mat), avg(kor+eng+mat), avg((kor+eng+mat)/3) from (select kor,eng,mat from examtableTest 
   limit start_person, _person) as 현재;
   # 누적 페이지 성적 정보
   select sum(kor), sum(eng) , sum(mat), sum(kor+eng+mat), sum((kor+eng+mat)/3), avg(kor), avg(eng), avg(mat), avg(kor+eng+mat), avg((kor+eng+mat)/3) from (select kor,eng,mat from examtableTest 
   limit 0, last_person)as 누적;
END $$ #값 리턴하기
#출력 
call print_report(5, 25);

-- Training (2)
SELECT * FROM kopoctc.freewifi;
# print_report_7 프로시저가 이미 존재한다면 삭제
DROP PROCEDURE IF EXISTS freeWifi_report;

# print_report_7 프로시저 생성
DELIMITER $$
CREATE PROCEDURE freeWifi_report(_currentPage int, _pageidNumber int)
BEGIN
DECLARE start_number int;#내부에서 사용할 변수 선언
DECLARE page_last_number int;#내부에서 사용할 변수 선언
DECLARE cutpage int;#내부에서 사용할 변수 선언
DECLARE pageaddr int;#내부에서 사용할 변수 선언
DECLARE lastpage int;#내부에서 사용할 변수 선언
DECLARE lat double; # 현재 위치의 위도
DECLARE lng double; # 현재 위치의 경도

SET cutpage = _currentPage-1; #시작 정의
SET pageaddr = _pageidNumber;
SET lastpage = 1000/_pageidNumber;
-- SET lat = 37.3860521; # 위도
-- SET lng = 127.1214038; # 경도
SET lat = 37.280036042779; # 위도
SET lng = 127.01456634271; # 경도

IF cutpage < 1 THEN #만약 현재 페이지가 1보다 작으면
   SET cutpage = 1; #현재페이지 정의
END IF; #if문 종료
IF cutpage  > lastpage  THEN #만약 현재페이지가 마지막 페이지보다 크면
   SET cutpage = lastpage; #현재페이지는 마지막 페이지로 정의
END IF; #if문 종료

SET start_number = cutpage * _pageidNumber;#페이지당 시작
SET page_last_number = (cutpage+ 1) * (_pageidNumber);#페이지당 개수를 위해 선언

# 주소, 위도, 경도, 거리 출력
select place_addr_road as 주소, latitude as 위도, longitude as 경도, (6371 * acos( cos( radians( lat ) ) * cos( radians( latitude) ) * cos( radians( longitude) - radians( lng )) 
+ sin( radians(lat) ) * sin( radians(latitude) ) ) ) AS 거리 from freewifi limit start_number,pageaddr;

END $$ #값 리턴하기

call freeWifi_report(5, 25);#freeWifi_report 호출 5페이지의 25개

-- Basic Training(2) 트와이스 멤버 선호도 테이블
drop table tupyo;
create table tupyo(#테이블 만들기
	name varchar(20),#이름은 char형태로 20글자
	age int );#연령대


-- Basic Training(2) 트와이스 멤버 선호도 프로시저
DROP PROCEDURE IF EXISTS tw; #tw프로시저 제거
# 프로시저 시작
DELIMITER $$
CREATE PROCEDURE tw(_limit integer)#프로시저 생성 (최대값은 int형태로 나중에 정해준다)
BEGIN
   DECLARE _cnt integer;#내부에서 사용되는 변수지정
   SET _cnt=0;#set으로 _cnt선언
    -- delete from examtable where id > 0;
      _loop: LOOP#반복문 시작
        SET _cnt = _cnt+1;#반복문이 돌떄마다 _cnt+1
        INSERT INTO tupyo (name,age) VALUE (round((rand()*8 + 1),0), (rand()*8)+1); #tupyo에 값 삽입
            
            IF _cnt = _limit THEN #만약 _cnt가 지정해준(_limit) 이라면
            LEAVE _loop; #반복문을 나간다
         END IF; #if문 종료
      END LOOP _loop; #반복문 종료
END $$ #리턴값 보내기
call tw(1000);#tw 프로시저를 1000명으로 정의하고 호출
select * from tupyo; # tupyo에 들어간 1000명분의 데이터 확인



-- 이름을 바꾸는 프로시저
DROP PROCEDURE IF EXISTS name_change;
DELIMITER $$
CREATE PROCEDURE name_change()
BEGIN
	set sql_safe_updates=0;
	update tupyo set name = '나연' where name='1';
	update tupyo set name = '정연' where name='2';
	update tupyo set name = '모모' where name='3';
	update tupyo set name = '사나' where name='4';
	update tupyo set name = '지효' where name='5';
	update tupyo set name = '미나' where name='6';
	update tupyo set name = '다현' where name='7';
	update tupyo set name = '채영' where name='8';
	update tupyo set name = '쯔위' where name='9';
	select name, count(name) as 득표수, count(name)/(select count(*) from tupyo)*100 as 득표율 from tupyo group by name order by 득표수 desc;
END $$
# 함수호출
call name_change();



#delete from tupyo where age>0;
#examtable 테이블에 값 삽입
insert into tupyo value("나연",rand()*8+1);
insert into tupyo value("정연",rand()*8+1);
insert into tupyo value("모모",rand()*8+1);
insert into tupyo value("사나",rand()*8+1);
insert into tupyo value("지효",rand()*8+1);
insert into tupyo value("미나",rand()*8+1);
insert into tupyo value("다현",rand()*8+1);
insert into tupyo value("채영",rand()*8+1);
insert into tupyo value("쯔위",rand()*8+1);

select * from tupyo;

select name, count(name),count(name)/(select count(*) from tupyo)*100 as rate from tupyo group by name;

select name, count(name) as cnt, count(name)/(select count(*) from tupyo)*100 as rate from tupyo group by name order by cnt desc;

select age*10 as 연령대, count(age) as 득표수, count(age)/(select count(*) from tupyo where name="나연")*100 as 득표율 from tupyo where name="나연" group by age;



