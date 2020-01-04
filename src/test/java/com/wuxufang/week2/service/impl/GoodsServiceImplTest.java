package com.wuxufang.week2.service.impl;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wuxufang.util.NumberUtil;
import com.wuxufang.util.StreamUtil;
import com.wuxufang.util.StringUtil;
import com.wuxufang.week2.domain.Goods;
import com.wuxufang.week2.service.GoodsService;

//启动spring容器
@ContextConfiguration(locations = "classpath:spring-beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class GoodsServiceImplTest {

	@Resource
	private GoodsService service;
	
	@Test
	public void testSelects() {
		
	}

	/**
	 * 
	 * @Title: testInsert 
	 * @Description: 闁诲海鏁搁崢褔宕ｉ崱娑樻瀬闁绘鐗嗙粊锔界箾閺夋埈鍎撻柣锔诲灣閻氬墽鐚惧Δ绀慜
	 * @return: void
	 */
	@Test
	//导入数据
	
	public void testInsert() {
		List<Goods> goodsList = new ArrayList<Goods>();
		//调用工具类
		List<String> list = StreamUtil.readLine(this.getClass().getResourceAsStream("/data.txt"));
		for (int j = 0; j <list.size(); j++) {
			Goods goods = new Goods();
			String[] s = list.get(j).split("\\==");
			goods.setGid(Integer.parseInt(s[0]));
			
			if(StringUtil.hasText(s[1])) {
				goods.setGname(s[1]);
			}
			
			//处理价格
			//判断是否有值 
			if(StringUtil.hasText(s[2]) ) {
				String price = s[2].substring(1);
				//判断是否是数字
				if(NumberUtil.isNumber(price)) {
					BigDecimal p = new BigDecimal(price);
					goods.setPrice(p);
				}
			}
			
			//处理百分比，如果有值
			if(s.length > 3 && StringUtil.hasText(s[3])) {
				String sales = s[3].substring(0,s[3].length()-1);
				goods.setSales(Integer.parseInt(sales));
			} else {
				goods.setSales(0);
			}
			
			goodsList.add(goods);
		}
		System.out.println(goodsList);
		service.insert(goodsList);
	}

}
