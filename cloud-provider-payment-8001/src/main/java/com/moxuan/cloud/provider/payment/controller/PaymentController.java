package com.moxuan.cloud.provider.payment.controller;

import com.moxuan.cloud.provider.payment.module.PaymentAddDTO;
import com.moxuan.cloud.provider.payment.module.result.CommonResult;
import com.moxuan.cloud.provider.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ProjectName dxyt-mdm
 * @ClassName PaymentController
 * @Author zhangkai
 * @Description
 * @Date 2020/3/16 10:13 下午
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    /**
     * @Method       add
     * @Author       zhangkai
     * @Description  添加
     * @param        paymentAddDTO
     * @Return       com.moxuan.cloud.provider.payment.module.result.CommonResult
     * @Exception
     * @Date         2020/3/16 10:29 下午
     */
    @PostMapping("/add")
    public CommonResult add(@RequestBody PaymentAddDTO paymentAddDTO){
        return paymentService.add(paymentAddDTO);
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
    @GetMapping("/select/{id}")
    public CommonResult select( @PathVariable(name = "id") Long id){
        return paymentService.select(id);
    }

}
