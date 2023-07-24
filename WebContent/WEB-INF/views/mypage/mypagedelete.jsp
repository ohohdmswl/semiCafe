<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp" %>

<script type="text/javascript">
$(document).ready(function() {
	
	//취소버튼 동작
	$("#btnCancel").click(function() {
		history.go(-1);
	});
	
});

</script>

<div id="content" class="container">


<h1 style="text-align: center;">회원탈퇴</h1>
<hr>
<form action="/mypage/mypagedelete" method="post">
<h3 style="text-align: center;">회원탈퇴를 진행하시겠습니까?</h3><br><br>


<div style="text-align: center;"><label>비밀 번호 &nbsp&nbsp<input type="text" name = "user_pw"> </label></div>


<br><br>
<div style="text-align: center;">
<%-- 	<button id = "btnList" onclick="location.href='<%=request.getContextPath() %>/mypage/mypagedelete'">회원 탈퇴</button> --%>
	<button id = "btnList" type="submit" class="btn btn-default">회원 탈퇴</button>
	<button id="btnCancel" class="btn btn-default">취소</button>
</div>
</form>


<br><br><br><br><br><br><br><br><br><br><br><br>
</div><!-- .container -->

<%@ include file="../layout/footer.jsp" %>
