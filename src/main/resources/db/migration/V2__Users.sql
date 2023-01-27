create table if not exists umuzi_users(
id  uuid primary key not null,
employer_number smallint,
first_name varchar(100) not null,
last_name varchar(100) not null,
email  varchar(200) unique not null,
role varchar(100) unique not null,
department varchar(100) not null,
cohort smallint,
reporting_to varchar(100)
);

insert into umuzi_users (id,first_name,last_name,email,reporting_to,role,department,employer_number)
values(uuid_generate_V4(),'Elijah','Noko','elijah.sepuru@javaasset.org','Cohort leader','Junior dev','web dev',0023);







