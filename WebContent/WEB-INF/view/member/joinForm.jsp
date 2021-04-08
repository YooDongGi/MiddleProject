<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Learning Market : 회원가입</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/memberJoinCheck.js"></script>
<script type="text/javascript">
$(function(){ 
   var chkMemId = "";  // 중복 체크할 때의 ID가 저장될 변수
   var chkMemNic = "";
   // 중복확인 클릭
   $("#idCheck").on("click", function(){
      var memId = $("#mem_id").val();     // 입력한 회원ID 읽어오기
      
      $.ajax({
         url : "<%=request.getContextPath()%>/member/idcheck.do",
         method : "post",
         data : { "mem_id" : memId },
         dataType : "json",
         success : function(result){
            
            if(result=="OK"){  // 중복되지 않을 때
               $("#idChkResult").html("사용가능ID");
               chkMemId = memId;  // 검사가 완료된 회원ID를 전역변수에 저장
            }else{ 
               $("#idChkResult").html("ID중복 - 사용불가");
               chkMemId = "";
            }
         },
         error : function(xhr){
            alert("상태 : " + xhr.status);
         }
      });
      
   });
   
   $("#nickCheck").on("click", function(){
      var nickname = $("#nick_name").val();
      
      $.ajax({
         url : "<%=request.getContextPath()%>/member/idcheck.do",
         method : "post",
         data : { "nick_name" : nickname },
         dataType : "json",
         success : function(result){
            
            if(result=="OK"){  // 중복되지 않을 때
               $("#nickChkResult").html("사용가능");
               chkMemNic = memId;  // 검사가 완료된 회원ID를 전역변수에 저장
            }else{ 
               $("#nickChkResult").html("닉네임중복 - 사용불가");
               chkMemNic = "";
            }
         },
         error : function(xhr){
            alert("상태 : " + xhr.status);
         }
      });
   })
   
   // 가입하기버튼클릭 --> form의 submit될 때
   $("#memberForm").on("submit", function(){
      var memId = $("#mem_id").val(); 
      var idchk = $("#idChkResult").html().trim();
      
      if(chkMemId!= memId || idchk!="사용가능ID"){
         alert("ID가 중복됩니다. 새로운 ID를 입력하세요.");
         return false;  // 서버로의 전송을 취소한다.
      }
      return true;  // 서버로 전송작업을 수행한다.
   });
   
})

</script>
<style>
#wrapper {
   border: 2px solid salmon;
   border-radius: 5px;;
   width: 500px;
   height:650px;
   margin: auto;
/*    font-size:50px;  */
   font-weight: bold;
   padding-left : 20px;
}

.title {
   text-align: center;
   font-size: 40px;
   font-weight: bold;
   color: black;
   margin: 80px 0px 80px 0px;
}

label {
   width: 130px;
   display: inline-block;
   text-align: left;
   font-size: 15px;
}

input {
   margin: 3px 5px;
   border-radius: 3px;
   background-color: transparent;
   border: 1px solid darkgray;
   height: 30px;
   outline: none;
}

#signup {
   text-align: center;
   margin: 5px;
}

input[type=button], input[type=reset] {
   border: 1px solid salmon;
   border-radius: 3px;
   background-color: transparent;
   margin: 0px;
   height: 24px;
   color: salmon;
}

input[type=button]:hover, input[type=reset]:hover {
   background-color: salmon;
   transition-duration: 1s;
   color: white;
   outline: none;
}

#roadAddress, #detailAddress {
   width: 280px;
}

.regex {
   font-size: 12px;
   text-align: center;
}
</style>
</head>
<body>
 <div class="title">회원 가입 정보 입력</div>
   <form id="memberForm" action="<%=request.getContextPath()%>/member/join.do" method="post">
        <div id="wrapper"><br>   
            <label>아이디 </label><input type="text" name="mem_id" id="mem_id" required="" placeholder="아이디">
              <input type="button" id="idCheck" value="중복확인">
         	<span id="idChkResult"></span><br><br><br>
            
            <div class="id regex"></div>
            
            <label>비밀번호 </label><input type="password" name="mem_pass" id="mem_pass" required="" placeholder="비밀번호"><br>
            <div class="pw regex"></div><br><br>
            
            <label>비밀번호 확인 </label><input type="password" name="mem_pass2" id="mem_pass2" required="" placeholder="비밀번호확인"><br>
            <div class="repw regex"></div><br><br>
            
            <label>이름 </label><input type="text" name="mem_nm" id="mem_nm" required="" placeholder="이름"><br>
            <div class="name regex"></div><br><br>
            
            <label>닉네임 </label><input type="text" name="nick_name" id="nick_name" required="" placeholder="닉네임">
         <input type="button" id="nickCheck" value="중복확인">
         <span id="nickChkResult"></span><br><br><br>
         
            <label>이메일 </label><input type="email" name="mem_email" id="mem_email" required="" placeholder="이메일"><br>
            <div class="email regex"></div><br><br>
            
            <label>전화번호 </label><input type="text" name="mem_hp" id="mem_hp" required="" placeholder="전화번호"><br>
            <div class="phone regex"></div><br><br>

            <div id="signup">
           <input type="submit" name="signup" value="가입하기" id="signupbtn">
            <input type="reset" value="다시입력" id="resignupbtn">
            </div>
        </div>
</form>


</body>
</html>