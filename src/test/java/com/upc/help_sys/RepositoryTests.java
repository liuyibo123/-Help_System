package com.upc.help_sys;


import com.upc.help_sys.dao.ExpressRepository;
import com.upc.help_sys.dao.MainTableRepository;

import com.upc.help_sys.dao.entity.Express;
import com.upc.help_sys.dao.entity.MainTable;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;


import java.sql.Timestamp;


@RunWith(SpringRunner.class)
@SpringBootTest
public class RepositoryTests {
    @Autowired
    MainTableRepository repository;

    @Autowired
    MainTable mainTable;
    @Autowired
    Express express;
    @Autowired
    ExpressRepository expressRepository;
    @Test
    public void contextLoads() {
    }

    @Test
    public void testInsert() {
        mainTable.setTip(10);
        mainTable.setDestination_to("hrer");
        mainTable.setDestination_from("dakfd");
        mainTable.setAskid(11);
        mainTable.setContent("我拍你");
        mainTable.setHelperid(11);
        mainTable.setNeedperson(12);
        mainTable.setNowperson(0);
        mainTable.setState(123);
        mainTable.setTname("hel;lo");
        mainTable.setTid(123);
        mainTable.setPubtime(new Timestamp(new Long(112200)));
        repository.save(mainTable);
    }
    @Test
    public void testInsert2() {
        express.setExpress_company("圆通");
        express.setExpress_description("大的");
        express.setId(1);
        express.setName("刘宜博");
        express.setPhone("17854227898");
        express.setTake_number("11");
        expressRepository.save(express);
    }
}
