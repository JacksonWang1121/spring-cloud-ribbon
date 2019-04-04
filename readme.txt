Service Ribbon服务消费者的创建过程
    1、添加依赖
        spring-cloud-starter-netflix-eureka-server
        spring-cloud-starter-netflix-ribbon
    2、在@SpringbootApplication注解的启动类
        （1）打上注解@EnableDiscoveryClient
        （2）向程序的IOC容器注入一个Bean：restTemplate，
             通过注解@LoadBalanced表明这个restTemplate开启负载均衡
    3、配置application.yml
    4、写一个测试类，调用服务注册中心的服务

注：
    1、Ribbon+Rest
    2、Ribbon是一个负载均衡客户端，可以很好的控制http和tcp的一些行为


在Ribbon中使用断路器Hystrix
    1、添加依赖
        spring-cloud-starter-netflix-hystrix（注意版本一致）
    2、在@SpringbootApplication注解的启动类
        打上注解@EnableHystrix
    3、在方法上加上@HystrixCommand注解，该注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法