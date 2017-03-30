package com.upc.help_sys;

import com.upc.help_sys.dao.entity.HelpInfo;
import com.upc.help_sys.utils.MyGson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Liuyibo on 2017/3/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UtilsTests {
    @Test
    public void testMyGson_toJson() {
        HelpInfo helpInfo = new HelpInfo();
        helpInfo.setAccepter_id(1);
        helpInfo.setTip(5);
        String json = MyGson.toJson(helpInfo);
        System.out.println(json);
    }

    @Test
    public void testMyGson_fromJson() {
        HelpInfo helpInfo;
        String json = "{\"id\":1,\"category\":1,\"content\":\"哪位兄弟帮忙带个快递啊,北门圆通112号\",\"destination_from\":\"圆通快递\",\"destination_to\":\"11号宿舍楼下\",\"tip\":5.0,\"accepter_id\":1,\"creator_id\":2,\"deadline\":\"Mar 30, 2017 9:01:01 AM\",\"state_num\":1,\"need_person\":1}";
        helpInfo = MyGson.fromJson(json, HelpInfo.class);
        System.out.println(helpInfo);
        System.out.println(helpInfo.getContent());
    }
}
