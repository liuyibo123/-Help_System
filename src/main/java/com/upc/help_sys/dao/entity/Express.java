package com.upc.help_sys.dao.entity;


import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Liuyibo on 2017/4/24.
 */
@Entity
@Component
public class Express {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String express_company;
    String take_number;
    String name;
    String phone;
    String express_description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExpress_company() {
        return express_company;
    }

    public void setExpress_company(String express_company) {
        this.express_company = express_company;
    }

    public String getTake_number() {
        return take_number;
    }

    public void setTake_number(String take_number) {
        this.take_number = take_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getExpress_description() {
        return express_description;
    }

    public void setExpress_description(String express_description) {
        this.express_description = express_description;
    }
}
