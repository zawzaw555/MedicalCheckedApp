<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/header.jsp"%>
<div class="container">
	<div class="row justify-content-center">
		<h5 class="text-center">こんにちは、${user.login} !</h5>
		<div class="col-4 p-2 m-2">
			<select class="form-select" size="4" aria-label="Size 4 select example">
  				<option selected>Open this select menu</option>
  				<option value="1">One</option>
  				<option value="2">Two</option>
  				<option value="3">Three</option>
			</select>
		</div>
		<div class="col-4 card p-2 m-2">
			<h5 class="text-center">最近の健康データ</h5>
			<p class="text-center">身長:	170 cm</p>
			<p class="text-center">体重: 65 kg</p>
			<p class="text-center">血圧: 120 / 80</p>
			<p class="text-center">日付: 2026-05-01</p>
			<p class="text-center">メモ: 体調良い</p>
		</div>
	</div>
</div>

<%@include file="/common/footer.jsp"%>