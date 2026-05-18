<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@include file="/common/header.jsp"%>
<style>
	.history-scroll {
		height: 300px;
		overflow-y: auto;
	}
</style>
<div class="container">
	<div class="row justify-content-center">
		<h5 class="text-center">健康データ履歴</h5>
		<div class="col-5 card p-2">
			<c:choose>
				<c:when test="${empty healthList}">
					<p class="text-center mb-0">登録されている健康データはありません。</p>
				</c:when>
				<c:otherwise>
					<div class="row justify-content-center">
						<div class="col-4">
							<div id="list-example" class="list-group">
								<c:forEach var="health" items="${healthList}">
									<a class="list-group-item list-group-item-action"
									   href="#list-item-${health.id}">
										${health.checkDate}
									</a>
								</c:forEach>
							</div>
						</div>
						<div class="col-5">
							<div data-bs-spy="scroll"
							     data-bs-target="#list-example"
							     data-bs-offset="0"
							     data-bs-smooth-scroll="true"
							     class="history-scroll"
							     tabindex="0">
								<c:forEach var="health" items="${healthList}">
									<div id="list-item-${health.id}" class="mb-4">
										<h4>${health.checkDate}</h4>
										<p>ID：${health.id}</p>
										<p>身長：${health.height} cm</p>
										<p>体重：${health.weight} kg</p>
										<p>BMI：${health.bmi}</p>
										<p>体調：${health.bodyType}</p>
										<p>メモ：${health.memo}</p>
									</div>
								</c:forEach>
							</div>
						</div>
					</div>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
</div>

<%@include file="/common/footer.jsp"%>
