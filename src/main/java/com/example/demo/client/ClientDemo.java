package com.example.demo.client;

import com.example.demo.api.HelloService;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import java.net.URL;

public class ClientDemo {
    public static void main(String[] args) throws Exception {
        // 1. URL du WSDL
        URL wsdl = new URL("http://localhost:8080/services/hello?wsdl");

        // 2. QName(namespace, serviceName)
        QName qname = new QName("http://api.cxf.acme.com/", "HelloService");

        // 3. Créer le service
        Service svc = Service.create(wsdl, qname);

        // 4. Obtenir le port (proxy Java)
        HelloService port = svc.getPort(HelloService.class);

        // 5. Appels SOAP via le proxy
        System.out.println(port.sayHello("ClientJava"));
        System.out.println(port.findPersonById("P-777").getName());
    }
}
