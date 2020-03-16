package com.moxuan.cloud.provider.payment.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.moxuan.cloud.provider.payment.module.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {
}