package com.wdq.mic.micstore.services;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.wdq.mic.micstore.bean.GoodsBean;
import org.springframework.stereotype.Service;

//@Service
public interface GoodsSerivces {

        PageInfo<GoodsBean> findAll();
        PageInfo<GoodsBean> findByName_code_type_class(String params);


        void update(GoodsBean bean);
        void add(GoodsBean bean);
}
