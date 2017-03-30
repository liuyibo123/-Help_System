package com.upc.help_sys;


import com.upc.help_sys.dao.entity.HelpInfo;
import com.upc.help_sys.dao.HelpInfoRepository;
import com.upc.help_sys.utils.MyGson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.sql.Timestamp;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RepositoryTests {
    @Autowired
    HelpInfoRepository helpInfoRepository;
    @Autowired
    HelpInfo helpInfo;

    @Test
    public void contextLoads() {
    }

    @Test
    public void insert() {
        helpInfo.setAccepter_id(3);
        helpInfo.setCategory(2);
        helpInfo.setDeadline(new Timestamp(new Date().getTime()));
        helpInfo.setState_num(2);
        helpInfo.setContent("帮我买手抓饼,5元");
        helpInfo.setCreator_id(1);
        helpInfo.setDestination_from("玉兰");
        helpInfo.setDestination_to("15号楼");
        helpInfo.setNeed_person(2);
        helpInfoRepository.save(helpInfo);
    }

    @Test
    public void findById() {
        helpInfo = helpInfoRepository.findOne(1);
        System.out.println(helpInfo);
    }

}
