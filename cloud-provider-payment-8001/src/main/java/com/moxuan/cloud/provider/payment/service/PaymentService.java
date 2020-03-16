package com.moxuan.cloud.provider.payment.service;

import com.moxuan.cloud.provider.payment.module.PaymentAddDTO;
import com.moxuan.cloud.provider.payment.module.result.CommonResult;

/**
 * @ProjectName dxyt-mdm
 * @ClassName PaymentService
 * @Author zhangkai
 * @Description
 * @Date 2020/3/16 10:11 下午
 */
public interface PaymentService {

    /**
     * @Method       add
     * @Author       zhangkai
     * @Description  添加
     * @param        paymentAddDTO
     * @Return       com.moxuan.cloud.provider.payment.module.result.CommonResult
     * @Exception
     * @Date         2020/3/16 10:29 下午
     */
    CommonResult add(PaymentAddDTO paymentAddDTO);

    /**
     * @Method       select
     * @Author       zhangkai
     * @Description  查询
     * @param        id
     * @Return       com.moxuan.cloud.provider.payment.module.result.CommonResult
     * @Exception
     * @Date         2020/3/16 10:37 下午
     */
    CommonResult select(Long id);
}
