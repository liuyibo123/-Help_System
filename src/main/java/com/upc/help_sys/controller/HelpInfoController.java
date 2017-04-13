package com.upc.help_sys.controller;

import com.upc.help_sys.dao.HelpInfoRepository;
import com.upc.help_sys.dao.entity.HelpInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Liuyibo on 2017/4/7.
 */
@RestController
@RequestMapping("/helpinfo")
public class HelpInfoController {
    @Autowired
    HelpInfoRepository repository;

    @RequestMapping("/get")
    public String get() {
        return "hello yarong";
    }

    @RequestMapping("/all")
    public List<HelpInfo> findAll() {
        return repository.findAll();
    }
    @RequestMapping("/addnew")
    public void addnew(@RequestBody HelpInfo helpInfo) {
        repository.save(helpInfo);
    }
}
