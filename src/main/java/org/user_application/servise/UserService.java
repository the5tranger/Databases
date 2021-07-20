package org.user_application.servise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.user_application.model.User;
import org.user_application.repository.mysql.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }

    public void delete(User user) {
        userRepository.delete(user);
    }

    public User update(User user) {
        return userRepository.save(user);
    }

    public User get(Long id) {
        if (userRepository.findById(id).isEmpty()) {
            throw new RuntimeException("User with id " + id + " not exists");
        }
        return userRepository.findById(id).get();
    }
}
