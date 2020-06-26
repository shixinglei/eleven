package com.example.springcloud.alibaba.nacos.consumer.feign.service.fallback;

import com.example.springcloud.alibaba.nacos.consumer.feign.service.EchoService;
import org.springframework.stereotype.Component;

@Component
public class EchoServiceFallback implements EchoService {
    @Override
    public String echo(String message) {
        return "您的请求有误！";
    }
}
