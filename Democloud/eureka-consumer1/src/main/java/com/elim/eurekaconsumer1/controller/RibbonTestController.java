package com.elim.eurekaconsumer1.controller;

import com.elim.eurekaconsumer1.bean.User;
import com.elim.eurekaconsumer1.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class RibbonTestController {
    @Autowired
    RibbonService ribbonService;

    @GetMapping("/port")
    public String port(){
        return ribbonService.getPort();
    }

    @GetMapping("/user/{id}")
    public User getById(@PathVariable("id") Integer id){
        return ribbonService.getById(id);
    }
}
