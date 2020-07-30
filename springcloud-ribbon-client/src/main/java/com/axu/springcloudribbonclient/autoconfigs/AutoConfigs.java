package com.axu.springcloudribbonclient.autoconfigs;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName AutoConfigs
 * @Description TODO
 * @Author Axu
 * @Date 2020/7/30 10:16
 * @Version 1.0
 */
@Configuration
public class AutoConfigs {



    @Bean
    public IRule ribbonRule() {
        // 负载均衡规则，改为随机
        return new RandomRule();
    }
}
