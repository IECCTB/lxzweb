package com.lxzweb.modules.home.service;

import java.util.List;


import com.lxzweb.modules.home.domain.TUser;


public interface UserService {
    int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
    
    List<TUser> getAll();
}