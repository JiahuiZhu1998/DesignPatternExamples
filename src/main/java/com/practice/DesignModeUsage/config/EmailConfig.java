package com.practice.DesignModeUsage.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix="email")
public class EmailConfig {
    String user;
    String pwd;
}
