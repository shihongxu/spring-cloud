package com.axu.hellodemopeer1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@RefreshScope
@EnableDiscoveryClient
@EnableEurekaClient
@MapperScan("com.axu.hellodemopeer1.dao")
public class HelloDemoPeer1Application {

    public static void main(String[] args) {
        SpringApplication.run(HelloDemoPeer1Application.class, args);
    }

}
