package com.qiaodan.service;

import com.qiaodan.DAO.UserinfoMapper;
import com.qiaodan.inmodel.LoginInModel;
import com.qiaodan.model.Userinfo;
import com.qiaodan.outmodel.BaseOutModel;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by qiaodan on 2017/5/9.
 */
public class RegisterService {

    @Autowired
    UserinfoMapper userinfoMapper;

    public BaseOutModel register(LoginInModel model){
        BaseOutModel outModel = new BaseOutModel();
        if (model==null){
            outModel.setCode(0);
            outModel.setMessage("参数错误！");
            return outModel;
        }else if (model.getName()==null||model.getName().length()==0){
            outModel.setCode(0);
            outModel.setMessage("用户名不能为空！");
            return outModel;
        }else if (model.getPassword()==null||model.getPassword().length()==0){
            outModel.setMessage("密码不能为空");
            outModel.setCode(0);
            return outModel;
        }
        Userinfo userinfo = new Userinfo();
        userinfo.setUsername(model.getName());
        userinfo.setPassword(model.getPassword());
        userinfo.setTruename(model.getTruename());
        userinfo.setAddress(model.getAddress());
        userinfo.setEmail(model.getEmail());
        userinfo.setPhoneno(model.getPhoneno());
        userinfo.setSex(model.getSex());
        int rs = userinfoMapper.insert(userinfo);
        if (rs==1){
            outModel.setCode(1);
            outModel.setMessage("注册成功！");
            return outModel;
        }else {
            outModel.setCode(0);
            outModel.setMessage("注册失败！");
            return outModel;
        }
    }
}