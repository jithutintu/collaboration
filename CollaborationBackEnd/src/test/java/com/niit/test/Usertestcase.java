package com.niit.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.niit.collaboration.dao.UserDAO;
import com.niit.collaboration.model.User;
@EnableWebMvc
public class Usertestcase {

	
	@Autowired
	static AnnotationConfigApplicationContext context;
	@Autowired
	static User user;
	@Autowired
	static UserDAO userdao;
	
	@BeforeClass
	public static void initial(){
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		user=(User) context.getBean("user");
		userdao=(UserDAO) context.getBean("userDAO");
		
	}
	@Test
	public void save(){
		
		 user.setId("02");
	     user.setAddress("address1");
	     user.setDob("20/10/1992");
	     user.setEmail("jithu1018@gmail.com");
	     user.setGender("male");
	     user.setMob_no("9600292813");
	     user.setName("name");
	     user.setPassword("pass");
	     user.setRole("role");
	     user.setIsOnline('y');
	     user.setStatus('y');	   
	     userdao.save(user);
	     System.out.println( "objects are created successfully");
	}

}
