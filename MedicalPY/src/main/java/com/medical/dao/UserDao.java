package com.medical.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.medical.dimain.User;
public interface UserDao extends  JpaRepository<User, String>{
    public User findById(int id);
    public void deleteById(int id);

}
