package com.moxuan.cloud.alibaba.sentinel.service.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.moxuan.common.entity.Payment;
import com.moxuan.common.result.CommonResult;

/**
 * @ProjectName dxyt-mdm
 * @ClassName BlockHandler
 * @Author zhangkai
 * @Description
 * @Date 2020/5/6 9:12 下午
 */
public class BlockHandler {

    public static CommonResult handleException(BlockException blockException){
        return new CommonResult(444,"自定义异常返回------");
    }

    public static CommonResult handleException1(BlockException blockException){
        return new CommonResult(444,"自定义异常返回-------111111");
    }
}
