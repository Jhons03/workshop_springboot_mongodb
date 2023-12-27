package com.digitcomart.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.digitcomart.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User edson = new User("1", "Edson Silva", "edson@hotmail.com");
		User mel = new User("2", "Mel Sophie", "mel@hotmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(edson, mel));
		return ResponseEntity.ok().body(list);
	}
}
