<%@page import="com.entitiies.Note"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%@ include file="all_js_css.jsp"%>
</head>
<body>

	<div class="container">
		<%@ include file="navbar.jsp"%>
		<h1>This is edit page</h1>

		<%
		int noteId = Integer.parseInt(request.getParameter("note_id"));
		Session s = FactoryProvider.getFactory().openSession();
		Note note = (Note) s.get(Note.class, noteId);
		%>
		
		<!--  This is add form-->
		<form action="UpdateServlet" method="get">
			<div class="mb-3">
				<label for="title" class="form-label">Note Title</label> <input
					required="required" type="text" class="form-control" id="title"
					name="title" aria-describedby="emailHelp"
					placeholder="Enter the title" value="<%=note.getTitle()%>">

			</div>
			<div class="mb-3">
				<label for="content" class="form-label">Note Content</label>
				<textarea required="required" id="content" name="content"
					class="form-control" placeholder="Enter the content"
					style="height: 300px;"><%=note.getContent() %></textarea>
			</div>
			<div class="container text-center">
				<button type="submit" class="btn btn-success">save your note</button>

			</div>
			<input value=<%=note.getId()%> name="noteId" type="hidden">
		</form>
	</div>

</body>
</html>