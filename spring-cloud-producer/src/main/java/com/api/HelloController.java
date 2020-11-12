package com.api;

import java.io.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.*;

import javax.print.attribute.HashAttributeSet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author HAND_WEILI 2020/11/04 8:01
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello "+name+"，this is first messge";
    }
   /* public void testThread(){
        // exetuotr
        //  ExecutorService
        // Executors
        // Executors.newSingleThreadExecutor()
        // 如何 使用 线程池
        ExecutorService executorService =Executors.newSingleThreadExecutor();
        //ExecutorService executorService = new ThreadPoolExecutor(1,1,10L, TimeUnit.SECONDS,new  Queue<Runnable> s);
        // 装饰器模式
        // 深拷贝
        try {
            Object s = new  HelloController();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject( s );
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 流的操作
    }
    // jdk动态代理测试

    }*/
}
