<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<head>
<title>Login Success!!</title>
<script type="text/javascript">  
        function readysubmit() {  
            if (confirm("Do you want to realy query?")) {  
                document.getElementById("formid").submit();  
            }
            else {
                return false;
            }
        }
    </script>
</head>
<body><center>Login Success!!
		<form id="formid" method="post" action="QueryAllFruitServlet" >
				<button type="button" name="mainfruit" onclick="readysubmit()">queryMainFruit</button>
		</form>
</body>
</html>
