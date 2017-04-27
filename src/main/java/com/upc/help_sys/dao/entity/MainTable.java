package com.upc.help_sys.dao.entity;


import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Liuyibo on 2017/4/23.
 */
@Entity
@Component
public class MainTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String content;
    String destination_from;
    String destination_to;
    int needperson;
    float tip;
    int askid;
    int helperid;
    String tname;
    int tid;
    Timestamp pubtime;
    Timestamp accepttime;
    int nowperson;
    int state;

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

    public String getDestination_from() {
        return destination_from;
    }

    public void setDestination_from(String destination_from) {
        this.destination_from = destination_from;
    }

    public String getDestination_to() {
        return destination_to;
    }

    public void setDestination_to(String destination_to) {
        this.destination_to = destination_to;
    }

    public int getNeedperson() {
        return needperson;
    }

    public void setNeedperson(int needperson) {
        this.needperson = needperson;
    }

    public float getTip() {
        return tip;
    }

    public void setTip(float tip) {
        this.tip = tip;
    }

    public int getAskid() {
        return askid;
    }

    public void setAskid(int askid) {
        this.askid = askid;
    }

    public int getHelperid() {
        return helperid;
    }

    public void setHelperid(int helperid) {
        this.helperid = helperid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public Timestamp getPubtime() {
        if (pubtime == null)
            return null;
        else
            return (Timestamp) pubtime.clone();
    }

    public void setPubtime(Timestamp pubtime) {
        if (pubtime == null)
            this.pubtime = null;
        else
            this.pubtime = (Timestamp) pubtime.clone();
    }

    public Timestamp getAccepttime() {
        if (accepttime == null)
            return null;
        else
            return (Timestamp) accepttime.clone();
    }

    public void setAccepttime(Timestamp accepttime) {
        if (accepttime == null)
            this.accepttime = null;
        else
            this.accepttime = (Timestamp) accepttime.clone();
    }

    public int getNowperson() {
        return nowperson;
    }

    public void setNowperson(int nowperson) {
        this.nowperson = nowperson;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
