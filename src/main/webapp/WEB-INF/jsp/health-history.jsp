<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/header.jsp"%>
<div class="container">
	<div class="row justify-content-center">
		<h5 class="text-center">健康データ履歴</h5>
		<div class="col-4 card p-2 m-2">
  			<div class="row">
  				<div class="col-4">
    				<div id="list-example" class="list-group">
      					<a class="list-group-item list-group-item-action" href="#list-item-1">Item 1</a>
      					<a class="list-group-item list-group-item-action" href="#list-item-2">Item 2</a>
      					<a class="list-group-item list-group-item-action" href="#list-item-3">Item 3</a>
      					<a class="list-group-item list-group-item-action" href="#list-item-4">Item 4</a>
    				</div>
  				</div>
  				<div class="col-8">
    				<div data-bs-spy="scroll" data-bs-target="#list-example" data-bs-smooth-scroll="true" class="scrollspy-example" tabindex="0">
      					<h4 id="list-item-1">Item 1</h4>
      					<p>...</p>
      					<h4 id="list-item-2">Item 2</h4>
      					<p>...</p>
      					<h4 id="list-item-3">Item 3</h4>
      					<p>...</p>
      					<h4 id="list-item-4">Item 4</h4>
      					<p>...</p>
    				</div>
  				</div>
			</div>
		</div>
	</div>
</div>

<%@include file="/common/footer.jsp"%>