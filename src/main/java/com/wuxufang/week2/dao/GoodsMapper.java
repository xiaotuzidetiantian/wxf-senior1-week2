package com.wuxufang.week2.dao;

import java.util.List;

import com.wuxufang.week2.domain.Goods;
import com.wuxufang.week2.vo.GoodsVo;

public interface GoodsMapper {

	//ģ����ѯ
	List<Goods> selects(GoodsVo goodsVo);
	
	//��������
	int insert(List<Goods> goods);
	
}
