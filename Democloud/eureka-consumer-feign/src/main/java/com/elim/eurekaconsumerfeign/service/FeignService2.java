package com.elim.eurekaconsumerfeign.service;

import com.elim.eurekaconsumerfeign.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name="eureka-provider")
public interface FeignService2 {

    @GetMapping("/ribbon/port")
    String getPort();

}
