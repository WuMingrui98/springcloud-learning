package xyz.raygetoffer.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author mingruiwu
 * @create 2022/4/5 6:01 PM
 */

@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderZKMain.class, args);
    }
}
