package br.com.workshopmongodb.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.workshopmongodb.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User maria = new User("1", "Maria", "maria@gmail.com");
		User jose = new User("1", "Jose", "jose@gmail.com");
		User leo = new User("1", "leo", "leo@gmail.com");
		List<User> list = new ArrayList<>();
		
		list.addAll(Arrays.asList(maria,jose,leo));
		
		return ResponseEntity.ok().body(list);
	}
}
