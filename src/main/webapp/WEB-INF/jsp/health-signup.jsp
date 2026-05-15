<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/header-login.jsp" %>
<div class="container mt-4 pb-1">
	<h3 class="text-center">アカウント登録</h3>
	<div class="row justify-content-center">
		<div class="col-4 card p-2">
			<form class="px-4" action="${pageContext.request.contextPath}/servlet/SignUp.action" method="post">
  				<div class="mb-3">
    				<label for="name" class="form-label">アカウント名前</label>
    				<input type="text" class="form-control" name="new_name">
  				</div>
  				<div class="mb-3">	
    				<label for="password" class="form-label">新しいパスワード</label>
    				<input type="password" class="form-control" name="new_password">
  				</div>
  				<div class="row justify-content-center">
  					<button type="submit" class="col-4 btn btn-primary" value="登録">登録</button>
  				</div>
			</form>
		</div>
	</div>
</div>

<%@include file="/common/footer.jsp"%>