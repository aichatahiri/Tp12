package com.example.demo.config;

import com.example.demo.impl.HelloServiceImpl;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.cxf.Bus;
import jakarta.xml.ws.Endpoint;

@Configuration
public class CxfConfig {

    private final Bus bus;

    public CxfConfig(Bus bus) {
        this.bus = bus;
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new HelloServiceImpl());
        endpoint.publish("/hello"); // URL finale: http://localhost:8080/services/hello
        return endpoint;
    }
}
