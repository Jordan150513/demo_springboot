package com.qiaodan.controller;

import com.qiaodan.DAO.UserinfoMapper;
import com.qiaodan.inmodel.LoginInModel;
import com.qiaodan.model.Userinfo;
import com.qiaodan.outmodel.BaseOutModel;
import com.qiaodan.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qiaodan on 2017/5/9.
 */
@RestController
@RequestMapping("RegisterControlller")
public class RegisterControlller {

    @Autowired
    RegisterService registerService;

    public BaseOutModel doRegister(LoginInModel model){
        return registerService.register(model);
    }
}
