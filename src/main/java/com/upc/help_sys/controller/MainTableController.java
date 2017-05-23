package com.upc.help_sys.controller;

import com.google.gson.Gson;
import com.upc.help_sys.dao.MainTableRepository;
import com.upc.help_sys.dao.entity.MainTable;
import com.upc.help_sys.utils.MyResponse;
import org.jboss.jandex.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Liuyibo on 2017/5/9.
 */
@RestController
@RequestMapping("maintable")
public class MainTableController {
    @Autowired
    MainTableRepository repository;
    @Autowired
    MainTable table;
    @Autowired
    MyResponse response;

    @RequestMapping("find_all")
    public List<MainTable> findall() {
        return repository.findAll();
    }

    @RequestMapping("add_new")
    public MyResponse add_new(@RequestBody MainTable table) {
        Gson gson = new Gson();
        System.out.println(gson.toJson(table));
        MainTable table1 = repository.save(table);
        System.out.println(gson.toJson(table1));
        int id = table1.getId();
        response.setValue(id);
        return response;
    }

    @RequestMapping("get_bycontent")
    public List<MainTable> getByContent(String content) {

        return null;
        //TODO (1) 通过传入模糊的content搜索，传出可分页的list
    }

    @RequestMapping("get_bypubloc")
    public List<MainTable> getByPubLoc(String loc) {
        return null;
        //TODO (2) 通过位置查找
    }

    @RequestMapping("get_bytip")
    public List<MainTable> getByTip(int condition, float tip) {
        return null;
        // TODO (3) 通过悬赏金额来查找
    }

    @RequestMapping("get_byhelploc")
    public List<MainTable> getByHelpLoc(String loc) {
        return null;
        // TODO (4) 通过帮助为止查找
    }

    @RequestMapping("get_bypubperson")
    public List<MainTable> getByPubPerson(int id) {
        return null;
        // TODO (5) 通过帮助人id查找
    }

    @RequestMapping("update")
    public void update(MainTable table) {
        int id = table.getId();
        repository.updateAcceptperson(table.getAccept_person(), id);
        repository.updateHelp_loc(table.getHelp_loc(), id);
        repository.updatePub_loc(table.getPub_loc(), id);
        repository.updateState(table.getState(), id);
        repository.updateTip(table.getTip(), id);
    }

}
