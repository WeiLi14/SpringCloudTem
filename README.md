# SpringCloudTem
##Spring_Cloud_Eureka 服务端。
  用于服务的发现与注册。由于此特性所以需要进行高可用的集群搭建，原理就是同时创建多个服务端并进行相互注册。
  使用springboot搭建方式非常简单。
  第一步创建一个springboot项目并加入eureka的依赖
  第二步添加@EnableEurekaServer 注解在启动类上
  第三步添加配置信息
##Spring_Cloud_producer 生产者，提供服务
  1、生产者本身就是一个Eureka的客户端，因此需要引入Eureka的引用，其次是一个web项目因此也需要引入web依赖。（但是spirngboot不就是一个web项目了吗，想不通）
  2、创建对应的控制层，并写一个简单方法。
  3、测试是否能够成功调用
##Spring_Cloud_consumer 消费者，获取服务 
  1、添加eureka客服端，feign调用客户端。
  2、创建feign客户端接口，方法名要一致。
##Spring_Cloud_config 配置端
  1、由于当拆分的服务变多的时候，维护各个子系统之间的配置信息变得极其复杂和容易出错。因此我们使用一个统一的配置系统，将配置信息分发给不同服务。
  
  
