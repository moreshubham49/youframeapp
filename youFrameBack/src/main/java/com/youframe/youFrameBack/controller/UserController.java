package com.youframe.youFrameBack.controller;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import com.youframe.youFrameBack.dao.*;
import com.youframe.youFrameBack.pojos.User;

@CrossOrigin(allowedHeaders = "*")
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserDao dao; 
	
    
	@PostMapping("/addimage")
	public ResponseEntity<User> AddNewImages(@RequestParam(value="image",required=false) MultipartFile image)
	{
			User u=new User();
			System.out.println(u);	
			
			try {
				if (image != null) {
					u.setImage(image.getBytes());
					return new ResponseEntity<User>(dao.AddNewImages(u), CREATED);

				}
			} catch (Exception e1) {
				return new ResponseEntity<User>(new User(), INTERNAL_SERVER_ERROR);
			}
			return null;	
		
	}
	
	
	@GetMapping("/allimages")
	List<User> getAllPackages(){
		return dao.getAllImages();
	}
	
	
}
