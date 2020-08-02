package com.axu.springcloudribbonclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class SpringcloudRibbonClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudRibbonClientApplication.class, args);
    }

    /**
     * @Author Axu
     * @Description //负载均衡则是从@LoadBalanced 开始生效 * @Date 10:16 2020/7/30
     * @Param * @param
     * @return org.springframework.web.client.RestTemplate
     **/
    @Bean
    @LoadBalanced
    public RestTemplate template(){
        return new RestTemplate();
    }


}
