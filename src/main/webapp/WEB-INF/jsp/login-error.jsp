<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/header.jsp"%>
<div class="mt-5">
		<h3 class="text-center">ロックイン名またはパスワードが違いです。</h3>
		<p class="text-center">
			<a href="${pageContext.request.contextPath}/LinkControllers?action=login">ロクインページへ</a>
		</p>
	</div>
<%@include file="/common/footer.jsp"%>