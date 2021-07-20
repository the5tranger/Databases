package org.user_application.repository.mysql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.user_application.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
