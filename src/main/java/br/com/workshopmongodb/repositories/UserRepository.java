package br.com.workshopmongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.workshopmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>  {

}
