
create extension if not exists "uuid-ossp"

create table if not exists asset
(
id uuid   not null  primary key,
type varchar(100) not null,
status  varchar (15) not null,
assigned_to varchar(100) not null,
availability varchar (100) not null
);

create table if not exists electronics(
serial_number varchar (25) not null
)inherits(asset);

create table if not exists furniture(
description varchar(100) not null
)inherits(asset);

create table if not exists tower
(
make varchar (20) not null,
cpu varchar(10)  not null,
ram varchar  (10) not null,
data_storage varchar (10) not null
)inherits(electronics);

create table if not exists laptop
(
make varchar(20) not null,
cpu varchar (10) not null,
ram varchar (10) not null,
data_storage varchar (10) not null
)inherits(electronics);

create table if not exists  monitor
(
make varchar (20) not null,
monitor_size varchar(20) not null
)inherits(electronics);

create table if not exists   keyboard
(
make varchar (20) not null
)inherits(electronics);

create table if not exists   mouse
(
make varchar (20) not null
)inherits(electronics);


insert into tower (id,type,status,assigned_to,availability,serial_number, make ,cpu ,ram ,data_storage)
values (uuid_generate_V4(),'Tower','mint','not assigned','yes','TO3452-TRG652','Dell','Core i5','8GB','256GB SSD');

insert into laptop (id,type,status,assigned_to,availability,serial_number, make ,cpu ,ram ,data_storage)
values (uuid_generate_V4(),'Laptop','mint','not assigned','yes','SH468-YSG665','Lenovo','Core i7','16GB','500GB SSD');

insert into monitor ( id,type,status,assigned_to,availability, serial_number, make ,monitor_size)
values (uuid_generate_V4(),'Monitor','mint','not assigned','yes','MO3452-TRG652','Samsung','17 inches');

insert into keyboard ( id,type,status,assigned_to,availability, serial_number, make)
values (uuid_generate_V4(),'Keyboard','mint','not assigned','yes','KE452-TRG652','Lenovo');

insert into mouse ( id,type,status,assigned_to,availability, serial_number, make)
values (uuid_generate_V4(),'Mouse','mint','not assigned','yes','MO452-TRG652','HP');


