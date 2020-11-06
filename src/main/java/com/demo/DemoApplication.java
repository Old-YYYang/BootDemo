package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: Demo
 * @description: 启动类
 * @author: Dongsu
 * @create: 2020-11-06 16:34
 **/
@SpringBootApplication
@MapperScan("com.demo.dao")
public class DemoApplication {
    
}
