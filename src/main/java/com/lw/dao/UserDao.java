package com.lw.dao;



import com.lw.dao.base.BaseDao;
import com.lw.dto.Goods;
import com.lw.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by james on 2018/10/8.
 */
@Component
public class UserDao {
    @Autowired
    BaseDao baseDao;


    //获取商品列表
    public List<User> getList() {
        String sql = "select * from user order by id asc";
        return baseDao.query(sql,User.class,new Object[]{});
    }

    //保存商品
    public int insUser (User user) {
        StringBuffer sql =new StringBuffer();
        sql.append(" insert into user (name) values(:name) ");
        return baseDao.insert(sql.toString(),user);
    }



}
