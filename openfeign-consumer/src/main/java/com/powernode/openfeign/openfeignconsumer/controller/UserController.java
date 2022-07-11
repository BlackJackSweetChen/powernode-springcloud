package com.powernode.openfeign.openfeignconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName UserController
 * @Description: TODO
 * @Author Jack Chen
 * @Date 2022/7/10
 * @Version V1.0
 **/
@RestController
public class UserController {

    @Autowired
    public UserOrderFeign userOrderFeign;

    @GetMapping("/userGetOrder")
    public String order(){
        return  userOrderFeign.order();
    }

    @GetMapping("/testDate")
    public String testDate(){
        Map<String,Object> hashMap = new HashMap<>();
        hashMap.put("1",new Date());
        hashMap.put("2",LocalDate.now());
        return  userOrderFeign.testDate(hashMap);
    }
}
