package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entites.Payment;

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
