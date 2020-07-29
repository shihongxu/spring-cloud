package com.axu.hellodemopeer1.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
/**
 * @Author Axu
 * @Description //当数据库配置修改以后，重新加载bean，配置@RefreshScope 热部署配置文件的修改  * @Date 11:09 2020/7/27
 * @Param * @param null
 * @return
 **/
@Configuration
public class DataSourceConfigure {

    @Bean
    @RefreshScope// 刷新配置文件
    @ConfigurationProperties(prefix="spring.datasource") // 数据源的自动配置的前缀
    public DataSource dataSource(){
        return DataSourceBuilder.create().build();
    }


}
