package com.upc.help_sys.controller;

import com.upc.help_sys.dao.HelpInfoRepository;
import com.upc.help_sys.dao.entity.HelpInfo;
import com.upc.help_sys.utils.MyGson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Liuyibo on 2017/3/30.
 */
@RestController
public class HelpInfoController {
    @Autowired
    HelpInfoRepository helpInfoRepository;

    @RequestMapping("/getall")
    public String getAll() {
        List<HelpInfo> list = helpInfoRepository.findAll();
        return MyGson.toJson(list);
    }

    @RequestMapping("/addnew")
    public String addNew(String json) {
        System.out.println("进入addnew");
        HelpInfo helpInfo = MyGson.fromJson(json, HelpInfo.class);
        System.out.println(json);
        System.out.println(helpInfo.getContent());
        helpInfoRepository.save(helpInfo);
        System.out.println("save success");
        return "success";
    }
}
