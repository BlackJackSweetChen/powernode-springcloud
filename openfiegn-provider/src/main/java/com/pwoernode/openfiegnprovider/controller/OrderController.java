package com.pwoernode.openfiegnprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @ClassName OrderController
 * @Description: TODO
 * @Author Jack Chen
 * @Date 2022/7/10
 * @Version V1.0
 **/
@RestController
public class OrderController {

    @GetMapping("/doOrder")
    public String order(){
        return "有人下单了";
    }


    @GetMapping("/testDate")
    public String testDate(@RequestBody Map<String,Object> param){
        for (Map.Entry<String, Object> entry : param.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        return "OK";
    }

}
