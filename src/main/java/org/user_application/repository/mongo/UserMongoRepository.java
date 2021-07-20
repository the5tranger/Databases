package org.user_application.repository.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.user_application.model.User;

import java.util.Optional;

@Repository
public interface UserMongoRepository extends MongoRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
