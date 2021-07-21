package org.user_application.repository.mongo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.user_application.model.User;

@Repository
@ConditionalOnProperty(prefix = "database", name = "UseMongoDb")
public interface UserMongoRepository extends MongoRepository<User, Long> {
}
