package com.house.demo.house_demo.mapper;

import java.util.List;

import com.house.demo.house_demo.common.model.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper {

	public List<User>  selectUsers();
	
}
