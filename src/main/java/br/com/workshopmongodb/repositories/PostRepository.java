package br.com.workshopmongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.workshopmongodb.domain.Post;
import br.com.workshopmongodb.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String>  {

}
