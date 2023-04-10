package com.javastart.springbens.service;

/**
 * @author Karl
 * @link <a href="https://babayan.keenetic.link/">https://babayan.keenetic.link</a>
 */
public class HelloXmlService {

    private UtilsService utilsService;

    public String hello(){
        return utilsService.append("Hello from xml!");
    }

    public void setUtilsService(UtilsService utilsService) {
        this.utilsService = utilsService;
    }
}
