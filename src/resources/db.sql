create table type_client
(
    id   serial primary key,
    external boolean not null,
    name varchar(128) not null
);
alter table type_client
    add constraint type_client_pk
        unique (name);

create table clients
(
    id    serial primary key,
    type_client_ref int references type_client(id),
    name  varchar(128)
);
alter table clients
    add constraint clients_pk
        unique (name);

create table measure_unit
(
    id   serial primary key,
    name varchar(25) not null
);
alter table measure_unit
    add constraint measure_unit_pk
        unique (name);

create table product
(
    id      serial primary key,
    unit_ref int,
    name    varchar(256)
);
create unique index product_pk
    on product (name, unit_ref);

alter table product
    add foreign key (unit_ref) references measure_unit;

create table documents --документы на приход/расход товара
(
    id          serial primary key,
    date        Date,
    numDoc      varchar(21),
    clientDebet int references clients(id),
    clientKredit int references clients(id),
    product_ref  int references product(id),
    price       decimal(2),
    quantity    decimal(3)
);
create index documents_date_index
    on documents (date);

create table balance --сальдо по подразделениям
(
    id          serial primary key,
    date        date,
    client_ref   int references clients(id),
    product_ref  int references product(id),
    price       decimal(2),
    quantity    decimal(3)
);

alter table balance
    add constraint balance_pk_2
        unique (date, client_ref, product_ref, price);
create index balance_client_ref_index
    on balance (client_ref);
create index balance_product_ref_index
    on balance (product_ref);

create table price_list --прайслист
(
    id          serial primary key,
    date        date,
    product_ref  int references product(id),
    price       decimal(2)
);

alter table price_list
    add constraint price_list_pk
        unique (date, product_ref, price);

create table oper_day --опердень
(
    id          serial primary key,
    date        date
);
alter table oper_day
    add constraint oper_day_pk
        unique (date);

insert into type_client(external, name)
values (true,'АО')
    insert into type_client(external, name)
values (true,'ТОО')
insert into type_client(external, name)
values (true,'ОАО')
insert into type_client(external, name)
values (false,'склад');
insert into type_client(external, name)
values (false,'магазин');

insert into clients(type_client_ref, name)
values (4,'Головной');
insert into clients(type_client_ref, name)
values (5,'Центральный');
insert into clients(type_client_ref, name)
values (5,'На Художников');
insert into clients(type_client_ref, name)
values (5,'На Энгельса');
insert into clients(type_client_ref, name)
values (5,'На Невском');

insert into clients (type_client_ref, name)
values (1,'Перекресток (мы)')
    insert into clients (type_client_ref, name)
values (2,'Молочный комбинат Ермолино');
insert into clients (type_client_ref, name)
values (3,'Молочный комбинат Пискаревский');
insert into clients (type_client_ref, name)
values (2,'Дикий фермер');
insert into clients (type_client_ref, name)
values (3,'Хлебный комбинат Урожайный');

insert into measure_unit(name)
values ('штук');
insert into measure_unit(name)
values ('кг');
insert into measure_unit(name)
values ('литров');
insert into measure_unit(name)
values ('пачек');

insert into product(name, unit_ref)
values ('печенье', 4);
insert into product(name, unit_ref)
values ('колбаса сервелат', 2);
insert into product(name, unit_ref)
values ('сосиски', 2);
insert into product(name, unit_ref)
values ('сардельки', 2);
insert into product(name, unit_ref)
values ('молоко пискаревсое 0.9', 1);
insert into product(name, unit_ref)
values ('пиво Жигулевское', 3);
insert into product(name, unit_ref)
values ('пиво Клинское', 3);
insert into product(name, unit_ref)
values ('кефир 0,5', 1);

select * from type_client --форма собственности внешних клиентов
where external;

select * from type_client -- виды подразделений предприятия АО "Перекресток"
where not external;

select tС.name,cl.name from clients cl --клиенты
                                inner join type_client tС on tС.id = cl.type_client_ref and tС.external;

select tС.name,cl.name from clients cl --подразделения
                                inner join type_client tС on tС.id = cl.type_client_ref and not tС.external;

select * from measure_unit; --единицы измерений

select p.name, u.name --товар
from product p
         inner join measure_unit u on p.unit_ref = u.id;
