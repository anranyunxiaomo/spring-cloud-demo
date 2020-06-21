package com.moxuan.cloud.alibaba.consumer.nacos.order.feign.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.moxuan.cloud.alibaba.consumer.nacos.order.feign.service.PaymentService;
import com.moxuan.common.entity.Payment;
import com.moxuan.common.result.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ProjectName dxyt-mdm
 * @ClassName CircleBreakerController
 * @Author zhangkai
 * @Description
 * @Date 2020/6/21 2:22 下午
 */
@Slf4j
@RestController
public class CircleBreakerController {

    public static final String SERVICE_URL="http://nacos-payment-prvovider";

    @Resource
    public RestTemplate restTemplate;
    @Resource
    private PaymentService paymentService;

    @GetMapping("/consumer/fallback/{id}")
//    @SentinelResource(value = "fallback")
 //   @SentinelResource(value = "fallback",fallback = "handlerFallBack") // fallback 只负责业务异常
  //  @SentinelResource(value = "fallback",blockHandler = "blockHandler")  // blockHandler只负责 sentinel 控制台违规异常。
    @SentinelResource(value = "fallback",fallback = "handlerFallBack",blockHandler = "blockHandler",
    exceptionsToIgnore = {IllegalArgumentException.class})
    public CommonResult fallback(@PathVariable long id){
        CommonResult forObject = restTemplate.getForObject(SERVICE_URL + "/payment/" + id, CommonResult.class, id);
        if (id==4){
            throw new IllegalArgumentException("参数不合法");
        }else if (ObjectUtils.isEmpty(forObject.getDate())){
            throw new NullPointerException("该ID 没有对应结果，空指针错误。");
        }
        return forObject;
    }
  // 本例是fallback
  public CommonResult   handlerFallBack(@PathVariable long id,Throwable throwable){
      Payment payment = new Payment(id, "null");
      return new CommonResult(444,"兜底异常handlerFallBack，内容"+throwable.getMessage(),payment);
  }

    public CommonResult blockHandler(@PathVariable long id, BlockException blockException){
        Payment payment = new Payment(id, null);
        return new CommonResult(445,"blockHandler----限流，无次流水"+blockException.getMessage(),payment);
    }

    @GetMapping("/consumer/payment/{id}")
    public CommonResult payment(@PathVariable("id")long id){
       return paymentService.payment(id);
    }


}
