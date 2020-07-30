package com.dhathri.demo.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import javax.transaction.Transactional;

import org.springframework.stereotype.Service;


import com.dhathri.demo.Repo.UserRepository;

import com.dhathri.demo.model.User;

@Service
@Transactional
public class UserService {

	private final UserRepository userRepository;
	


	public UserService(UserRepository userRepository) {
		
		this.userRepository = userRepository;

	}

	public void saveMyUser(User user) {
		List<User> allUser=new UserService(userRepository).showAllUsers();
		int len=allUser.size();
		int i=0;
		User newUser=null;
		for(User res:allUser)
		{
			if(i == len-1)
			{
				newUser=res;
				break;
			}
			i++;
		}
		System.out.println();
		int bal=newUser.balance;
		System.out.println(bal);
		user.balance=bal-user.transactionamount;
		userRepository.save(user);
	}
	
	
	 
	 public List<User> showAllUsers(){
		 
		 List<User> users =new ArrayList<User>();
		 List<User> re=userRepository.findAll();
		  return re ;
		 
	 }
	 public List<User> showUsers(){
         List<User> users =new ArrayList<User>(); 
		 List<User> re=userRepository.findAll();
		 Collections.reverse(re); 
		 List<User> arrlist2 = re.subList(0, 5);
		 return arrlist2;
	 }
	 
	
	 
	 
}
