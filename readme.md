## 此项目是为了学习spring cloud框架的基础项目
对各项目进行介绍
### register_1和register_2
此为注册中心`Eureka`集群式，各注册中心实例会相互注册，且是相互平等的实例
### rest_api_1和rest_api_2
此为基础的微服务，一般只是对数据库的`CRUD`操作，不会出现高级的操作，犹如正常项目的`dao`层
### gateway
此为微服务的网关，结合`Ribbon`做负载均衡处理，配置网关的策略，使其可以做正确的路由转发
### door
此为面向用户或面向前端的微服务，通过从注册中心`Eureka`中获取正确的映射地址来正确的从`gateway`中转发到基础的微服务，此时的流程图就成了下图所示
![](https://cloud.spring.io/spring-cloud-gateway/2.2.x/reference/html/images/spring_cloud_gateway_diagram.png)