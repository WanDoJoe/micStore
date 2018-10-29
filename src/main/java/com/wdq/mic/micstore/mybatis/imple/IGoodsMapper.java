package com.wdq.mic.micstore.mybatis.imple;

import com.wdq.mic.micstore.bean.GoodsBean;

import java.util.List;

public interface IGoodsMapper {
    List<GoodsBean> findAll();
    List<GoodsBean> findGoodsByParams();
    void addGoods(GoodsBean bean);
    void updateGoods(GoodsBean bean);
}
