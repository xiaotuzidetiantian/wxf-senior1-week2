package com.wuxufang.week2.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.wuxufang.week2.domain.Goods;
import com.wuxufang.week2.service.GoodsService;
import com.wuxufang.week2.vo.GoodsVo;

@Controller
public class GoodsController {

	@Resource
	private GoodsService service;
	
	@RequestMapping("selects")
	public String selects(GoodsVo goodsVo,Model m,@RequestParam(defaultValue="1")Integer page,@RequestParam(defaultValue="20")Integer pageSize) {
		PageInfo<Goods> Info = service.selects(goodsVo, page, pageSize);
		m.addAttribute("Info", Info);
		m.addAttribute("goodsVo", goodsVo);
		return "goods";
	}
}
