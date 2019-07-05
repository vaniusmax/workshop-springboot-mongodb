package br.com.workshopmongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.workshopmongodb.domain.User;
import br.com.workshopmongodb.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
  
	public List<User> findAll(){
		
		return repo.findAll();
	}
}
