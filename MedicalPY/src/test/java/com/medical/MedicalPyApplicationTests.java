package com.medical;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import com.medical.dimain.User;
import com.medical.service.UserService;
@RunWith(SpringRunner.class)
@SpringBootTest(classes=MedicalPyApplication.class)
@ActiveProfiles("dev")
public class MedicalPyApplicationTests {
	@Resource
    private UserService userServer;
	@Test
	  public void save() {
		User u =new User();
		u.setId(1213);
		u.setName("lotus");
		u.setPassword("1122");
		u.setRole("0");
		u.setHeadUrl("http://www.bai.du.com");
	     userServer.addUser(u);
	  }
	
	
	@Test
	  public User selectUser() {
	    return userServer.seletByName("lotus");
	  }
  
    
}
