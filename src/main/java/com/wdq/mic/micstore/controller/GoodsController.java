package com.wdq.mic.micstore.controller;

import com.wdq.mic.micstore.services.GoodsSerivces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/goods")
public class GoodsController {

    @Autowired
    GoodsSerivces goodsSerivces;

    @RequestMapping(value = "/all")
    public Object findAll(){
        return goodsSerivces.findAll();
    }

    @RequestMapping(value = "/find/{params}")
    public Object findByParams(@PathVariable(value = "params")String params){

        return goodsSerivces.findByName_code_type_class(params);
    }


}
