package com.lw.dao;



import com.lw.dao.base.BaseDao;
import com.lw.dto.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by james on 2018/10/8.
 */
@Component
public class GoodsDao {
    @Autowired
    BaseDao baseDao;


    //获取商品列表
    public List<Goods> getList() {
        String sql = "select * from goods order by id asc";
        return baseDao.query(sql,Goods.class,new Object[]{});
    }



}
