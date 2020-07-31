### MySQL DB 및 사용자 생성

```sql
create user 'cos'@'%' identified by 'cos1234';
GRANT ALL PRIVILEGES ON *.* TO 'cos'@'%';
create database security;
use security;
```

###

```
Spring Boot DevTools
Lombok
Spring Data JPA
MySQL Driver

```

###

```maven mustache tamplate
<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-mustache</artifactId>
</dependency>
```
