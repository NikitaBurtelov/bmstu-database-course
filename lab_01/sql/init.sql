create table if not exists institution
(id_institution serial primary key not null,
 title varchar(50) not null,
    phone varchar(50) not null,
    address varchar(100) not null,
    rating int not null
    );

create table if not exists teacher
(id_teacher serial primary key not null,
 id_institution int not null,
 foreign key (id_institution) references institution(id_institution),
    first_name varchar(50) not null,
    last_name varchar(50) not null,
    dob date not null,
    sex nchar(3) not null,
    phone nchar(18) not null,
    education varchar(100) not null
    );

create table if not exists study_group
(id_study_group serial primary key not null,
 uid uuid not null
);

create table if not exists student
(id_student serial primary key not null,
 id_study_group int,
 foreign key (id_study_group) references study_group(id_study_group),
    first_name varchar(50) not null,
    last_name varchar(50) not null,
    dob date not null,
    sex nchar(3) not null,
    email varchar(128) not null
    );

create table if not exists contract
(id_contract serial primary key not null,
 id_institution int not null,
 id_student int not null,
 foreign key (id_institution) references institution(id_institution),
    foreign key (id_student) references student(id_student),
    date_of_conclusion date not null,
    training_period interval not null,
    service_cost numeric(10,2) not null
    );

create table if not exists teacher_group
(id_teacher int not null,
 id_group int not null,
 foreign key (id_teacher) references teacher(id_teacher),
    foreign key (id_group) references study_group(id_study_group)
    );
