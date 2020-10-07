# 简介
springboot+rabbitmq的简单demo，包含三个模块
- direct-exchange,直接路由模式
- fanout-exchange,订阅模式
- topic-exchange,主题模式

# 代码运行前的配置
先安装好rabbitmq即可。把这份代码下载到本地，让它自动加载所需jar包。

# 代码内的配置
application.properties文件，配置了rabbitmq的连接信息，如果是本地默认的rabbitmq，不配也可以。
要测试的话，直接启动test目录下的@SpringBootTest注解的类即可。
有什么疑问的话，可以在csdn给我留言
https://blog.csdn.net/qq_28908085/article/details/108948066
