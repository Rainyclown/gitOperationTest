package com.springboot.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="r")
@Data
public class RConfig {
    private String sex;
    private Integer age;
    private String language;
}
