<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/header.jsp"%>
<div class="container">
	<div class="row text-center mt-5">
		<h5>健康アプリへようこそ</h5>
		<p class="justify-align-center my-3">
			<a href="${pageContext.request.contextPath}/LinkControllers?action=login">ロクイン</a>
		</p>
		<p class="justify-align-center my-3">
			<a href="${pageContext.request.contextPath}/LinkControllers?action=signup">新規登録</a>
		</p>
	</div>
</div>
<%@include file="/common/footer.jsp"%>