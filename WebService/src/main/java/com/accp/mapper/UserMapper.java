package com.accp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.accp.domain.User;

@Mapper
public interface UserMapper {

	List<User> queryAll();
}
