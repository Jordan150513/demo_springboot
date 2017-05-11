package com.qiaodan.controller;

import com.qiaodan.inmodel.LoginInModel;
import com.qiaodan.outmodel.BaseOutModel;
import com.qiaodan.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qiaodan on 2017/5/9.
 */
@ComponentScan("com.qiaodan.DAO")
@RestController
@RequestMapping("/RegisterControlller/")
public class RegisterControlller {

    @Autowired
   private RegisterService registerService;
// http://localhost:9090/QD/RegisterControlller/doRegister?name=baozi&password=baozi123&truename=baobao&sex=1&address=hunanchangsha&phoneno=18995627706&email=baobao@qq.com

@RequestMapping("doRegister")
    public BaseOutModel register(LoginInModel model){
        return registerService.register(model);
    }
}
