package com.powernode.eurekaclient.controller;


import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName ConsumerController
 * @Description: TODO
 * @Author Jack Chen
 * @Date 2022/7/6
 * @Version V1.0
 **/
@RestController
public class ConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/testRibbon")
    public Object test01(String serviceName){
        System.out.println(serviceName);
        List<ServiceInstance> instances = discoveryClient.getInstances(serviceName);
        String url = "http://" + serviceName + "/testRibbon";
        String forObject = restTemplate.getForObject(url, String.class);
        return forObject;
    }

}
