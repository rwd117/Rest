# Spring,oracle을 이용한 Rest CRUD
-------------------------------
# 기술 스택

Backend: Spring | Java 8 | Oracle | Mybatis | Tomcat 9.0 |
Tool : Eclipse | Postman

-------------------------------
# 계기

Restful Api 와 같은 단어를 자주 접하면서 '대체 Rest가 뭐지??'하는 호기심으로 시작.
막상 구글링과 구현을 하면서 느낀거는 Rest는 아키텍쳐. 구현은 개발자 마음대로

-------------------------------
## 기본 DB설정

```
create table rest_board(
    bid number not null,
    btitle varchar2(100) not null,
    bcontent varchar2(2000) not null,
    bwriter varchar2(100) not null,
    PRIMARY KEY(bid)
);

create sequence rboa_seq start with 1 INCREMENT BY 1 NOCYCle nocache;

insert into rest_board
values(rboa_seq.nextval,'테스트제목!','테스트 내용!!','admin');
insert into rest_board
values(rboa_seq.nextval,'테스트제목2','테스트 내용2!!','admin');
insert into rest_board
values(rboa_seq.nextval,'테스트제목3','테스트 내용3!!','admin');
insert into rest_board
values(rboa_seq.nextval,'테스트제목4','테스트 내용4!!','admin');
insert into rest_board
values(rboa_seq.nextval,'테스트제목5','테스트 내용5!!','admin');
```

------------------------------
## 기본 구성

![image](https://user-images.githubusercontent.com/69449157/114027568-776a7c00-98b2-11eb-94d2-420169827bd4.png)




