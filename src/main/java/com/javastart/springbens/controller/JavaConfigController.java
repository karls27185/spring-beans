package com.javastart.springbens.controller;

import com.javastart.springbens.service.JavaConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */

@RestController
public class JavaConfigController {

    private final JavaConfigService javaConfig;

    @Autowired
    public JavaConfigController(JavaConfigService javaConfig) {
        this.javaConfig = javaConfig;
    }

    @GetMapping("/java")
    public String hello(){
        return javaConfig.hello();
    }
}
