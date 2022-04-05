package xyz.raygetoffer.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author mingruiwu
 * @create 2022/4/4 9:05 PM
 */
@Configuration

public class ApplicationContextConfiguration {
    @Bean
    //使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
