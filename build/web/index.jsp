<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html:form action="/loginapp" method="POST">
    <h1>Login Page</h1>
    <table>
        <tr>
            <td>UserName : </td>
            <td><html:text property="username"/>
                <html:errors property="nameerr"/></td>
        </tr>
        <tr>
            <td>Password : </td>
            <td><html:password redisplay="false" property="password"/>
                <html:errors property="passerr"/></td>

        </tr>
        <tr>
            <td> </td>
            <td><html:submit property="submitBtn"/></td>
        </tr>
    </table>
        <html:errors property="existUser"/>
        <a href="signup.jsp">New User ? </a>
            
</html:form>