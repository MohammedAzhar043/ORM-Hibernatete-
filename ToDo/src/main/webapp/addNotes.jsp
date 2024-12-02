<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Notes</title>
<%@ include file="all_js_css.jsp"%>
</head>
<body>
	<div class="container">
		<%@ include file="navbar.jsp"%>
		<h1>Please fill your note details</h1>

		<br>
		<!--  This is add form-->
		<form action="SaveNoteServlet" method="get" >
			<div class="mb-3">
				<label for="title" class="form-label">Note Title</label> <input
					required="required" type="text" class="form-control" id="title"
					name="title" aria-describedby="emailHelp"
					placeholder="Enter the title">

			</div>
			<div class="mb-3">
				<label for="content" class="form-label">Note Content</label>
				<textarea required="required" id="content" name="content"
					class="form-control" placeholder="Enter the content"
					style="height: 300px"></textarea>
			</div>
			<div class="container text-center">
				<button type="submit" class="btn btn-primary">Submit</button>

			</div>
		</form>

	</div>




</body>
</html>