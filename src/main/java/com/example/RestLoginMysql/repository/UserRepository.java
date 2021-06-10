
package com.example.RestLoginMysql.repository;

import com.example.RestLoginMysql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer>{
    
}
