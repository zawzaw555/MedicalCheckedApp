<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@include file="/common/header.jsp"%>
<div class="container">
	<div class="row justify-content-center">
		<h5 class="text-center">健康診断履歴</h5>
		<div class="col-4 card p-2 m-2">
			<c:choose>
				<c:when test="${empty health}">
					<p class="text-center mb-0">健康データが見つかりません。</p>
				</c:when>
				<c:otherwise>
					<h5 class="text-center">健康データ</h5>
					<p class="text-center">日付: ${health.checkDate}</p>
					<p class="text-center">体調: ${health.bodyType}</p>
					<p class="text-center">身長: ${health.height} cm</p>
					<p class="text-center">体重: ${health.weight} kg</p>
					<p class="text-center">BMI: ${health.bmi}</p>
					<p class="text-center">メモ: ${health.memo}</p>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
</div>

<%@include file="/common/footer.jsp"%>
