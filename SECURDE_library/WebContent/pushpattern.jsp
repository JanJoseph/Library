<%@page import="model.Book"%>
<%@page import="dlsu.mvc.controller.pull.ActionController"%>
<%@page import="dlsu.mvc.model.ContactStorageUtil"%>
<%@page import="java.util.List"%>
<%@page import="dlsu.mvc.model.Contact"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
  List<Book> books = (List<Contact>)request.getAttribute(ContactStorageUtil.CONTACT_LIST);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Phone Book</title>
  <link rel="stylesheet" href="css/simple.css" type="text/css" title="Simple Style"/>
</head>
<body>

  <div class="main-container">
  <form method="get" name="CREATE_FORM">
    <div class="section input-form">
      <div class="section-header">Create a contact:</div>
      <div class="input-row">
        <div class="input-label">
          <label for="name">Name</label>
        </div>
        <div class="input-control">
          <input type="text" id="name" name="NAME"/>
        </div>
      </div>
      <div class="input-row">
        <div class="input-label">
          <label for="number">Number</label>
        </div>
        <div class="input-control">
          <input type="text" id="number" name="NUMBER"/>
        </div>
      </div>
    </div>
    <div class="button-bar">
      <button value="CREATE" type="submit" name="ACTION" >Create</button>
    </div>
    
  </form>
  
  <% if (contacts.size() > 0) { %>
  <form method="get" name="DELETE_FORM">
    <div class="section" style="margin-top: 30px">
      <table>
        <thead>
          <tr>
            <th>Name</th>
            <th>Number</th>
            <th>Delete</th>
          </tr>
        </thead>
        <tbody>
        <%
          for (Contact currentContact: contacts) {
        %>
        <tr>
          <td><%= currentContact.getName() %></td>
          <td><%= currentContact.getNumber() %></td>
          <td><input type="checkbox" name="ID" value="<%= currentContact.getIdAsString() %>"/></td>
        </tr>
        <%
          }
        %>
        </tbody>
      </table>
    </div>
    <div class="button-bar">
      <button value="DELETE" type="submit" name="ACTION" >Delete</button>
    </div>
  </form>
  <% } %>
  </div>

</body>
</html>