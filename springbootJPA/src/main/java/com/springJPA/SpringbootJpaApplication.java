package com.springJPA;

import java.util.ArrayList;

import java.util.Optional;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springJPA.dao.UserRepository;
import com.springJPA.entity.User;



@SpringBootApplication
public class SpringbootJpaApplication {

	public static void main(String[] args) {
		
ApplicationContext context = SpringApplication.run(SpringbootJpaApplication.class, args);
	UserRepository userRepository=context.getBean(UserRepository.class);

	
	
	
/* ** save multiple user in to database */
	
User user=new User();
 user.setCity("varanasi");
 user.setNmae("kashi");
 user.setStatus("yes good");
 
 /*
 User user1=new User();
 user1.setCity("lucknow");
 user1.setNmae("akshat");
 user1.setStatus("yes fine");
 
ArrayList<User> list=new ArrayList<>();
list.add(user1);list.add(user);
Iterable<User> result = userRepository.saveAll(list);
 
result.forEach(userx ->{
	System.out.println(userx.getNmae());
});

*/

/* save single user in to  database*/
	User user2 =userRepository.save(user);
	System.out.println(user2);

 
	
//update the table
	Optional<User> op= userRepository.findById(1);
	
User user1=op.get();
user1.setNmae("ankit tiwari");
User result=userRepository.save(user1);
System.out.println(result);
	}

}
