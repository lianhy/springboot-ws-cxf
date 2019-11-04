package cn.lianhy.demo.service.impl;

import cn.lianhy.demo.service.HelloService;

import javax.jws.WebService;

@WebService(serviceName = "HelloService",//服务名
        targetNamespace = "http://service.demo.lianhy.cn",//包名倒叙，并且和接口定义保持一致
        endpointInterface = "cn.lianhy.demo.service.HelloService")//包名
public class HelloServiceImpl implements HelloService{
    @Override
    public String sayHello(String userName) {
        return "Hello "+userName;
    }
}
