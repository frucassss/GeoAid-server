drop table if exists quotes;

create table quotes
(
    id    int auto_increment,
    quote varchar(255)
);

drop table if exists users;

create table users
(
    id       int auto_increment,
    firstName varchar(255),
    lastName varchar(255),
    premium  varchar(255)
);