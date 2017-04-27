package com.upc.help_sys.controller;

import com.upc.help_sys.dao.MainTableRepository;
import com.upc.help_sys.dao.entity.MainTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Liuyibo on 2017/4/23.
 */
@RestController
public class MainTableController {
    @Autowired
    MainTableRepository repository;

    @RequestMapping("/findall")
    public List<MainTable> findAll() {
        List<MainTable> list = repository.findAll();
        return list;
    }

    @RequestMapping("/findone")
    public MainTable findone() {
        MainTable ma = repository.findTopByOrderByIdDesc();
        return ma;
    }
}
