package com.cos.securityex01.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration //Ioc 빈(bean)을 등록 - 인스턴스
@EnableWebSecurity //시큐리티 필터 체인안에 항목들을 관리 시작
@EnableGlobalMethodSecurity(prePostEnabled = true) //특정 주소 접근시 권한 및 인증을 미리 체크
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/user/**", "/admin/**")
			.authenticated()	
		    .anyRequest()
		    .permitAll()
		.and()
			.formLogin()
			.loginPage("/login")
			.loginProcessingUrl("/loginProc") //요청을 시큐리티가 낚아채서 Authentication Manager로 타게 하는 설정이다.
		;
		
	}
	
}
