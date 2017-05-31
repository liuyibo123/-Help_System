package com.upc.help_sys;

import com.upc.help_sys.dao.MainTableRepository;
import com.upc.help_sys.dao.entity.MainTable;
import com.upc.help_sys.utils.MyGson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Liuyibo on 2017/5/25.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMainTabke {
    @Autowired
    MainTable table;
    @Autowired
    MainTableRepository repository;

    /*
    * 发布新订单的测试
    * 包括驱动模块1
    * 桩模块包括： 数据转换，数据库访问，实体类模块
    * */
    @Test
    public void testSave() {
        table.setId(1);
        table.setContent("北门取快递");
        table.setTip((float) 2.1);
        table.setCatagory(1);
        table.setHelp_loc("北门");
        table.setPub_loc("5号楼");
        System.out.println(MyGson.toJson(table));
        repository.save(table);
    }
}

