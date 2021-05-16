package com.ayanamiasuka.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
* 1. 整合mybatis-plus
*   1). 导入依赖
*        <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus-boot-starter</artifactId>
            <version>3.4.2</version>
        </dependency>
*   2). 配置
*           a. 配置数据源
*               1). 导入数据库驱动
*               2). 在application。yaml里配置数据源
*           b. 配置mybatis-plus
*               1). 使用@MapperScan
*               2). 告诉mybatis-plus sql映射文件位置
 */
@MapperScan("com.ayanamiasuka.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
