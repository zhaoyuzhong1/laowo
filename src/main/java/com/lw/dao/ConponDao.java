package com.lw.dao;



import com.lw.dao.base.BaseDao;
import com.lw.dto.Conpon;
import com.lw.dto.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by james on 2018/10/8.
 */
@Component
public class ConponDao {
    @Autowired
    BaseDao baseDao;


    //获取商品列表
    public List<Conpon> getList() {
        String sql = "select * from conpon order by id asc";
        return baseDao.query(sql,Conpon.class,new Object[]{});
    }

    //保存商品
    public int insConpon (Conpon conpon) {
        StringBuffer sql =new StringBuffer();
        sql.append(" insert into conpon (couponid,isuse,createdate,expdate,getmethod) \n" +
                "values(:couponid,:isuse,now(),:expdate,:getmethod) ");
        return baseDao.insert(sql.toString(),conpon);
    }



}
