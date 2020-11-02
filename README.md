# SpringCloudTem
Spring_Cloud_Eureka 服务端。
  用于服务的发现与注册。由于此特性所以需要进行高可用的集群搭建，原理就是同时创建多个服务端并进行相互注册。
  使用springboot搭建方式非常简单。
  第一步创建一个springboot项目并加入eureka的依赖
  第二步添加@EnableEurekaServer 注解在启动类上
  第三步添加配置信息
