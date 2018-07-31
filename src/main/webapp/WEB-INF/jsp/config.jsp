<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>Configurations</title>
</head>

<body>
    
    <ul>
        <c:forEach items="${configurations}" var="configuration">
            <li>${configuration.id}
        </c:forEach>
    </ul>

</body>
</html>