package com.wuxufang.week2.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.wuxufang.week2.domain.Goods;
import com.wuxufang.week2.vo.GoodsVo;

public interface GoodsService {

	//模糊查询
	PageInfo<Goods> selects(GoodsVo goodsVo,Integer page,Integer pageSize);
		
	//批量插入
	int insert(List<Goods> goods);
}
