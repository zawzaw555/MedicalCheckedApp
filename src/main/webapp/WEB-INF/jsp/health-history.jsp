<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@include file="/common/header.jsp"%>
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
						<div class="col-9">
							<div class="list-group text-center">
								<c:forEach var="health" items="${healthList}">
									<a href="${pageContext.request.contextPath}/servlet/HealthDetail.action?id=${health.id}"
									   class="list-group-item list-group-item-action">
										${health.checkDate}：${health.bodyType}
									</a>
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
