drop table if exists quotes;
create table quotes
(
    id    int auto_increment,
    quote varchar(255)
);

drop table if exists domes;

create table domes
(
    id       int auto_increment,
    domename varchar(255),
    latitude double,
    longitude double
);