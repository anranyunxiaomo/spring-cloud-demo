package com.moxuan.common.result;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName dxyt-mdm
 * @ClassName CommonResult
 * @Author zhangkai
 * @Description
 * @Date 2020/3/16 10:16 下午
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T date;

    public CommonResult(Integer code, String message) {
        this(code,message,null);
    }
}
