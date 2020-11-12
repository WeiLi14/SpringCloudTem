
package com.api.feignClinet;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * description
 *
 * @author HAND_WEILI 2020/11/04 8:31
 */
// value指向要去访问的服务名称
@FeignClient(value="spring-cloud-producer",fallback =HelloRemoteHystrix.class)
// 需要注册成一个bean
@Component
public interface HelloRemote {
//name:远程服务名，及spring.application.name配置的名称
//    此类中的方法和远程服务中contoller中的方法名和参数需保持一致。
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}
