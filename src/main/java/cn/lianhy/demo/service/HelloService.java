package cn.lianhy.demo.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://service.demo.lianhy.cn")
public interface HelloService {
    @WebMethod
    String sayHello(@WebParam(name = "userName") String userName);
}
