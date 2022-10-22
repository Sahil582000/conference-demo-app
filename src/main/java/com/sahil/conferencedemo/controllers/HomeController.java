package com.sahil.conferencedemo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {
    @Value(value = "${app.version}")
    private String appVersion;

    @RequestMapping("/")
    public Map getAppVersion() {
        Map appVersionMap = new HashMap();
        appVersionMap.put("appVersion", appVersion);
        return appVersionMap;
    }
}
