package com.api.feignClinet;

import org.springframework.stereotype.Component;

/**
 * 该实现类为hystix的回调类，需要继承feign调用的类
 * 记住该类需要被申明为一个componet
 *
 * @author HAND_WEILI 2020/11/04 15:44
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{

    @Override
    public String hello(String name) {
        return "当前方法失败调用hystrix的回调函数";
    }
}
