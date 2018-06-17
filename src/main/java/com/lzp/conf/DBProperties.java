package com.lzp.conf;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by LZP on 2018/6/17.
 */
@Configuration
@PropertySource(value = "classpath:/conf/db.properties")
@ConfigurationProperties(prefix= "lzp")
@Data
public class DBProperties {
private String driverClassName;
private String url;
private String username;
private String password;
}
