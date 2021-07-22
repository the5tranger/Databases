package org.application.repository.mysql;

import org.application.model.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@ConditionalOnProperty(prefix = "database", name = "UseMongoDb", matchIfMissing = true, havingValue = "false")
public interface UserMySqlRepository extends JpaRepository<User, Long> {
}
