# ratel-cloud 微服务快速开发平台

## 快速开始

### 先决条件

首先本机先要安装以下环境，建议先学习了解springboot和springcloud基础知识。

- [git](https://git-scm.com/)
- [java8](http://www.oracle.com/technetwork/java/javase/downloads/index.html) 
- [maven](http://maven.apache.org/) 

### 功能概述

- 配置中心：Nacos。
- 服务注册与发现：Nacos。
- 服务网关：Spring Gateway，支持动态路由和灰度。
- 断路保护和流量控制：计划Sentinel。
- 服务监控：SpringCloud Admin。
- 服务安全：。
- 消息通知：计划RibbitMQ、Event。。
- 分布式事务：计划集成seata/fescar。
- 日志：。
- 依赖组件：。

## 工程结构

``` 
ratel-cloud（Nacos、Fegin、Ribbon、Gateway、Hystrix）
├── rc-common -- 通用组件
├    ├── rc-common-bus -- 消息、事件、通知相关（计划：RabbitMQ、Event）
├    ├── rc-common-swagger2 -- API接口文档
├    ├── rc-common-log -- 日志组件
├    └── rc-common-security -- 安全认证
├── rc-gateway -- Spring Cloud 网关
├── rc-monitor -- 监控
├    └── rc-monitor-admin -- Spring Admin 监控
├── rc-zipkin -- 日志收集
├── rc-modules -- 服务集合
├    ├── rc-modules-demo -- 模版服务
├    ├── rc-modules-user -- 用户中心
├    ├── rc-modules-auth -- 权限管理
├    ├── rc-modules-msg -- 消息中心
├    ├── rc-modules-sms -- 短信中心
├    └── rc-modules-file -- 文件中心(计划：FTP、FastDFS)
└── rc-nacos -- 配置中心、注册中心
```

## 技术栈/版本介绍：
- 所涉及的相关的技术有：
    - JSON序列化:Jackson
    - 消息队列：RabbitMQ、Event
    - 缓存：Redis
    - 缓存框架：J2Cache
    - 数据库： MySQL 5.7.9 或者 MySQL 8.0.19
    - 定时器：采用xxl-jobs项目进行二次改造
    - 前端：vue、react
    - 持久层框架： Jpa、Mybatis-plus
    - API网关：Gateway
    - 服务注册与发现: Nacos
    - 服务消费：OpenFeign
    - 负载均衡：Ribbon
    - 配置中心：Nacos
    - 服务熔断：Hystrix
    - 项目构建：Maven 3.3
    - 分布式事务：seata
    - 分布式系统的流量防卫兵： Sentinel
    - 监控： spring-boot-admin 2.2.X
    - 链路调用跟踪： zipkin 2.19.2
    - 搜索引擎中间件：elasticsearch
    - 日志收集中间件：Zipkin
    - 日志分析工具：ES + Kibana
    - 分库分表：Mycat
    - 文件服务器：FastDFS 5.0.5/阿里云OSS/本地存储
    - Nginx
- 部署方面：
    - 服务器：CentOS
    - Jenkins
    - Docker 18.09
    - Kubernetes 1.12
