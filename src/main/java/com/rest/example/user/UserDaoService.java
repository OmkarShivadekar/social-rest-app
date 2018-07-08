package com.rest.example.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * @author Omkar Shivadekar
 * Date : 04-Jul-2018
 * Time : 6:55:49 PM
 */

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();
	
	private static int userCount = 3;
	static {
		users.add(new User(1, "Omkar", new Date()));
		users.add(new User(2, "Mukesh", new Date()));
		users.add(new User(3, "Sarang", new Date()));
	}
	
	
	public List<User> findAll()
	{
		return users;
	}
	
	public User save(User user)
	{
		if(user.getId()==null) {
			user.setId(++userCount);
		}
		
		users.add(user);
		
		return user;
	}
	
	public User findOne(int id) {
		
		for (User user : users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}
	
	public User deleteById(int id) {
		
		Iterator<User> itr = users.iterator();
		while(itr.hasNext()) {
			User user = itr.next();
			if(user.getId()==id) {
				itr.remove();
				return user;
			}
		}
		return null;
	}

	
	
}
