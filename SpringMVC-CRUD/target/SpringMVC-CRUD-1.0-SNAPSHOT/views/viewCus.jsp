<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Customers List</h1>
<table border="2" width="70%" cellpadding="2">
    <tr>
        <th>ID</th>
        <th>Full Name</th>
        <th>Last Name</th>
        <th>First Name</th>
        <th>Phone</th>
        <th>Address line 1</th>
        <th>Address line 2</th>
        <th>City</th>
        <th>State</th>
        <th>Postal Code</th>
        <th>Country</th>
        <th>Refer EMP</th>
        <th>Credit Limit</th>
        <th>Birthday</th>
<%--        <th>ProfilePhoto</th>--%>
<%--        <th>Action</th>--%>
    </tr>
    <c:forEach var="cus" items="${listCus}">
        <tr>
            <td>${cust.customerNumber}</td>
            <td>${cust.customerName}</td>
            <td>${cus.customerName}</td>
            <td>${cus.contactLastName}</td>
            <td>${cus.contactFirstName}</td>
            <td>${cus.addressLine1}</td>
            <td>${cus.addressLine2}</td>
            <td>${cus.state}</td>
            <td>${cus.postalCode}</td>
            <td>${cus.country}</td>
            <td>${cus.salesRepEmployeeNumber}</td>
            <td>${cus.creditLimit}</td>
            <td>${cus.birthday}</td>
        </tr>
    </c:forEach>
</table>
