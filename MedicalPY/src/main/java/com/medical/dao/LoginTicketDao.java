package com.medical.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.medical.dimain.LoginTicket;
public interface LoginTicketDao extends JpaRepository<LoginTicket, String>{
    LoginTicket findById(int id);
    LoginTicket findByTicket(String ticket);
    void deleteById(int id);
}
