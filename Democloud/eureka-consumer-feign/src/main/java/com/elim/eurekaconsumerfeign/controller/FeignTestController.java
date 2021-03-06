package com.elim.eurekaconsumerfeign.controller;

import com.elim.eurekaconsumerfeign.entity.User;
import com.elim.eurekaconsumerfeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class FeignTestController {
    @Autowired
    FeignService feignService;

    @GetMapping("/port")
    public String port(){
        return feignService.getPort();
    }

    @GetMapping("/user/{id}")
    public User getById(@PathVariable("id") Integer id){
        return feignService.getById(id);
    }
}
