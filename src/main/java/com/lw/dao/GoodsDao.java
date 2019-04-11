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

    //保存商品
    public int insGoods (Goods goods) {
        StringBuffer sql =new StringBuffer();
        sql.append(" insert into goods (title,titlesub,price,priceold,pic) \n" +
                "values(:title,:titlesub,:price,:priceold,:pic) ");
        return baseDao.insert(sql.toString(),goods);
    }



}
