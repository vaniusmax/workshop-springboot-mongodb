package br.com.workshopmongodb.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.workshopmongodb.domain.Post;
import br.com.workshopmongodb.domain.User;
import br.com.workshopmongodb.dto.AuthorDto;
import br.com.workshopmongodb.repositories.PostRepository;
import br.com.workshopmongodb.repositories.UserRepository;

@Configuration
public class Instanttiation implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private PostRepository postRepo;

	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepo.deleteAll();
		postRepo.deleteAll();
		
		System.out.println("Oba Oba nhac nhac");
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		userRepo.saveAll(Arrays.asList(maria,alex,bob));
		
		Post post1 = new Post(null, sdf.parse("28/02/2018"), "Partiu Viagem", "Vou viajar para são paulo, abraços!", new AuthorDto(maria));
		Post post2 = new Post(null, sdf.parse("30/02/2018"), "Opa querida", "Vou viajar para o Rio, abraços!", new AuthorDto(maria));
		
		
		
		postRepo.saveAll(Arrays.asList(post1, post2));
		
	}

}
