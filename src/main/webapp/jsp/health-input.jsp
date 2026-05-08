<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/header.jsp"%>
<div class="container">
	<div class="row justify-content-center">
		<h5 class="text-center">健康データ登力</h5>
		<div class="col-4 card p-2 m-2">
			<form class="row g-3  pt-3 align-items-center" action="#" method="post">
  				<div class="col-auto">
    				<label for="inputPassword6" class="col-form-label">身長: </label>
  				</div>
  				<div class="col-auto">
    				<input type="number" class="form-control" min="0" name="height">
  				</div>
  				<div class="col-auto">
    				<span id="passwordHelpInline" class="form-text"> cm</span>
  				</div>
  				
  				<div class="col-auto">
    				<label for="inputPassword6" class="col-form-label">体重: </label>
  				</div>
  				<div class="col-auto">
    				<input type="number" class="form-control" min="0" name="weight">
  				</div>
  				<div class="col-auto">
    				<span id="passwordHelpInline" class="form-text"> kg</span>
  				</div>
  				
  				<div class="col-auto">
    				<label for="inputPassword6" class="col-form-label">血圧: </label>
  				</div>
  				<div class="col-auto">
    				<input type="number" class="form-control" min="0" name="pressure">
  				</div>
  				
  				<div class="col-auto">
    				<label for="inputPassword6" class="col-form-label">日付: </label>
  				</div>
  				<div class="col-auto">
    				<input type="date" class="form-control" name="date">
  				</div>
  				
  				<div class="col-12 mb-2">
    				<label for="memo" class="col-form-label">メモ: </label>
    				<textarea class="form-control" name="memo" id="memo" rows="4"></textarea>
				</div>
  				<div class="row justify-content-center">
  					<button type="submit" class="col-4 btn btn-primary" value="登力">登録</button>
  				</div>
			</form>
		</div>
	</div>
</div>

<%@include file="/common/footer.jsp"%>