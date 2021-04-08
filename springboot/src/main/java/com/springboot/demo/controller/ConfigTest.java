package com.springboot.demo.controller;

import com.springboot.demo.config.RConfig;
import com.springboot.demo.vo.ConfigResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/public/test")
@Slf4j
public class ConfigTest {
    @Autowired
    private RConfig rConfig;
    @RequestMapping(value="/configTest",method = RequestMethod.POST)
    public ConfigResponseVo getConfig(){
        log.info("Response "+rConfig);
        return new ConfigResponseVo(rConfig.getSex(),rConfig.getAge(),rConfig.getLanguage());
    }
}
