<!DOCTYPE html>
<html lang="en">

<head>
	<title>Event management</title>
	<!-- Meta tags -->
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<script type="application/x-javascript">
		addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); }
	</script>
	<!-- Meta tags -->
	<link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all" />
	<!-- //pop-ups-->
	<!-- Calendar -->
<link rel="stylesheet" href="css/jquery-ui.css" />
<!-- //Calendar -->

	<!-- font-awesome icons -->
	<link rel="stylesheet" href="css/font-awesome.min.css" />
	<!-- //font-awesome icons -->
	<!--stylesheets-->
	<link href="css/style.css" rel='stylesheet' type='text/css' media="all">
	<!--//style sheet end here-->
	<link href="//fonts.googleapis.com/css?family=Cuprum:400,700" rel="stylesheet">
	<link href="//fonts.googleapis.com/css?family=Pacifico" rel="stylesheet">
</head>

<body>
	<h1 class="header-w3ls">
		Event Management</h1>
	<div class="icon-stu">
	
		<h2 class="student-w3l">Login And Register Form</h2>
		<div class="stude-user-wls">
			<span class="fa fa-user" aria-hidden="true"></span>
			<div class="clear"> </div>
		</div>
		<div class="row-col">
			<div class="banner-agileits-btm">
				<div class="w3layouts_more-buttn">
					<a href="#small-dialog1 " class="play-icon popup-with-zoom-anim">login</a>
				</div>
				<div id="small-dialog1" class="mfp-hide w3ls_small_dialog wthree_pop">
					<div class="agileits_modal_body">

						<!--login form-->
						<div class="newsletter ">
							<h2>Login Form</h2>

							<div class="letter-w3ls">
								<form action="web/index.jsp" method="post">

									<div class="form-left-w3l">

										<input type="text" class="top-up" name="name" placeholder="Name" required="">
									</div>
									<div class="form-right-w3ls ">

										<input type="password" name="password" placeholder="Password" required="">

									</div>

									<div class="form-left-w3l">
										<select class="form-control buttom">
												<option value="">
												LOGIN AS</option>
													<option value="vendor">Vendor</option>
													<option value="user">User</option>
													<option value="caterer">Caterer</option>
				
												</select>
									</div>
									
									<div class="btnn">
										<button type="submit">LOGIN</button><br>
									</div>
								</form>


								<div class="clear"></div>
							</div>
							<!--//login form-->

						</div>
					</div>
                  </div>
				</div>
				<div class="banner-its-btm">

					<div class="outs_more-buttn">
						<a href="#small-dialog2 " class="play-icon popup-with-zoom-anim">Register</a>
					</div>
					<div id="small-dialog2" class="mfp-hide w3ls_small_dialog wthree_pop">
						<div class="agileits_modal_body">

							<!--register form-->
							<div class="student-reg-w3 ">
								<h3>Register Form</h3>
								<div class="letter-w3ls">

									<form action="web/index.jsp" method="post">
										<div class="main">
											<div class="form-left-to-w3l">

												<input type="text" name="name" placeholder="Name" required="">
												<div class="clear"></div>
											</div>
											<div class="form-right-to-w3ls">

												<input type="text" name="last name" placeholder="Last Name" required="">
												  <div class="clear"></div>
											</div>
											<div class="form-left-w3l">

										<input type="text" class="top-up" name="name" placeholder="Username" required="">
									</div>
                                             
										</div>
							
								<div class="main">
									<div class="form-left-to-w3l">

										<input type="email" name="email" placeholder="Email" required="">
										  <div class="clear"></div>
									</div>
									<div class="form-right-to-w3ls">

										<input type="text" name="phone number" placeholder="Phone Number" required="">
										  <div class="clear"></div>
									</div>
								</div>
								<div class="main">

	 	<div class="form-left-to-w3l">
					<select class="form-control">
					<option value="">Gender</option>
						<option>Male</option>
						<option>Female</option>
					</select>
			</div>
					   <div class="form-right-to-w3ls">
     <input  id="datepicker1" name="text" type="text" placeholder="Date of Birth" required="">
	  <div class="clearfix"></div>
	 </div>
			</div>


								<div class="form-add-to-w3ls add">

									<input type="text" name="address" placeholder="Street Address" required="">
									  <div class="clear"></div>
								</div>


								<div class="main">
									<div class="form-left-to-w3l">

										<input type="text" name="city" placeholder="City" required="">
										<div class="clear"></div>
									</div>
									<div class="form-right-to-w3ls">
										<input type="text" name="state" placeholder="State" required="">
										<div class="clear"></div>
									</div>
									 
								</div>
								<div class="main">
									<div class="form-left-to-w3l">
										<input type="text" name="Pin code" placeholder="Pin code" required="">
										<div class="clear"></div>
									</div>
									<div class="form-right-to-w3ls">
										<select class="form-control buttom">
												<option value="">
												Select Country</option>
													<option value="category2">Oman</option>
													<option value="category1">Australia</option>
													<option value="category3">America</option>
													<option value="category3">London</option>
													<option value="category3">Goa</option>
													<option value="category3">Canada</option>
													<option value="category3">Srilanka</option>
												</select>
										
	                                   <div class="clear"></div>
									</div>
								
								</div>
								<div class="form-right-to-w3ls">
										<select class="form-control buttom">
												<option value="">
												LOGIN AS</option>
													<option value="vendor">Vendor</option>
													<option value="user">User</option>
													<option value="caterer">Caterer</option>
				
												</select>
										
	                                   <div class="clear"></div>
									</div>
								<div class="form-right-w3ls ">

										<input type="password" name="password" placeholder="Password" required="">

									</div>
								<div class="btnn">
									<button type="submit">Submit</button><br>
								</div>

								</form>
							</div>
						</div>
						<!--//register form-->

					</div>
				</div>
				<div class="clear"> </div>
			</div>
			</div>
			</div>
			<div class="copy">
				<p> Design by <a href="" target="_blank">Krupali</a></p>
			</div>

			<script type='text/javascript' src='js/jquery-2.2.3.min.js'></script>

			<!--scripts-->

			<!--//scripts-->
			<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
			<script>
				$(document).ready(function () {
					$('.popup-with-zoom-anim').magnificPopup({
						type: 'inline',
						fixedContentPos: false,
						fixedBgPos: true,
						overflowY: 'auto',
						closeBtnInside: true,
						preloader: false,
						midClick: true,
						removalDelay: 300,
						mainClass: 'my-mfp-zoom-in'
					});

				});
			</script>
			<!-- //pop-up-box video -->
			<!-- //js -->
			<!-- Calendar -->
				<script src="js/jquery-ui.js"></script>
				  <script>
						  $(function() {
							$( "#datepicker,#datepicker1,#datepicker2,#datepicker3" ).datepicker();
						  });
				  </script>
			<!-- //Calendar -->

 </body>
</html>
