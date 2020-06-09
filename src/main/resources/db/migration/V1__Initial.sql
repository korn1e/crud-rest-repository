
create sequence HIBERNATE_SEQUENCE as integer start with 10 cycle;
create table virus(
    id integer primary key,
    name varchar(100) not null,
    label varchar(100) not null
);
insert into virus values(1, 'v-1', 'Flu');
insert into virus values(2, 'v-2', 'Bird Flu');
insert into virus values(3, 'v-3', 'Ebola');
insert into virus values(4, 'v-4', 'Hepatitis');


create table vaccine(
    id integer primary key,
    name varchar(200) not null,
    virus_id int not null,
    company_id integer not null
);
insert into vaccine values(1, 'vac-1', 1, 1);
insert into vaccine values(2, 'vac-2', 1, 2);
insert into vaccine values(3, 'vac-3', 4, 2);

create table company(
    id integer primary key,
    name varchar(200) not null,
    main_address varchar(200) not null
);
insert into company values(1, 'company-1', 'address-1');
insert into company values(2, 'company-2', 'address-2');





