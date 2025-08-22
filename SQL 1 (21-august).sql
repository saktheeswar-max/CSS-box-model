show databases;
Create database placement;
use placement;
create table iq (
iname VARCHAR(50),
i_id int,
i_address VARCHAR(100),
ph_no int,
email VARCHAR(50)

);
desc iq;
create table cse (
cse_name varchar(100),
cse_id int ,
cse_admin_no int,
contact_no int,
exam_no int

);
desc cse;
insert into cse (cse_name,cse_id,cse_admin_no,contact_no,exam_no )
values('iq',12,124,12345,
4361);
desc cse;
select * from cse;
insert into cse (cse_name,cse_id,cse_admin_no,contact_no,exam_no )
values('iqs',11,123,112345,43161),('sakthi',45,379,11235,43612047),('gopi',46,2367,12344,436125);

select * from cse;

