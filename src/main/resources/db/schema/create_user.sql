create table user
(
	id int auto_increment,
	name char(255) null,
	age int null,
	constraint user_pk
		primary key (id)
);

