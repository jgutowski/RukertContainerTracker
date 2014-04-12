<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<%-- 
    Document   : index
    Created on : Mar 2, 2014, 7:05:00 PM
    Author     : Kasha and Jeff
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<sql:query var="result" dataSource="jdbc/rukerttracker">
        SELECT * FROM containerinventory
</sql:query> 
        
        
    
       <? <div id="indexLeftColumn">
            <div id="welcomeText">
                <p>[ Welcome Text ]</p>
        
          <!-- test to access context parameters -->
        categoryImagePath: ${initParam.categoryImagePath}
        productImagePath: ${initParam.productImagePath}
    </div>
 </div></?>

        
            <div style="height:50%;overflow:auto;">
           <table border="1">
    <!-- column headers -->
    <tr>
        <c:forEach var="columnName" items="${result.columnNames}">
            <th><c:out value="${columnName}"/></th>
        </c:forEach>
    </tr>
    <!-- column data -->
    <c:forEach var="row" items="${result.rowsByIndex}">
        <tr>
            <c:forEach var="column" items="${row}">
                <td><c:out value="${column}"/></td>
            </c:forEach>
        </tr>
    </c:forEach>
</table>
            </div>
            
           
 <div>            
            
<form action="mypage.php?searching=true" method="POST">
<input type="text" name="searchcategory" value=""/>
<input type="submit" value="Search"/>
</form>           
         
 </div> 



        
