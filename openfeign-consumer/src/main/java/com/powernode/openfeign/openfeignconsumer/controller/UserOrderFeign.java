package com.powernode.openfeign.openfeignconsumer.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;


import java.util.Map;

@FeignClient(value = "fiegn-provider")
public interface UserOrderFeign {

    /**
     * 服务提供者的restFul url 和methodName
     * @return
     */
    @GetMapping("/doOrder")
    String order();

    @RequestMapping(value = "/testDate",method = RequestMethod.POST)
    String testDate(@RequestBody Map<String,Object> param);


}
