create table students (id bigint auto_increment primary key, student_number varchar(32) not null unique, display_name varchar(160) not null, program varchar(160) not null);
create table faculty (id bigint auto_increment primary key, employee_number varchar(32) not null unique, display_name varchar(160) not null, department varchar(160) not null);
