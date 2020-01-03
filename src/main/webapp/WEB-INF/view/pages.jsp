<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<input type="button" onclick="goPage(${Info.navigateFirstPage})"
	value="首页">
<input type="button"
	onclick="goPage(${Info.prePage==0?1:Info.prePage })" value="上一页">
<input type="button"
	onclick="goPage(${Info.nextPage ==0?Info.pages:Info.nextPage})"
	value="下一页">
<input type="button" onclick="goPage(${Info.navigateLastPage})"
	value="尾页">
