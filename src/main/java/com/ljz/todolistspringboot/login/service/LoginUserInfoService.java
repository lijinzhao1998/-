package com.ljz.todolistspringboot.login.service;

import com.ljz.todolistspringboot.login.model.Loginuserinfo;
import com.ljz.todolistspringboot.login.model.LoginuserinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LoginUserInfoService {
    long countByExample(LoginuserinfoExample example);

    int deleteByExample(LoginuserinfoExample example);

    int deleteByPrimaryKey(String userid);

    int insert(Loginuserinfo record);

    int insertSelective(Loginuserinfo record);

    List<Loginuserinfo> selectByExample(LoginuserinfoExample example);

    Loginuserinfo selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") Loginuserinfo record, @Param("example") LoginuserinfoExample example);

    int updateByExample(@Param("record") Loginuserinfo record, @Param("example") LoginuserinfoExample example);

    int updateByPrimaryKeySelective(Loginuserinfo record);

    int updateByPrimaryKey(Loginuserinfo record);
}
