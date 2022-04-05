package xyz.raygetoffer.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import xyz.raygetoffer.springcloud.entities.CommonResult;
import xyz.raygetoffer.springcloud.entities.Payment;

import javax.annotation.Resource;

/**
 * @author mingruiwu
 * @create 2022/4/4 9:09 PM
 */
@RestController
public class OrderController {
    // 通过在eureka上注册过的微服务名称调用
    public static final String PaymentSrv_URL = "http://CLOUD-PAYMENT-SERVICE";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    // 客户端用浏览器是 get 请求，但是底层实质发送 post 调用服务端 8001
    public CommonResult create(Payment payment) {
        return restTemplate.postForObject(PaymentSrv_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPayment(@PathVariable Long id) {
        return restTemplate.getForObject(PaymentSrv_URL + "/payment/get/" + id, CommonResult.class, id);
    }
}
