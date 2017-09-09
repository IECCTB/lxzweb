package com.lxzweb.modules.home.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxzweb.modules.home.domain.TUser;
import com.lxzweb.modules.home.mapper.TUserMapper;
import com.lxzweb.modules.home.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private TUserMapper userMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(TUser record) {
		return userMapper.insert(record);
	}

	@Override
	public int insertSelective(TUser record) {
		return userMapper.insertSelective(record);
	}

	@Override
	public TUser selectByPrimaryKey(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(TUser record) {
		return userMapper.updateByPrimaryKeySelective(record);
				
	}

	@Override
	public int updateByPrimaryKey(TUser record) {
		return userMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<TUser> getAll() {
		
		return userMapper.getAll();
	}

}
