create database study_mysql;
use study_mysql;

create table study_mysql.soccer_player_test1
(
    id            bigint auto_increment
        primary key,
    name          varchar(30)  not null,
    age           int          null,
    email         varchar(100) null,
    registered_at timestamp    null,
    constraint registered_dt
        unique (registered_at)
);

create index soccer_player_test1_age_index
    on study_mysql.soccer_player_test1 (age);

