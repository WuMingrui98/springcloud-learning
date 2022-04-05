package xyz.raygetoffer.springcloud.service;

import org.apache.ibatis.annotations.Param;
import xyz.raygetoffer.springcloud.entities.Payment;

/**
 * @author mingruiwu
 * @create 2022/4/4 6:44 PM
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
