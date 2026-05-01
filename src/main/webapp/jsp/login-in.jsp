<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/header.html" %>
<div class="container pb-1">
	<h3 class="text-center">健康診管理アプリ</h3>
	<div class="row justify-content-center">
		<div class="col-4 card p-2">
			<form class="px-4" action="${pageContext.request.contextPath}/servlet/Login.action" method="post">
  				<div class="mb-3">
    				<label for="login" class="form-label">ログインID</label>
    				<input type="text" class="form-control" name="login">
  				</div>
  				<div class="mb-3">	
    				<label for="password" class="form-label">パスワード</label>
    				<input type="password" class="form-control" name="password">
  				</div>
  				<div class="row justify-content-center">
  					<button type="submit" class="col-4 btn btn-primary" value="ログイン">Submit</button>
  				</div>
			</form>
		</div>
	</div>
</div>

<%@include file="/common/footer.html"%>