package org.application.repository.mongo;

import org.application.model.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
@ConditionalOnProperty(prefix = "database", name = "UseMongoDb")
public interface UserMongoRepository extends MongoRepository<User, Long> {
}
