
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="html" uri="http://struts.apache.org/tags-html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Sign Up Page</h1>
        <html:form action="signUp" method="post">
            <table width="4" cellspacing="5">
                <tbody>
                    <tr>
                        <td>Username</td>
                        <td><html:text property="uname"/></td>
                    </tr>
                    <tr>
                        <td colspan="2"><html:errors property="nameerr"/></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><html:password property="upass"/></td>
                    </tr>
                    <tr>
                        <td colspan="2"><html:errors property="passerr"/></td>
                    </tr>
                    <tr>
                        <td colspan="2"><center><html:submit property="signBtn"/></center></td>
                    </tr>
                    <br>
                    <html:errors property="userexist"/>
                </tbody>
            </table>

        </html:form>
        <a href="/Struts1App/">Have a account</a>
    
    </body>
</html>
