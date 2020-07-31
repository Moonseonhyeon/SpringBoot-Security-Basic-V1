package com.cos.securityex01.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

//ORM - Object Relation Mapping

@Data
@Entity
public class User {
	@Id //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //numbering 전략 - primary key에 auto increament
	private int id;
	private String username;
	private String password;
	private String email;
	private String role; //회원가입할 때는 user권한 //ROLE_USER, ROLE_ADMIN
	@CreationTimestamp//나중에는 localdate
	private Timestamp createDate;

}
