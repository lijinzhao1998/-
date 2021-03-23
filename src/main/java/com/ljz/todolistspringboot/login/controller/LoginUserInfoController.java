package com.ljz.todolistspringboot.login.controller;

import com.ljz.todolistspringboot.login.model.Loginuserinfo;
import com.ljz.todolistspringboot.login.model.LoginuserinfoExample;
import com.ljz.todolistspringboot.login.service.LoginUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Random;

/**
 * @program: todolist-springboot
 * @description: 用户登录的控制类
 * @author: li jinzhao
 * @create: 2020-06-27 15:29
 */
@RestController
@CrossOrigin
public class LoginUserInfoController {
    @Autowired
    LoginUserInfoService service;
    @GetMapping("/login")
    public  List<Loginuserinfo> getloginuserinfo(@RequestParam String userLoginId,@RequestParam String currentPassWord){
       LoginuserinfoExample example = new LoginuserinfoExample();
       LoginuserinfoExample.Criteria criteria = example.createCriteria();
       criteria.andUserLoginIdEqualTo(userLoginId);
       criteria.andCurrentPassWordEqualTo(currentPassWord);

       List<Loginuserinfo>  list= service.selectByExample(example);

       return  list;
    }
    @PostMapping("/login")
    public Object  login(@RequestBody Loginuserinfo loginuserinfo, HttpServletRequest request) {
        String userLoginId = loginuserinfo.getUserLoginId();
        String password = loginuserinfo.getCurrentPassWord();
        if(userLoginId != null && password != null){
            LoginuserinfoExample example = new LoginuserinfoExample();
            LoginuserinfoExample.Criteria criteria = example.createCriteria();
            criteria.andUserLoginIdEqualTo(userLoginId);
            criteria.andCurrentPassWordEqualTo(password);
            List<Loginuserinfo> list = service.selectByExample(example);

            if(list.size()>0){
                // request.getSession().setAttribute("USER_SESSION", list.get(0));
                loginuserinfo = list.get(0);
                return loginuserinfo;
                }else
                    return "404";

            }else
                return "404";

    }

    /**
     * 注册用户的代码
     * @param loginuserinfo
     * @return LoginUserInfo
     */
    @PostMapping("/register")
    public  Object addLoginUser(@RequestBody Loginuserinfo loginuserinfo){
        Integer id = (int)(new Random().nextDouble()*10000000);
        loginuserinfo.setUserId(id.toString());
        service.insert(loginuserinfo);
        return  loginuserinfo;

    }

    /**
     * 验证登录名是否重复，防止重复的登录id和密码
     * @param userLoginId
     * @return String
     */
    @GetMapping("/register")
    public  Object isUserNameHave(@RequestParam String userLoginId){
        LoginuserinfoExample example = new LoginuserinfoExample();
        LoginuserinfoExample.Criteria criteria = example.createCriteria();
        criteria.andUserLoginIdEqualTo(userLoginId);
        List<Loginuserinfo> list = service.selectByExample(example);
        if (list.size()>0){
            return "404";
        }else{
            return "200";
        }

    }









}
