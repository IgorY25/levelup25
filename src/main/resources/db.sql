create table typeСlient
(
    id   serial primary key,
    external Boolean NOT NULL,
    name varchar(128) NOT NULL
);
alter table public."typeСlient"
    add constraint "typeСlient_pk"
        unique (name);

create table clients
(
    id    serial primary key,
    typeСlientRef int REFERENCES typeСlient(id),
    name  varchar(128)
);
alter table public.clients
    add constraint clients_pk
        unique (name);

create table measureUnit
(
    id   serial primary key,
    name varchar(25) NOT NULL
);
alter table public.measureUnit
    add constraint measureUnit_pk
        unique (name);

create table product
(
    id      serial primary key,
    unitRef int,
    name    varchar(256)
);
create unique index product_pk
    on public.product (name, unitref);

alter table public.product
    add foreign key (unitref) references public.measureUnit;

create table documents --документы на приход/расход товара
(
    id          serial primary key,
    date        Date,
    numDoc      varchar(21),
    clientDebet int REFERENCES clients(id),
    clientKredit int REFERENCES clients(id),
    productRef  int REFERENCES product(id),
    price       decimal(2),
    quantity    decimal(3)
);
create index documents_date_index
    on public.documents (date);

create table balance --сальдо по подразделениям
(
    id          serial primary key,
    date        date,
    clientRef   int REFERENCES clients(id),
    productRef  int REFERENCES product(id),
    price       decimal(2),
    quantity    decimal(3)
);

alter table public.balance
    add constraint balance_pk_2
        unique (date, clientref, productref, price);
create index balance_clientref_index
    on public.balance (clientref);
create index balance_productref_index
    on public.balance (productref);

create table priceList --прайслист
(
    id          serial primary key,
    date        Date,
    productRef  int REFERENCES product(id),
    price       decimal(2)
);

alter table public.pricelist
    add constraint pricelist_pk
        unique (date, productref, price);

create table operDay --опердень
(
    id          serial primary key,
    date        Date
);
alter table public.operday
    add constraint operday_pk
        unique (date);

insert into typeСlient(external, name)
values (true,'АО')
    insert into typeСlient(external, name)
values (true,'ТОО')
insert into typeСlient(external, name)
values (true,'ОАО')
insert into typeСlient(external, name)
values (false,'склад');
insert into typeСlient(external, name)
values (false,'магазин');

insert into clients(typeСlientRef, name)
values (4,'Головной');
insert into clients(typeСlientRef, name)
values (5,'Центральный');
insert into clients(typeСlientRef, name)
values (5,'На Художников');
insert into clients(typeСlientRef, name)
values (5,'На Энгельса');
insert into clients(typeСlientRef, name)
values (5,'На Невском');

insert into clients (typeСlientRef, name)
values (1,'Перекресток (мы)')
    insert into clients (typeСlientRef, name)
values (2,'Молочный комбинат Ермолино');
insert into clients (typeСlientRef, name)
values (3,'Молочный комбинат Пискаревский');
insert into clients (typeСlientRef, name)
values (2,'Дикий фермер');
insert into clients (typeСlientRef, name)
values (3,'Хлебный комбинат Урожайный');

insert into measureUnit(name)
values ('штук');
insert into measureUnit(name)
values ('кг');
insert into measureUnit(name)
values ('литров');
insert into measureUnit(name)
values ('пачек');

insert into product(name, unitRef)
values ('печенье', 4);
insert into product(name, unitRef)
values ('колбаса сервелат', 2);
insert into product(name, unitRef)
values ('сосиски', 2);
insert into product(name, unitRef)
values ('сардельки', 2);
insert into product(name, unitRef)
values ('молоко пискаревсое 0.9', 1);
insert into product(name, unitRef)
values ('пиво Жигулевское', 3);
insert into product(name, unitRef)
values ('пиво Клинское', 3);
insert into product(name, unitRef)
values ('кефир 0,5', 1);

select * from typeСlient --форма собственности внешних клиентов
where external;

select * from typeСlient -- виды подразделений предприятия АО "Перекресток"
where not external;

select tС.name,cl.name from clients cl --клиенты
                                inner join typeСlient tС on tС.id = cl.typeСlientRef and tС.external;

select tС.name,cl.name from clients cl --подразделения
                                inner join typeСlient tС on tС.id = cl.typeСlientRef and not tС.external;

select * from measureUnit; --единицы измерений

select p.name, u.name --товар
from product p
         inner join measureUnit u on p.unitRef = u.id;
