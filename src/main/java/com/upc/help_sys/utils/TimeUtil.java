package com.upc.help_sys.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Liuyibo on 2017/5/11.
 */
public class TimeUtil {
    public static String getCurrentTime() {
        DateFormat dateFormat;
        dateFormat = new SimpleDateFormat("MM-dd kk:mm", Locale.SIMPLIFIED_CHINESE);
        dateFormat.setLenient(false);
        String date = dateFormat.format(new Date());
        return date;
    }
}
