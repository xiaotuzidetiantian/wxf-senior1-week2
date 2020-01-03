package com.wuxufang.week2.vo;

import java.io.Serializable;

/**
 * 
 * @ClassName: GoodsVo 
 * @Description: ��װǰ�˵Ĳ�ѯ����TODO
 * @author: ��
 * @date: 2020��1��3�� ����9:19:01
 */
public class GoodsVo implements Serializable {

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;

	private String startPrice;
	
	private String endPrice;
	
	private String startSales;
	
	private String endSales;
	
	//�����ֶ�
	private String orderColumn;
	
	//���򷽷� 
	private String orderMethod;

	public GoodsVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoodsVo(String startPrice, String endPrice, String startSales, String endSales, String orderColumn,
			String orderMethod) {
		super();
		this.startPrice = startPrice;
		this.endPrice = endPrice;
		this.startSales = startSales;
		this.endSales = endSales;
		this.orderColumn = orderColumn;
		this.orderMethod = orderMethod;
	}

	public String getStartPrice() {
		return startPrice;
	}

	public void setStartPrice(String startPrice) {
		this.startPrice = startPrice;
	}

	public String getEndPrice() {
		return endPrice;
	}

	public void setEndPrice(String endPrice) {
		this.endPrice = endPrice;
	}

	public String getStartSales() {
		return startSales;
	}

	public void setStartSales(String startSales) {
		this.startSales = startSales;
	}

	public String getEndSales() {
		return endSales;
	}

	public void setEndSales(String endSales) {
		this.endSales = endSales;
	}

	public String getOrderColumn() {
		return orderColumn;
	}

	public void setOrderColumn(String orderColumn) {
		this.orderColumn = orderColumn;
	}

	public String getOrderMethod() {
		return orderMethod;
	}

	public void setOrderMethod(String orderMethod) {
		this.orderMethod = orderMethod;
	}

	@Override
	public String toString() {
		return "GoodsVo [startPrice=" + startPrice + ", endPrice=" + endPrice + ", startSales=" + startSales
				+ ", endSales=" + endSales + ", orderColumn=" + orderColumn + ", orderMethod=" + orderMethod + "]";
	}
	
}
