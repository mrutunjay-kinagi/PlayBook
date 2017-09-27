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
									<h2><b>Portal</h2>					
									<div class="icon">
										<i class="fa fa-spinner fa-3x"></i>
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
						<form action="fn11_2.obj">
						<p ><input name="fn1" type="radio" value="103" required><b style="font-size:30px">&nbsp;&nbsp;GW Portal</input>
						<p><input name="fn2" type="radio" value="104" required><b style="font-size:30px">&nbsp;&nbsp;SalesForce Portal</input>
						<p><input name="fn3" type="radio" value="105" required><b style="font-size:30px">&nbsp;&nbsp;Bespoke Portal</input>
						<a ><p align="center"><input type="submit" value="Continue" id="checkBtn"  class="btn btn-primary"><br/>
				</form>
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