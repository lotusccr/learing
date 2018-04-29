package com.medical.service;
import java.util.Map;
import com.medical.dimain.User;


public interface UserService {
	public Map<String,String> register(String username, String password);
	/**
	 * 登录验证
	 * @param username
	 * @param password
	 * @return
	 */
	public Map<String,String> login(String username, String password);
	
	/**
	 * 免密登录
	 * @param userId
	 * @return
	 */
	public String addLoginTicket(int userId);
	public User seletByName(String name);
	
	public User seletUser();
	
	public void addUser(User u);
}
