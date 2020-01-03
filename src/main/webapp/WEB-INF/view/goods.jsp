<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<!-- ?? css -->
<link rel="stylesheet" type="text/css" 
href="${pageContext.request.contextPath}/resource/bootstrap.css">
<!-- ??js -->
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/jquery-3.2.1.js"></script>
<script type="text/javascript">
	function goPage(page) {
		location.href = "/selects?page="+page+"&"+$("#form1").serialize();
	}
</script>
</head>
<body>
	
	<h2>列表展示页面</h2>
	<div>
		<form action="/selects" method="post" id="form1">
			商品价格：<input type="text" name="startPrice" value="${goodsVo.startPrice }">--<input type="text" name="endPrice" value="${goodsVo.endPrice }">
			商品销售百分比：<input type="text" name="startSales" value="${goodsVo.startSales }">--<input type="text" name="endSales" value="${goodsVo.endSales }">
			排序：<select name="orderColumn">
					<option value="price" ${goodsVo.orderColumn=="price"?"selected":"" }>价格</option>
					<option value="sales" ${goodsVo.orderColumn=="sales"?"selected":"" }>百分比</option>
				</select>
				<select name="orderMethod">
					<option value="desc" ${goodsVo.orderColumn=="desc"?"selected":"" }>倒序</option>
					<option value="asc " ${goodsVo.orderColumn=="asc "?"selected":"" }>正序</option>
				</select>
			<button type="submit">查询</button>
		</form>
	</div>
	<table class="table table-hover">
		<tr>
			<td>商品Id</td>
			<td>商品名称</td>
			<td>商品价格</td>
			<td>商品销售比</td>
		</tr>
		<c:forEach items="${Info.list }" var="goods">
			<tr>
				<td>${goods.gid }</td>
				<td>${goods.gname }</td>
				<td>${goods.price }</td>
				<td>${goods.sales }</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="100">
				<jsp:include page="/WEB-INF/view/pages.jsp"></jsp:include>
			</td>
		</tr>
	</table>
</body>
</html>