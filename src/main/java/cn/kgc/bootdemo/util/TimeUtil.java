package cn.kgc.bootdemo.util;

import java.time.LocalDateTime;

public abstract class TimeUtil {


    public static String time(){
        LocalDateTime ldt = LocalDateTime.now();
        ldt.getYear();
        return ""+ldt.getYear();
    }
}
