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
        <c:forEach items = "${news }" var ="n">
        <div class = "news_box">
		    <div style="text-align: center;"><h3>${n.getTitle()}</h3></div>
			    <div style="display: flex;">
				    <div ><img id = "news_img" src="${n.getPhoto()}" alt=""></div>
						<div id = "news_annotattion">
							<div><h4>${n.getAnnotation()}</h4></div>
							<div><h5>${n.getDetails()}</h5></div>
						</div>
					</div>
					<div id = "news_footer">
					<h5>${n.getPublish()}</h5>
        			<a class = "btn-primary" href="news/details?id=${n.getId()}">Детальный просмотр &raquo;</a>					
					</div>
				</div>    	
        </c:forEach>
      </div>

<%@ include  file="../tpl/footer.jsp" %>
</div>
</body>
</html>
