package com.javastart.springbens.controller;

import com.javastart.springbens.service.HelloXmlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */

@RestController
public class XmlController {

    private final HelloXmlService helloXmlService;

    @Autowired
    public XmlController(HelloXmlService helloXmlService) {
        this.helloXmlService = helloXmlService;
    }

    @GetMapping("/xml")
    public String helloXml(){
        return helloXmlService.hello();
    }
}
