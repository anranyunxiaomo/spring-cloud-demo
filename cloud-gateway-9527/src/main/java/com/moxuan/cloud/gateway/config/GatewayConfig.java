package com.moxuan.cloud.gateway.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.ZonedDateTime;

/**
 * @ProjectName dxyt-mdm
 * @ClassName GatewayConfig
 * @Author zhangkai
 * @Description
 * @Date 2020/3/31 10:04 下午
 */
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_moxuan",
                        r -> r.path("/guonei")
                                .uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }

    @Bean
    public RouteLocator route(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_moxuan1",
                r -> r.path("/guoji")
                        .uri("http://news.baidu.com/guoji")).build();
        return routes.build();
    }

    public static void main(String[] args) {
        // gateway 时间断言格式  基于 java 8 的时间格式
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        //  2020-04-14T18:15:17.036+08:00[Asia/Shanghai]
    }
}
