package org.user_application.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.user_application.model.User;
import org.user_application.repository.mongo.UserMongoRepository;

@Service
public class UserMongoService {
    @Autowired
    private UserMongoRepository repository;

    public User save(User user) {
        return repository.save(user);
    }

    public void delete(User user) {
        repository.delete(user);
    }

    public User update(User user) {
        return repository.save(user);
    }

    public User get(String email) {
        if (repository.findByEmail(email).isEmpty()) {
            throw new RuntimeException("User with email: " + email + "don't exists!");
        }
        return repository.findByEmail(email).get();
    }


}
