package com.ljz.todolistspringboot.login.service.Impl;

import com.ljz.todolistspringboot.login.mapper.LoginuserinfoMapper;
import com.ljz.todolistspringboot.login.model.Loginuserinfo;
import com.ljz.todolistspringboot.login.model.LoginuserinfoExample;
import com.ljz.todolistspringboot.login.service.LoginUserInfoService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: todolist-springboot
 * @description: 这是一个登陆用户的类
 * @author: li jinzhao
 * @create: 2020-06-27 15:20
 */
@Service
public class LoginUserInfoServiceImpl  implements LoginUserInfoService {
    @Autowired
    LoginuserinfoMapper mapper;
    @Override
    public long countByExample(LoginuserinfoExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(LoginuserinfoExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String userid) {
        return mapper.deleteByPrimaryKey(userid);
    }

    @Override
    public int insert(Loginuserinfo record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Loginuserinfo record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<Loginuserinfo> selectByExample(LoginuserinfoExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public Loginuserinfo selectByPrimaryKey(String userid) {
        return mapper.selectByPrimaryKey(userid);
    }

    @Override
    public int updateByExampleSelective(Loginuserinfo record, LoginuserinfoExample example) {
        return mapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Loginuserinfo record, LoginuserinfoExample example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Loginuserinfo record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Loginuserinfo record) {
        return mapper.updateByPrimaryKey(record);
    }
}
