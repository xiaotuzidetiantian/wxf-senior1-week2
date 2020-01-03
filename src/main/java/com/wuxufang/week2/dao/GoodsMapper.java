package com.wuxufang.week2.dao;

import java.util.List;

import com.wuxufang.week2.domain.Goods;
import com.wuxufang.week2.vo.GoodsVo;

public interface GoodsMapper {

	//模糊查询
	List<Goods> selects(GoodsVo goodsVo);
	
	//批量插入
	int insert(List<Goods> goods);
	
}
