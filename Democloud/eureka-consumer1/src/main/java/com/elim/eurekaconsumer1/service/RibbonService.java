package com.elim.eurekaconsumer1.service;

import com.elim.eurekaconsumer1.bean.User;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;

    public String getPort() {
        return restTemplate.getForObject("http://eureka-provider/ribbon/port",String.class);
    }

    public User getById(Integer id){
        return restTemplate.getForObject("http://eureka-provider/ribbon/" + id,User.class);
    }
}
