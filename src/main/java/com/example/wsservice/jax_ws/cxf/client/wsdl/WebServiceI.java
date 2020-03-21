package com.example.wsservice.jax_ws.cxf.client.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2020-03-21T23:21:14.497+08:00
 * Generated source version: 3.3.5
 *
 */
@WebService(targetNamespace = "http://service.cxf.wsservice.example.com/", name = "WebServiceI")
@XmlSeeAlso({ObjectFactory.class})
public interface WebServiceI {

    @WebMethod
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://service.cxf.wsservice.example.com/", className = "com.example.wsservice.cxf.client.wsdl.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://service.cxf.wsservice.example.com/", className = "com.example.wsservice.cxf.client.wsdl.SayHelloResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String sayHello(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @RequestWrapper(localName = "webserviceSave", targetNamespace = "http://service.cxf.wsservice.example.com/", className = "com.example.wsservice.cxf.client.wsdl.WebserviceSave")
    @ResponseWrapper(localName = "webserviceSaveResponse", targetNamespace = "http://service.cxf.wsservice.example.com/", className = "com.example.wsservice.cxf.client.wsdl.WebserviceSaveResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String webserviceSave(

        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1
    );
}