package com.accp.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.accp.domain.User;

@WebService
public interface UserService {

	@WebMethod
	List<User> queryAll();
}
