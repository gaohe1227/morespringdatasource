package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.GroupDao;
import com.demo.dao.UsersDao;
import com.demo.model.Group;
import com.demo.model.Users;

@Service
public class DynamicService {
   @Autowired
   private UsersDao userDao;
   @Autowired
   private GroupDao groupDao;
	 
	public List<Group> selectGroup() {
		// TODO Auto-generated method stub
		return groupDao.selectList();
	}
	public void insertUsers(Users user1) {
		// TODO Auto-generated method stub
		userDao.insert(user1);
	}

}
