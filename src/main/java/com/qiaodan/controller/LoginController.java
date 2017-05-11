package com.qiaodan.controller;

import com.qiaodan.DAO.UserinfoMapper;
import com.qiaodan.inmodel.LoginInModel;
import com.qiaodan.model.Userinfo;
import com.qiaodan.model.UserinfoExample;
import com.qiaodan.outmodel.BaseOutModel;
import com.qiaodan.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by qiaodan on 2017/5/9.
 */
@RestController
@RequestMapping("/LoginController/")
public class LoginController {

    @Autowired
    private UserinfoMapper userinfoMapper;
    @Autowired
    private LoginService loginService;

    //  http://localhost:9090/QD/LoginController/login?name=baozi&password=baozi123
    @RequestMapping("login")
    public BaseOutModel login(LoginInModel model){
       return loginService.login(model);
    }
}
