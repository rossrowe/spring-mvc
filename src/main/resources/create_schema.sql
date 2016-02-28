create table book
(
    id int not null,
    isbn varchar(12) not null,
    title varchar(100) not null,
    author varchar(200) not null,
    borrower_id int null,
    PRIMARY KEY  (id)
);

create table person
(
    id int not null,
    email varchar(250) not null,
    name varchar(200) not null ,
    PRIMARY KEY  (id)
);


ALTER TABLE book
ADD FOREIGN KEY (borrower_id)
REFERENCES person(id);