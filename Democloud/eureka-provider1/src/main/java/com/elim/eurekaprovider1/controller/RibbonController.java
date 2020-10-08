package com.elim.eurekaprovider1.controller;

import com.elim.eurekaprovider1.bean.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@CrossOrigin
@RestController
@RequestMapping("/ribbon")
public class RibbonController {
    @Value("${server.port}")
    private String port;

    @GetMapping("port")
    public String port() {
        return "hello,i'am come from provider:" + port;
    }

    @GetMapping("{uid}")
    public User byId(@PathVariable("uid") Integer id){
        User u = new User(id, "章三", new Date());
        return u;
    }
}
