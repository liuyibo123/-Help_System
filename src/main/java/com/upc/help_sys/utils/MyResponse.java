package com.upc.help_sys.utils;

import org.springframework.stereotype.Component;

/**
 * Created by Liuyibo on 2017/5/9.
 */
@Component
public class MyResponse {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
