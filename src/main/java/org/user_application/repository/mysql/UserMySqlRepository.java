package org.user_application.repository.mysql;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.user_application.model.User;

@Repository
@ConditionalOnProperty(prefix = "database", name = "UseMongoDb", matchIfMissing = true, havingValue = "false")
public interface UserMySqlRepository extends JpaRepository<User, Long> {
}
