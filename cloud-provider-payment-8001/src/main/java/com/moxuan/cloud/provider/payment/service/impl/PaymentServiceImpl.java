package com.moxuan.cloud.provider.payment.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.moxuan.cloud.provider.payment.mapper.PaymentMapper;
import com.moxuan.cloud.provider.payment.module.PaymentAddDTO;
import com.moxuan.cloud.provider.payment.module.entity.Payment;
import com.moxuan.cloud.provider.payment.module.result.CommonResult;
import com.moxuan.cloud.provider.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName dxyt-mdm
 * @ClassName PaymentServiceImpl
 * @Author zhangkai
 * @Description
 * @Date 2020/3/16 10:11 下午
 */
@Slf4j
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentMapper paymentMapper;

    /**
     * @Method       add
     * @Author       zhangkai
     * @Description  添加
     * @param        paymentAddDTO
     * @Return       com.moxuan.cloud.provider.payment.module.result.CommonResult
     * @Exception
     * @Date         2020/3/16 10:29 下午
     */
    @Override
    public CommonResult add(PaymentAddDTO paymentAddDTO) {
        Payment payment = Payment.builder().serial(paymentAddDTO.getSerial()).build();
        paymentMapper.insert(payment);
        return new CommonResult(200,"添加成功");
    }

    /**
     * @Method       select
     * @Author       zhangkai
     * @Description  查询
     * @param        id
     * @Return       com.moxuan.cloud.provider.payment.module.result.CommonResult
     * @Exception
     * @Date         2020/3/16 10:37 下午
     */
    @Override
    public CommonResult select(Long id) {
        Payment payment = paymentMapper.selectOne(Wrappers.<Payment>lambdaQuery()
                .eq(Payment::getId, id));
        return new CommonResult(200,"查询成功",payment);
    }
}
