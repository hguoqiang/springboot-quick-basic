package org.ganfan.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: huangguoqiang
 * @create: 2021-03-12 19:06
 **/
@SpringBootApplication(scanBasePackages = {"org.ganfan.basic"})
public class BasicApplication {
    public static void main(String[] args) {
        SpringApplication.run(BasicApplication.class, args);
    }

}
