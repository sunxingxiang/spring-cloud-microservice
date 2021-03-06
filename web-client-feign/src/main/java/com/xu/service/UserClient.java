package com.xu.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "USER-SERVICE", fallback = UserClientHystrix.class)
public interface UserClient {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    String add(@RequestParam(value = "name") String name);
}
