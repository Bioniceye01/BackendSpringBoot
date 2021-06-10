
package com.example.RestLoginMysql.service;

import com.example.RestLoginMysql.model.User;
import com.example.RestLoginMysql.repository.UserRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;


@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> listAllUser(){
        return userRepository.findAll();
    }
    
    public void saveUser(User user){
        userRepository.save(user);
    }
    
    public User getUser(Integer id){
        return userRepository.findById(id).get();
    }
    
    public void deleteUser(Integer id){
        userRepository.deleteById(id);
    }
}
