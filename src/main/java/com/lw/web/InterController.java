package com.lw.web;


import com.alibaba.fastjson.JSONObject;
import com.lw.dao.ConponDao;
import com.lw.dao.GoodsDao;
import com.lw.dao.UserDao;
import com.lw.dto.Conpon;
import com.lw.dto.Goods;
import com.lw.dto.User;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "inter")
public class InterController {
	@Autowired
	GoodsDao goodsDao;

	@Autowired
	ConponDao conponDao;

	@Autowired
	UserDao userDao;

	@ResponseBody
	@RequestMapping(value = "/getGoods")
	public String getGoods(){
		JSONObject jo = new JSONObject();
		List<Goods> goodses = goodsDao.getList();
		if(goodses.size()>0){
			jo.put("code","0");
			JSONArray ja = new JSONArray();
			for(Goods goods : goodses){
				JSONObject jo1 = new JSONObject();
				jo1.put("id",goods.getId());
				jo1.put("title",goods.getTitle());
				jo1.put("titlesub",goods.getTitlesub());
				jo1.put("price",goods.getPrice());
				jo1.put("priceold",goods.getPriceold());
				jo1.put("pic",goods.getPic());
				ja.put(jo1);
			}
			jo.put("list",ja);
		}else{
			jo.put("code","1");
		}
		return jo.toJSONString();
	}


	//传的参数和数据库的字段名称对应上即可
	@ResponseBody
	@RequestMapping(value = "/insGoods")
	public String insGoods(Goods goods){
		JSONObject jo = new JSONObject();
		int flag = goodsDao.insGoods(goods);
		if(flag>0){
			jo.put("code","0");
		}else{
			jo.put("code","1");
		}
		return jo.toJSONString();
	}



	@ResponseBody
	@RequestMapping(value = "/getConpons")
	public String getConpons(){
		JSONObject jo = new JSONObject();
		List<Conpon> cs = conponDao.getList();
		if(cs.size()>0){
			jo.put("code","0");
			JSONArray ja = new JSONArray();
			for(Conpon conpon : cs){
				JSONObject jo1 = new JSONObject();
				jo1.put("id",conpon.getId());
				jo1.put("couponid",conpon.getCouponid());
				jo1.put("isuse",conpon.getIsuse());
				jo1.put("createdate",conpon.getCreatedate());
				jo1.put("expdate",conpon.getExpdate());
				jo1.put("getmethod",conpon.getGetmethod());
				ja.put(jo1);
			}
			jo.put("list",ja);
		}else{
			jo.put("code","1");
		}
		return jo.toJSONString();
	}


	//传的参数和数据库的字段名称对应上即可
	@ResponseBody
	@RequestMapping(value = "/insConpons")
	public String insConpons(Conpon conpon){
		JSONObject jo = new JSONObject();
		int flag = conponDao.insConpon(conpon);
		if(flag>0){
			jo.put("code","0");
		}else{
			jo.put("code","1");
		}
		return jo.toJSONString();
	}



	@ResponseBody
	@RequestMapping(value = "/getUsers")
	public String getUsers(){
		JSONObject jo = new JSONObject();
		List<User> users = userDao.getList();
		if(users.size()>0){
			jo.put("code","0");
			JSONArray ja = new JSONArray();
			for(User user : users){
				JSONObject jo1 = new JSONObject();
				jo1.put("id",user.getId());
				jo1.put("name",user.getName());
				ja.put(jo1);
			}
			jo.put("list",ja);
		}else{
			jo.put("code","1");
		}
		return jo.toJSONString();
	}


	//传的参数和数据库的字段名称对应上即可
	@ResponseBody
	@RequestMapping(value = "/insUsers")
	public String insUsers(User user){
		JSONObject jo = new JSONObject();
		int flag = userDao.insUser(user);
		if(flag>0){
			jo.put("code","0");
		}else{
			jo.put("code","1");
		}
		return jo.toJSONString();
	}





}
