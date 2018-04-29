package com.medical.service.impl;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.medical.dao.LoginTicketDao;
import com.medical.dao.UserDao;
import com.medical.dimain.LoginTicket;
import com.medical.dimain.User;
import com.medical.service.UserService;
import com.medical.utils.JblogUtil;
import com.medical.utils.StringUtils;

@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserDao userDao;
	@Resource
	private LoginTicketDao loginTicketDao;
	
	public Map<String,String> register(String username, String password){
        Map<String,String> map = new HashMap<>();
        Random random = new Random();
        if (StringUtils.isNotBlank(username)){
            map.put("msg","用户名不能为空");
            return map;
        }

        if (StringUtils.isNotBlank(password)){
            map.put("msg","密码不能为空");
            return map;
        }

        User u = userDao.findOne(username);
        if (u!=null){
            map.put("msg","用户名已经被占用");
            return map;
        }

        User user = new User();
        user.setUsername(username);
        user.setSalt(UUID.randomUUID().toString().substring(0,5));
        user.setHeadUrl(String.format("https://images.nowcoder.com/head/%dm.png",random.nextInt(1000)));
        user.setPassword(JblogUtil.EncryptPassword(password+user.getSalt()));
        user.setRole("user");
        userDao.save(user);
        String ticket = addLoginTicket(user.getId());
        map.put("ticket",ticket);

        return map;
    }
	
	
	

	
	
	/**
	 * 登录验证
	 * @param username
	 * @param password
	 * @return
	 */
	public Map<String,String> login(String username, String password){
        Map<String,String> map = new HashMap<>();
        Random random = new Random();
        if (StringUtils.isBlank(username)){
            map.put("msg","用户名不能为空");
            return map;
        }

        if (StringUtils.isBlank(password)){
            map.put("msg","密码不能为空");
            return map;
        }

        User u = userDao.findOne(username);
        if (u==null){
            map.put("msg","用户名不存在");
            return map;
        }

        if (!JblogUtil.EncryptPassword(password+u.getSalt()).equals(u.getPassword())){
            map.put("msg","密码错误");
            return map;
        }

        String ticket = addLoginTicket(u.getId());
        map.put("ticket",ticket);

        return map;
    }
	
	/**
	 * 免密登录
	 * @param userId
	 * @return
	 */
	public String addLoginTicket(int userId){
		   LoginTicket loginTicket = new LoginTicket();
		    loginTicket.setUserId(userId);
		    Date date = new Date();
		    date.setTime(date.getTime()+1000*3600*30);
		    loginTicket.setExpired(date);
		    loginTicket.setStatus(0);
		    loginTicket.setTicket(UUID.randomUUID().toString().replaceAll("-",""));
		    loginTicketDao.save(loginTicket);

		    return loginTicket.getTicket();
		}
	public User seletByName(String name){
		
		return userDao.findOne(name);
		
	}
	
	
	public void addUser(User u){
		userDao.save(u);
	}

	@Override
	public User seletUser() {
		return userDao.findAll().get(0);
	}
}
