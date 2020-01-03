package com.wuxufang.week2.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuxufang.week2.dao.GoodsMapper;
import com.wuxufang.week2.domain.Goods;
import com.wuxufang.week2.service.GoodsService;
import com.wuxufang.week2.vo.GoodsVo;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Resource
	private GoodsMapper mapper;

	@Override
	public PageInfo<Goods> selects(GoodsVo goodsVo, Integer page, Integer pageSize) {
		PageHelper.startPage(page, pageSize);
		List<Goods> list = mapper.selects(goodsVo);
		PageInfo<Goods> Info = new PageInfo<Goods>(list);
		return Info;
	}

	@Override
	public int insert(List<Goods> goods) {
		return mapper.insert(goods);
	}
	
}
