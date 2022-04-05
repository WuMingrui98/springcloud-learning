package xyz.raygetoffer.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author mingruiwu
 * @create 2022/4/5 6:03 PM
 */
@RestController
public class OrderZKController {
    @Resource
    private RestTemplate restTemplate;

    private final String PaymentSrv_URL = "http://cloud-provider-payment";

    @GetMapping(value = "/consumer/zk")
    public String consumerzk() {
        return restTemplate.getForObject(PaymentSrv_URL + "/payment/zk", String.class);
    }
}
