package com.example.demo.api;

import com.example.demo.model.Person;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(targetNamespace = "http://api.cxf.acme.com/")
public interface HelloService {

    @WebMethod
    String sayHello(String name);

    @WebMethod
    Person findPersonById(String id);
}
