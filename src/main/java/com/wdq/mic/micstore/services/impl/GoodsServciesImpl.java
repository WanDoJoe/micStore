package com.wdq.mic.micstore.services.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wdq.mic.micstore.bean.GoodsBean;
import com.wdq.mic.micstore.mybatis.imple.IGoodsMapper;
import com.wdq.mic.micstore.services.BaseServices;
import com.wdq.mic.micstore.services.GoodsSerivces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServciesImpl extends BaseServices implements GoodsSerivces {

    @Autowired
    IGoodsMapper goodsMapper;

    @Override
    public PageInfo<GoodsBean> findAll() {
        PageHelper.startPage(0,pageSize());
        PageInfo<GoodsBean> pageInfo=new PageInfo<>( goodsMapper.findAll());

        return pageInfo;
    }

    @Override
    public PageInfo<GoodsBean> findByName_code_type_class(String params) {
        PageHelper.startPage(0,pageSize());
        PageInfo<GoodsBean> pageInfo=new PageInfo<>( goodsMapper.findGoodsByParams());
        return pageInfo;
    }

    @Override
    public void update(GoodsBean bean) {
        try {
            goodsMapper.addGoods(bean);
        }catch (Exception e){

        }

    }

    @Override
    public void add(GoodsBean bean) {
         try {
                goodsMapper.updateGoods(bean);
        }catch (Exception e){

        }
    }
}
