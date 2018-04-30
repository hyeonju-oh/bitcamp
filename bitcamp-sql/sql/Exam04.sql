create table test1(
  no int not null primary key auto_increment,
  title varchar(255) not null,
  content text,
  rdt datetime not null
);

create table test2(
  fno int not null primary key auto_increment,
  filepath varchar(255) not null,
  bno int not null
);

insert into test1(title, rdt) values('aaa', now());
insert into test1(title, rdt) values('bbb', now());
insert into test1(title, rdt) values('ccc', now());
insert into test1(title, rdt) values('ddd', now());
insert into test1(title, rdt) values('eee', now());
insert into test1(title, rdt) values('fff', now());
insert into test1(title, rdt) values('ggg', now());
insert into test1(title, rdt) values('hhh', now());
insert into test1(title, rdt) values('iii', now());
insert into test1(title, rdt) values('jjj', now());


insert into test2(filepath,bno) values('c:/download/a.gif', 1);
insert into test2(filepath,bno) values('c:/download/b.gif', 1);
insert into test2(filepath,bno) values('c:/download/c.gif', 1);
insert into test2(filepath,bno) values('c:/download/d.gif', 5);
insert into test2(filepath,bno) values('c:/download/e.gif', 5);
insert into test2(filepath,bno) values('c:/download/f.gif', 10);

insert into test2(filepath,bno) values('c:/download/x.gif', 100);

delete from test1 where no=1;

alter table 테이블명
  add constraint 제약조건이름 foreign key (컬럼명) references 테이블명(컬럼명);
  

alter table test2
  add constraint test2_bno_fk foreign key (bno) references test1(no);
  
delete from test1 where no=2;
delete from test1 where no=5;