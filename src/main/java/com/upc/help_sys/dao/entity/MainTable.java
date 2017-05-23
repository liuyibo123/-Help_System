package com.upc.help_sys.dao.entity;

import com.upc.help_sys.utils.TimeUtil;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Liuyibo on 2017/5/9.
 */
@Entity
@Component
public class MainTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String content;
    private int pub_person;
    private int catagory;
    private int accept_person;
    private String pub_time = TimeUtil.getCurrentTime();
    private String accept_time = null;
    private int state;
    private String pub_loc;
    private String help_loc;
    private float tip;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPub_person() {
        return pub_person;
    }

    public void setPub_person(int pub_person) {
        this.pub_person = pub_person;
    }

    public int getCatagory() {
        return catagory;
    }

    public void setCatagory(int catagory) {
        this.catagory = catagory;
    }

    public int getAccept_person() {
        return accept_person;
    }

    public void setAccept_person(int accept_person) {
        this.accept_person = accept_person;
    }

    public String getPub_time() {
        return pub_time;
    }

    public void setPub_time(String pub_time) {
        this.pub_time = pub_time;
    }

    public String getAccept_time() {
        return accept_time;
    }

    public void setAccept_time(String accept_time) {
        this.accept_time = accept_time;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getPub_loc() {
        return pub_loc;
    }

    public void setPub_loc(String pub_loc) {
        this.pub_loc = pub_loc;
    }

    public String getHelp_loc() {
        return help_loc;
    }

    public void setHelp_loc(String help_loc) {
        this.help_loc = help_loc;
    }

    public float getTip() {
        return tip;
    }

    public void setTip(float tip) {
        this.tip = tip;
    }
}
