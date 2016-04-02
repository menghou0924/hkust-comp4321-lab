<html>
<head>
</head>

<body>

<%
if(session.isNew())
{
    session.setMaxInactiveInterval(1800);
}
else
{
    if(request.getParameter("txtname")!=null)
    {
        session.setAttribute("words",request.getParameter("txtname"));
    }

    if(session.getAttribute("name")==null)
    {
        session.invalidate();
        out.println("You have not entered any words! Please refresh");
    }
    else
    {
        out.println("The words you entered are:");
        out.println("------------------------------------------------");
        out.println(session.getAttribute("name"));
    }
}

%>

</body>

</html>
