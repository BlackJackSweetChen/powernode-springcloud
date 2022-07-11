package com.powernode.eurekaclient.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
public class ProducerController {

    @GetMapping("/testRibbon")
    public Object test01(){
        return "producer2";
    }

}
