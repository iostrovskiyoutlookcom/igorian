<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page session="false" %>
<html>
<head>
	<%@ include file="../tpl/header.jsp" %>
</head>
<body>
<div class="container">
<%@ include  file="../tpl/nav.jsp" %>

      <!-- Jumbotron -->
      <div class="jumbotron">
        <h2>${title}</h2>
        	<form id = "reg_form">
 				 <div class="form-group">
  					  <label for="login">Логин:</label>
  					  <input type="text" class="form-control" name = "login" id="login" placeholder="Введите логин" required>
 				  </div>
 				  <div class="form-group">
       				  <label for="pass1">Пароль:</label>
       				  <input type="password" class="form-control" name="pass1" id="pass1" placeholder="Введите пароль" required>
 				  </div>
 				  <div class="form-group">
       				  <label for="pass2">Повтор пароля:</label>
       				  <input type="password" class="form-control" name="pass2" id="pass2" placeholder="Повторите пароль" required>
 				  </div>
 				  <div class="form-group">
       				  <label for="email">E-Mail:</label>
       				  <input type="email" class="form-control" name="email" id="email" placeholder="Введите email" required>
 				  </div>
 				  <div class="form-check">
  					  <input type="checkbox" class="form-check-input" id="exampleCheck1">
   					  <label class="form-check-label" for="exampleCheck1">Запомнить меня</label>
 				  </div>
                      <input type="submit" class="btn btn-primary" value="Отправить">
                      <input type="reset" class="btn btn-primary" value="Сбросить">
			</form>
        
      </div>

<%@ include  file="../tpl/footer.jsp" %>
</div>
</body>
</html>
