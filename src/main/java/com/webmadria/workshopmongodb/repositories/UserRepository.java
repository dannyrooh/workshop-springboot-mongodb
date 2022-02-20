package com.webmadria.workshopmongodb.repositories;
import com.webmadria.workshopmongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository()
public interface UserRepository  extends MongoRepository<User,String>{
    
}
