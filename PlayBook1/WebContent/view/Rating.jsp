<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<%@include file="header.jsp" %>
<div class="container">
		<div class="row">
			
				<div class="content">
						<div class="col-md-4">
							<div class="wow flipInY" data-wow-offset="0" data-wow-delay="0.4s">
								<div class="align-center">
									<h2><b>Rating</h2>					
									<div class="icon">
										<i class="fa fa-usd fa-3x"></i>
									</div>
									<p>
									 AB    CD   EF   GD	
									<br/>
									</p>
								</div>
							</div>
						</div>
						<br/>
						<br/>
						<br/>
						<br/>
						<p ><input name="BoxSelect[]" type="checkbox" value="ilog" required><b style="font-size:30px">&nbsp;&nbsp;ILOG</input>
						<p><input name="BoxSelect[]" type="checkbox" value="gwrating" required><b style="font-size:30px">&nbsp;&nbsp;GW Rating</input>
						<p><input name="BoxSelect[]" type="checkbox" value="bespokerating" required><b style="font-size:30px">&nbsp;&nbsp;Bespoke Rating</input>
						<a href="index.html"><p align="center"><input type="button" value="Continue" id="checkBtn"  class="btn btn-primary"><br/>
				</div>
			</div>	
	</div>
	<div class="container">
		<div class="row">
			<hr>
		</div>
	</div>
<%@include file="footer.jsp" %>
</body>
</html>