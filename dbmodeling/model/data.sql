-- 고용 유형 데이터
insert into ed_employee_type(et_id, type) values (11,'정규직');
insert into ed_employee_type(et_id, type) values (12,'계약직');
insert into ed_employee_type(et_id, type) values (13,'시간제');

-- 학생 데이터
insert into ed_member(member_id, name, email,tel, pwd)
values (101,'user1','user1@test.com', '010-1111-1111', sha2('1111',256));
insert into ed_student(student_id, jumin, final_level, major, school)
values (101, '101', '학사', '컴퓨터 공학', '한국대학교');

insert into ed_member(member_id, name, email,tel, pwd)
values (102,'user2','user2@test.com', '010-1111-1112', sha2('1111',256));
insert into ed_student(student_id, jumin, final_level, major, school)
values (102, '102', '학사', '국문학과', '대한한대학교');

insert into ed_member(member_id, name, email,tel, pwd)
values (103,'user3','user3@test.com', '010-1111-1113', sha2('1111',256));
insert into ed_student(student_id, jumin, final_level, major, school)
values (103, '103', '학사', '컴퓨터 공학', '한국대학교');

-- 강사 데이터
insert into ed_member(member_id, name, email,tel, pwd)
values (201,'teacher1','teacher1@test.com', '010-2222-1111', sha2('1111',256));
insert into ed_teacher(teacher_id, et_id, photo)
values (201,11,'a.jpg');

insert into ed_member(member_id, name, email,tel, pwd)
values (202,'teacher2','teacher2@test.com', '010-2222-1112', sha2('1111',256));
insert into ed_teacher(teacher_id, et_id, photo)
values (202,12,'b.jpg');

insert into ed_member(member_id, name, email,tel, pwd)
values (203,'teacher3','teacher3@test.com', '010-2222-1113', sha2('1111',256));
insert into ed_teacher(teacher_id, et_id, photo)
values (203,13,'c.jpg');




select 
    m.member_id,
    m.name,
    m.email,
    s.jumin,
    s.final_level,
    s.major
from ed_member m
    inner join ed_student s on m.member_id=s.student_id;