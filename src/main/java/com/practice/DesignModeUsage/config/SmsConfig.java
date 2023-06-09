package com.practice.DesignModeUsage.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Getter
@Setter
//@RefreshScope  // 这是在 SpringCloud 中的注解
@Configuration
@ConfigurationProperties(prefix="sms")
public class SmsConfig {
    String user;
    String pwd;
}
