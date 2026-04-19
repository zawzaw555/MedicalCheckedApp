<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/header.html" %>

<div class="container pb-1">
	<h3 class="text-center">健康診管理アプリ</h3>
	<div class="row justify-content-center">
		<div class="col-4 card p-2">
			<form class="px-4" action="#" method="post">
  				<div class="mb-3">
    				<label for="login_id" class="form-label">ロックインID</label>
    				<input type="text" class="form-control" id="login_id">
  				</div>
  				<div class="mb-3">
    				<label for="name" class="form-label">名前</label>
    				<input type="text" class="form-control" id="name">
  				</div>
  				<div class="mb-3">	
    				<label for="password" class="form-label">パスワード</label>
    				<input type="password" class="form-control" id="password">
  				</div>
  				<div class="row justify-content-center">
  					<button type="submit" class="col-4 btn btn-primary">Submit</button>
  				</div>
			</form>
		</div>
	</div>
</div>

<%@include file="/common/footer.html" %>