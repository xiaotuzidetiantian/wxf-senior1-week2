package com.wuxufang.week2.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.wuxufang.week2.domain.Goods;
import com.wuxufang.week2.vo.GoodsVo;

public interface GoodsService {

	//ģ����ѯ
	PageInfo<Goods> selects(GoodsVo goodsVo,Integer page,Integer pageSize);
		
	//��������
	int insert(List<Goods> goods);
}
