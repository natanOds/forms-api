package com.exquisitecode.apiforms.resources;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exquisitecode.apiforms.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User natan = new User("1", "natan oliveira", "natanods@gmail.com");
		User kleber = new User("2", "kleber henrique", "kleberh@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(natan, kleber));
		return ResponseEntity.ok().body(list);
		
	}
	

}
