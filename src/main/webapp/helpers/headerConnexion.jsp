<%@ taglib prefix="s" uri="/struts-tags"%>

<s:if test="#session.customerConnected == null">
<!--  No User Connected -->
<div class="container-fluid">
	<div class="row">
		<div class="headerConnexion">
			<div style="float: left;"> 
				<button onclick="window.location.href='/spring/pages/index.jsp'">HOME</button>
			</div>
			<div style="float: right;">
				<button onclick="window.location.href='/spring/pages/editCustomer.jsp'">Sign up</button>
				<button onclick="window.location.href='/spring/pages/connectCustomer.jsp'">Sign in</button>
			</div>
		</div>
	</div>
</div>
</s:if>

<s:if test="#session.customerConnected != null">
<!--  User connected -->
<div class="container-fluid">
	<div class="row">
		<div class="headerConnexion">
			<div style="float: left;"> 
				<button onclick="window.location.href='/spring/pages/index.jsp'">HOME</button>
			</div>
			<div style="float: right;">
				<button onclick="window.location.href='/spring/pages/clearConnexion'">Log out</button>
				<button onclick="window.location.href='/spring/editCustomerAction.action'">Modify Profile</button>
				<button onclick="window.location.href='/spring/listProjetAction'">See Teams</button>
				<button onclick="window.location.href='/spring/listProjetAction'">See Projects</button>
				<p>Welcome<s:property value="#session.customerConnected.getUsername()"/></p>
				</div>
		</div>
	</div>
</div>

</s:if>
