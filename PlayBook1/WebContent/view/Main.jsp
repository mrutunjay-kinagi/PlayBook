<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<<<<<<< HEAD
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<style>
  /* Full-width input fields */
input[type=text], input[type=password] {
    width: 40%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

/* Set a style for all buttons */
button {
    background-color: #50c0e9;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 15%;
}

button:hover {
    opacity: 0.8;
}

/* Extra styles for the cancel button */
.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #50c0e9;
}

/* Center the image and position the close button */
.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
    position: relative;
}

img.avatar {
    width: 40%;
    border-radius: 50%;
}

.container {
    padding: 16px;
}

span.psw {
    float: right;
    padding-top: 16px;
}
  /* The Modal (background) */
.modal {
    display: none; /* Hidden by default */
    position: fixed; /* Stay in place */
    z-index: 1; /* Sit on top */
    left: 0;
    top: 0;
    top: 0;
    width: auto; /* Full width */
    height: auto; /* Full height */
    
    background-color: rgb(0,0,0); /* Fallback color */
    background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
    padding-top: 60px;
}

/* Modal Content/Box */
.modal-content {
    background-color: #fefefe;
    margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
    border: 1px solid #888;
    width: 85%; /* Could be more or less, depending on screen size */
}
  </style>
  <body background-color="#eee">
<%@include file="header.jsp" %>
<div class="container">
		<div class="row">
			<div class="box">
				<div class="col-md-6">
					<div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.8s">
						<div class="align-center">
							<div class="icon">
										<i class="fa fa-hand-o-right fa-5x"></i>
							</div>
							<p>
								<button onclick="document.getElementById('id01').style.display='block'" style="width:auto;">
									<h4>Create new Profile. 								
								</button>
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-6">
					<div class="wow bounceIn" data-wow-offset="0" data-wow-delay="1.3s">
						<div class="align-center">
							<div class="icon">
								<i class="fa fa-tasks fa-5x"></i>
							</div>
							<p>
							<button onclick="document.getElementById('id02').style.display='block'" style="width:auto;">
												<h4>Load existing profile. 								
							</button>
							</p>
							
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End -->
			<div id="id01" class="modal">
							  <form class="modal-content animate" action="index.obj" align="center">
								<div class="imgcontainer">
								  <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal"></span> 
								</div>
								<div class="container">
								  <p><label><b>Company Name</b></label></p>
								  <input type="text" placeholder="Enter Username" name="uname" required>
									  <p><button type="submit" class="cancelbtn"><b>Start</button>
									</div>
									<div class="container" style="background-color:#f1f1f1">
									  <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn" align="center"><b>Cancel</button>
									 </div>
								  </form>
								</div>
							 

			<div id="id02" class="modal">
  
							  <form class="modal-content animate" action="submit.obj" align="center">
								<div class="imgcontainer">
								  <span onclick="document.getElementById('id02').style.display='none'" class="close" title="Close Modal"></span>
								</div>
								<div class="container">
								  <p><label><b>Company Name</b></label>
								  <input type="text" placeholder="Enter Username" name="uname" required>
									
									  <p><button type="button" class="cancelbtn"><b>Load</button>
									</div>
									<div class="container" style="background-color:#f1f1f1" >
									  <button type="button" onclick="document.getElementById('id02').style.display='none'" class="cancelbtn" align="center"><b>Cancel</button>
									 </div>
								  </form>
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