package com.upc.help_sys;


import com.upc.help_sys.dao.HelpInfo;
import com.upc.help_sys.dao.HelpInfoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelpSystemApplicationTests {
	@Autowired
	HelpInfoRepository helpInfoRepository;
	@Autowired
	HelpInfo helpInfo;
	@Test
	public void contextLoads() {
	}
	@Test
	public void insert(){
		helpInfo.setAccepter_id(1);
		helpInfoRepository.save(helpInfo);
	}
}
