package org.application.servise;
import org.application.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private CrudRepository<User, Long> repository;

    public UserService(CrudRepository<User, Long> repository) {
        this.repository = repository;
    }

    public User save(User user) {
        return repository.save(user);
    }

    public void delete(User user) {
        repository.delete(user);
    }

    public User update(User user) {
        return repository.save(user);
    }

    public User get(Long id) {
        return repository.findById(id).orElseThrow(()-> new RuntimeException("User with id " + id + " not exists"));
    }


}
