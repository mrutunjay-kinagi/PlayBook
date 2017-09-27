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
									<h2><b>CoreSystem</h2>					
									<div class="icon">
										<i class="fa fa-terminal fa-3x"></i>
									</div>
									<p>
									 AB    CD   EF   GD	
									</p>
								</div>
							</div>
						</div>
						<form action="fn_CoreSys.obj">
							<p ><input name="fn1" type="radio" class="checkbox2" value="106" required><b style="font-size:15px">&nbsp;&nbsp;GW PolicyCenterV8</input>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="fn6" type="checkbox" class="checkbox2" value="111"><b style="font-size:15px">&nbsp;GW BillingCenterV9</input>
							<p><input name="fn2" type="radio"  class="checkbox2" value="107" required><b style="font-size:15px">&nbsp;&nbsp;GW BillingCenterV8</input>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="fn7" type="checkbox" class="checkbox2" value="112" ><b style="font-size:15px">&nbsp;&nbsp;GW ClaimCenterV9</input>
							<p><input name="fn3" type="radio" class="checkbox2" value="108" required><b style="font-size:15px">&nbsp;&nbsp;GW ClaimCenterV8</input>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="fn8" type="checkbox" class="checkbox2" value="113" ><b style="font-size:15px">&nbsp;&nbsp;GW ContactCenterV9</input>
							<p ><input name="fn4" type="radio" class="checkbox2" value="109" required><b style="font-size:15px">&nbsp;&nbsp;GW ContactCenterV8</input>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="fn9" type="checkbox" class="checkbox2" value="114" ><b style="font-size:15px">&nbsp;&nbsp;Bespoke Policy System</input>
							<p><input name="fn5" type="radio" class="checkbox2" value="110" required><b style="font-size:15px">&nbsp;&nbsp;GW PolicyCenterV9</input>
							<a "><p align="center"><input type="submit" value="Continue" id="checkBtn"  class="btn btn-primary"><br/>
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