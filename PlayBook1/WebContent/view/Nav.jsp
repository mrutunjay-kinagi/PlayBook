<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<%@include file="header.jsp" %>
<div class="container">
		<div class="row">
			<div class="box">
				<div class="col-md-6">
					<div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.8s">
						<div class="align-center">
							<div class="icon">
										<i class="fa fa-pencil-square-o fa-5x"></i>
							</div>
							<p>
								<button onclick="index.obj">
									<h4>Solution								
								</button>
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-6">
					<div class="wow bounceIn" data-wow-offset="0" data-wow-delay="1.3s">
						<div class="align-center">
							<div class="icon">
								<i class="fa fa-play-circle fa-5x"></i>
							</div>
							<p>
							<button onclick="methodology.obj">
								<h4>Methodology 								
							</button>
							</p>
							
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
<!--about-->
		<div class="container">
			<div class="about">			
					<div class="row">
						<div class="recent">
							<h2><p>About us</p>
							<hr>
						</div>
					</div>				
				<div class="row">			
					<div class="row-slider">
						<div class="wow fadeInUp" data-wow-offset="0" data-wow-delay="0.2s">
							<div class="col-lg-6 mar-bot30">
								<div class="responsive-slider" data-spy="responsive-slider" data-autoplay="true">
									<div class="slides" data-group="slides">
										<ul> 	    		
											<div class="slide-bodys" data-group="slide">
												<li><img alt="" class="img-responsive" src="img/3.jpg" width="100%" height="450"/></li>
												<li><img alt="" class="img-responsive" src="img/4.jpg" width="100%" height="450"/></li>
												<li><img alt="" class="img-responsive" src="img/5.jpg" width="100%" height="450"/></li>
											</div>
										</ul>
									</div>
								</div>
							</div>
						</div>
						<div class="col-lg-6">
							<div class="wow fadeInUp" data-wow-offset="0" data-wow-delay="0.6s">
								<div class="thumnails">
								<p color="black">Capgemini India is a part of the global Capgemini Group that is one of the world's foremost providers of consulting, technology, outsourcing services and local professional services. 
The Group started operations in India in 2001 with its first office in Mumbai, and today it serves as a world-class offshore centre through its unique Rightshore Strategy to serve global customers. To read more, browse through the Offshore Business Units (OBU) page. It also services Indian markets through its Local Business Services arm. 
Capgemini in India is over 1,00,000 people strong across nine cities: Mumbai, Bangalore, Gurgaon, Noida, Gandhinagar, Hyderabad, Pune, Kolkata and Chennai - Trichy and Salem. A pioneer in the IT industry, Capgemini has over 45 years of global expertise collaborating with leading corporations and now brings its Consulting, Technology and Outsourcing experience to India. With dedicated teams to service the local market, Capgemini has strong domain experience to assist clients across the Government and Public Sector, Energy and Utilities, Manufacturing, Telecom and Financial Services sectors. Known to be one of the best places to work, Capgemini is consistently recognized with several accolades in the industry. Visit the Awards & Recognitions section for details.</p>
								</div>
							</div>
						</div>					
					</div>	
				</div>					
			</div>			
			</div>			
		</div>
<%@include file="footer.jsp" %>	
</body>
</html>