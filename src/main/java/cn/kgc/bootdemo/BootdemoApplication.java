package cn.kgc.bootdemo;

import cn.kgc.bootdemo.util.TimeUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootdemoApplication {


    public static void main(String[] args) {
        System.out.println(TimeUtil.time());
        SpringApplication.run(BootdemoApplication.class, args);
    }

}
