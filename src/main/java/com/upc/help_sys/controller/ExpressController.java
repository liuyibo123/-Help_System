package com.upc.help_sys.controller;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.google.gson.Gson;
import com.upc.help_sys.dao.ExpressRepository;
import com.upc.help_sys.dao.MainTableRepository;
import com.upc.help_sys.dao.entity.Express;
import com.upc.help_sys.dao.entity.MainTable;
import com.upc.help_sys.utils.MyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Liuyibo on 2017/5/9.
 */
@RestController
@RequestMapping("express")
public class ExpressController {
    @Autowired
    Express express;
    @Autowired
    ExpressRepository repository;
    @Autowired
    MyResponse response;
    @Autowired
    MainTableRepository mainrepository;

    @RequestMapping("add")
    public void add(@RequestBody Express express) {
        Gson gson = new Gson();
        System.out.println(gson.toJson(express));
        repository.save(express);

    }

    @RequestMapping("delete")
    public void delete(int id) {
        repository.delete(id);
        mainrepository.delete(id);
    }

    @RequestMapping("update")
    public void update(Express express) {
        repository.delete(express);
        repository.save(express);
    }

}
