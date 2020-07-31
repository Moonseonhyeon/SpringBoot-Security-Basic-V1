package com.cos.securityex01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.securityex01.model.User;

//JpaRepository를 상속하면 자동 컴포넌트 스캔 됨.
public interface UserRepository extends JpaRepository<User, Integer>{ //Wrapper class적어야 한다. //Ioc하는것 같은거다

}
