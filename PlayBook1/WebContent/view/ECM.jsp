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
									<h2><b>ECM</h2>					
									<div class="icon">
										<i class="fa fa-book fa-3x"></i>
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
						<br/><form action="fun_ecm.obj">
						<p ><input name="fn1" type="radio" value="122" required><b style="font-size:30px">&nbsp;&nbsp;Documentum</input>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="fn7" type="radio" value="128" required><b style="font-size:30px">&nbsp;&nbsp;OEM</input>
						<p><input name="fn2" type="radio" value="123" required><b style="font-size:30px">&nbsp;&nbsp;Filenet</input>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="fn5" type="radio" value="126" required><b style="font-size:30px">&nbsp;&nbsp;OpenText Exstream</input>
						<p><input name="fn3" type="radio" value="124" required><b style="font-size:30px">&nbsp;&nbsp;Thunderhead</input>
						<p ><input name="fn4" type="radio" value="125" required><b style="font-size:30px">&nbsp;&nbsp;HP Exstream</input>
						<p><input name="fn6" type="radio" value="127" required><b style="font-size:30px">&nbsp;&nbsp;OnBase</input>
						<p align="center"><input type="submit" value="Continue" id="checkBtn"  class="btn btn-primary"><br/>
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