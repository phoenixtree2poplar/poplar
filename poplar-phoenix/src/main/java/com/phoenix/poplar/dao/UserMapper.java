package com.phoenix.poplar.dao;

import com.phoenix.poplar.entity.User;
//import org.apache.ibatis.annotations.Mapper;

//@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}