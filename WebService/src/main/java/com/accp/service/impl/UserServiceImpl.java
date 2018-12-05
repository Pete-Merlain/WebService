package com.accp.service.impl;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.User;
import com.accp.mapper.UserMapper;
import com.accp.service.UserService;

@Service
@WebService(
		serviceName="UserService",
		targetNamespace="http://impl.service.accp.com",
		endpointInterface="com.accp.service.UserService"
)
public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper usermapper;
	
	@Override
	public List<User> queryAll() {
		// TODO Auto-generated method stub
		return usermapper.queryAll();
	}

}
