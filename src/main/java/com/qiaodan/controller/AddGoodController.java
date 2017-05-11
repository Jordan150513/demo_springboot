package com.qiaodan.controller;

import com.qiaodan.DAO.GoodDetailMapper;
import com.qiaodan.inmodel.SingleGoodInModel;
import com.qiaodan.model.GoodDetail;
import com.qiaodan.outmodel.BaseOutModel;
import com.qiaodan.service.AddGoodService;
import com.qiaodan.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qiaodan on 2017/5/11.
 */
@RestController
@RequestMapping("/AddGoodController/")
public class AddGoodController {

    @Autowired
    private AddGoodService addGoodService;
    //  http://localhost:9090/QD/AddGoodController/addSingleGood?goodName=圣迪奥女裙&goodColor=白&goodPrice=228.0&goodRemainCount=24$goodSize=L
    @RequestMapping("addSingleGood")
    public BaseOutModel addSingleGood(SingleGoodInModel model){
       return addGoodService.addSingle(model);
    }
    @RequestMapping("addGoods")
    public  BaseOutModel addGoods(){
        return addGoodService.addGoods();
    }
}
