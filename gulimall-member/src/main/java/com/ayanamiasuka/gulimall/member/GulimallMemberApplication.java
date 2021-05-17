package com.ayanamiasuka.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
/*
* 1.想要远程调用别的服务：
*   1). 引入open-feign
*   2). 编写一个接口并注解@FeignClient("<远程调用服务名>")告诉SpringCloud这个接口需要调用远程服务
*   3). 生命接口的每一个方法都是调用远程服务的哪个请求
*   4). 开启远程调用功能 入口类标注@EnableDiscoveryClient @EnableFeignClients(basePackages = "<存放远程调用FeignClient接口的报名>")
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.ayanamiasuka.gulimall.member.feign")
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
