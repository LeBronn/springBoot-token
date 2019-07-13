# springbootToken

#### 介绍
springbootToken登录验证demo

#### 软件架构
软件架构说明
springBoot整合token


#### 安装教程

1. 导入项目到开发工具
2. 导入sql到mysql
3. 启动项目，打开postMan或者其他调试接口工具

#### 使用说明

1. 先登录，获取token
2. 不设置token到header访问getMessage接口
3. 设置token到header访问getMessage接口


开始测试
![avatar](https://img2018.cnblogs.com/blog/1488478/201905/1488478-20190527175251961-555871155.png)
## 成功登陆后保存token到前端cookie 以后的请求带上token即可区别是哪个用户的请求！

![avatar](https://img2018.cnblogs.com/blog/1488478/201905/1488478-20190527180201244-347120532.png)

我们下一个请求在请求的时候带上这个token试试
![avatar](https://img2018.cnblogs.com/blog/1488478/201905/1488478-20190527175933264-430036308.png)
成功通过验证！ 我们看一下后端控制台打印的结果！
![avatar](https://img2018.cnblogs.com/blog/1488478/201905/1488478-20190527180010396-949687945.png)

打印出带这个token的用户
