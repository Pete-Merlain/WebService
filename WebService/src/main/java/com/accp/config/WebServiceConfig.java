package com.accp.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.accp.service.UserService;

@Configuration
@SuppressWarnings("all")
public class WebServiceConfig {

	@Autowired
	public UserService userService;
	
	@Bean(name="cxfservlet")
	public ServletRegistrationBean cxfServlet() {
		return new ServletRegistrationBean(new CXFServlet(), "/webservice/*");
	}
	
	@Bean(name=Bus.DEFAULT_BUS_ID)
	public SpringBus springBus() {
		return new SpringBus();
	}
	
	@Bean(name="UserServiceEndpoint")
	public Endpoint sweptPayEndpoint() {
		EndpointImpl endpointImpl=new EndpointImpl(springBus(), userService);
		endpointImpl.publish("/userservice");
		return endpointImpl;
	}
}
