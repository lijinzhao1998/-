package com.ljz.todolistspringboot.login.mapper;

import com.ljz.todolistspringboot.login.model.Loginuserinfo;
import com.ljz.todolistspringboot.login.model.LoginuserinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LoginuserinfoMapper {
    long countByExample(LoginuserinfoExample example);

    int deleteByExample(LoginuserinfoExample example);

    int deleteByPrimaryKey(String userId);

    int insert(Loginuserinfo record);

    int insertSelective(Loginuserinfo record);

    List<Loginuserinfo> selectByExample(LoginuserinfoExample example);

    Loginuserinfo selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") Loginuserinfo record, @Param("example") LoginuserinfoExample example);

    int updateByExample(@Param("record") Loginuserinfo record, @Param("example") LoginuserinfoExample example);

    int updateByPrimaryKeySelective(Loginuserinfo record);

    int updateByPrimaryKey(Loginuserinfo record);
}