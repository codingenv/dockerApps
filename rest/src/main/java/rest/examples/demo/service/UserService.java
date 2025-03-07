package rest.examples.demo.service;

import rest.examples.demo.entity.User;
import rest.examples.demo.entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User getUserByUserId(Long id) {
        Optional<User> users = userRepository.findById(id);
        if(!users.isEmpty()){
            return users.get();
        }else{
            return new User();
        }
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}
