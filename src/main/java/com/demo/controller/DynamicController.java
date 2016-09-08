package com.demo.controller;

import java.io.IOException; 
import javax.servlet.http.HttpServletResponse; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping; 
import com.demo.model.Users;
import com.demo.service.DynamicService; 

@Controller
@RequestMapping("dynamic")
public class DynamicController {
	@Autowired
	private DynamicService dynamicService;
    @RequestMapping("/demo1")
	public   void demo1(HttpServletResponse response) {
    	dynamicService.selectGroup();
    	Users user1=new Users();
    	user1.setId("yinhun1223");
    	user1.setName("測試1");
    	user1.setPassword("124455");
		//dynamicService.selectUsers();
    	dynamicService.insertUsers(user1);
    	try {
			response.getOutputStream().println("測試");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
