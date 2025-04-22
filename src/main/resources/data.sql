insert into user_details(id,birth_date,name)
values(10001,current_date(),'Azzu');
insert into user_details(id,birth_date,name)
values(10002,current_date(),'Nashat');
insert into user_details(id,birth_date,name)
values(10003,current_date(),'Shabreen');

insert into post(id,description,user_id)
values(20001,'I want to learn AWS',10001);

insert into post(id,description,user_id)
values(20002,'I want to learn Devops',10001);

insert into post(id,description,user_id)
values(20003,'I want to learn Java',10002);

insert into post(id,description,user_id)
values(20004,'I want to learn spring',10002);

insert into post(id,description,user_id)
values(20005,'I want to learn microservices',10003);