package com.wuxufang.week2.domain;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * 
 * @ClassName: Goods 
 * @Description: 商品类TODO
 * @author: 煜
 * @date: 2020年1月3日 上午9:15:38
 */
public class Goods implements Serializable {

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;

	private Integer gid;
	
	private String gname;
	
	private BigDecimal price;
	
	private Integer sales;

	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Goods(Integer gid, String gname, BigDecimal price, Integer sales) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.price = price;
		this.sales = sales;
	}

	public Integer getGid() {
		return gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getSales() {
		return sales;
	}

	public void setSales(Integer sales) {
		this.sales = sales;
	}

	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", price=" + price + ", sales=" + sales + "]";
	}
	
}
