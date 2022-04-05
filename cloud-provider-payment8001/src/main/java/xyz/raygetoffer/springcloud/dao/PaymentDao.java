package xyz.raygetoffer.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import xyz.raygetoffer.springcloud.entities.Payment;

/**
 * @author mingruiwu
 * @create 2022/4/4 6:35 PM
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
