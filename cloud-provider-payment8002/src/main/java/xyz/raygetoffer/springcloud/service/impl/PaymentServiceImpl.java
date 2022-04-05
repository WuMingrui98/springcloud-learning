package xyz.raygetoffer.springcloud.service.impl;

import org.springframework.stereotype.Service;
import xyz.raygetoffer.springcloud.dao.PaymentDao;
import xyz.raygetoffer.springcloud.entities.Payment;
import xyz.raygetoffer.springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @author mingruiwu
 * @create 2022/4/4 6:45 PM
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
