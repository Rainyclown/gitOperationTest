package com.springboot.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfigResponseVo {
    private String sex;
    private Integer age;
    private String language;
    private String h;
}
