<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>


<%-- 
    Document   : category
    Created on : Mar 2, 2014, 7:21:04 PM
    Author     : Kasha and Jeff
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<sql:query var="categories" dataSource="jdbc/rukerttracker">
    SELECT * FROM containerinventory
</sql:query>

    <div id="categoryLeftColumn">

    <c:forEach var="category" items="${categories.rows}">

        <c:choose>
            <c:when test="${category.id == pageContext.request.queryString}">
                <div class="categoryButton" id="selectedCategory">
                    <span class="categoryText">
                        ${category.name}
                    </span>
                </div>
            </c:when>
            <c:otherwise>
                <a href="category?${category.id}" class="categoryButton">
                    <div class="categoryText">
                        ${category.name}
                    </div>
                </a>
            </c:otherwise>
        </c:choose>

    </c:forEach>

</div>
    
