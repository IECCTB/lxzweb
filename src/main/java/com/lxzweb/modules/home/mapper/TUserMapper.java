package com.lxzweb.modules.home.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lxzweb.modules.home.domain.TUser;
@Mapper
public interface TUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
    
    List<TUser> getAll();
}