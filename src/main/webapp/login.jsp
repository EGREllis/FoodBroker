<!DOCTYPE html>
<html lang="en">
<head>
  <title>The Giving Spree</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" type="text/css" href="style.css">
  <style>
    h1 {
  margin: 0;
  padding: 0;
  font-size: 30px;
}

h2 {
  margin: 2%;
  padding: 0;
  text-align: left;
  font-size: 20px;
  
}

input[type="text"], input[type="password"] {
  border-radius: 5%;
  border: 0.4px solid grey;
  box-shadow: 8px 7px 10px -8px rgba(41,41,41,1);
}

tr.remember{
  font-size: 12px;
}

input[type="submit"] {
  background-color: rgb(64, 191, 128);
  border: none;
  border-radius: 2%;
  width: 80vw;
  height: 10vw;
  color: white;
  font-weight: bold;
  margin: 0 auto;
  
}

.footer {
  font-size: 3vw;
  text-align: center;
  text-decoration: none;
}

body {
    padding-top: 52px;
}

nav.navbar {

}
nav.navbar .navbar-header .navbar-toggle {
    border: 0;
}
nav.navbar.navbar-default .navbar-header .navbar-toggle:hover,
nav.navbar.navbar-default .navbar-header .navbar-toggle:active,
nav.navbar.navbar-default .navbar-header .navbar-toggle:focus 
{
    background-color: white;
}

.font-color__coral {
    color: rgba(255,128,134,1);
}
.font-color__green {
    color: rgba(38,185,154,1);
}

.btn__coral {
    background-color: rgba(255,128,134,1);
    color: white;
}
.btn__green {
    background-color: rgba(38,185,154,1);
    color: white;
}
/* page specific styles */
.profile.recipient-profile {
    margin-bottom: 20px;
}
.profile.recipient-profile .row {
    padding-left: 30px;
    padding-right: 40px;
    margin-bottom: 10px;
}
.profile.recipient-profile .btn-row {
    margin-top: 20px;
    margin-bottom: 20px;
}
.profile.recipient-profile .btn-row button {
    padding-left: 40px;
    padding-right: 40px;
}
.profile.profile-recipient .profile-intro {
    padding-left: 0;
    padding-right: 0;
}
.profile.recipient-profile .profile-intro .textarea{
    border: 0;
    width: 100%;
    margin-bottom: 10px;
}
.profile .profile-image img {
    width: 100%;
}

.items .row {
    padding-left: 30px;
    padding-right: 30px;
}
.items .items-title {
    margin-bottom: 10px;
}
.items .items-grid {
    display: grid;
    grid-template-columns: 1fr 1fr 1fr;
    grid-template-rows: 1fr 1fr;
    grid-column-gap: 15px;
    grid-row-gap: 15px;
    margin-bottom: 20px;
}
.items .items-grid .item-pair label{
    display: flex;
    align-items: center;
    justify-content: center;
    flex-direction: column;
}
.items .items-grid .item-pair .checkbox {
    font-align: center;
    margin-top: 20px;
    width: 20px;
    height: 20px;
    display: flex;
    align-items: center;
    justify-content: center;
    border: 2px solid;
}
.items .items-grid .item-pair input {
    display: none;
}
.items .items-grid .item-pair input+label > .checkbox > i {
    display: none;
}
.items .items-grid .item-pair input:checked+label > .checkbox > i {
   display: inline; 
}
.items .submit-row button {
    width: 100%;
    padding-top: 20px;
    padding-bottom: 20px;
}
    
  </style>
</head>
<body style="background-image: url('assets/Broker_ToiletRoll.png')">
  <img src="http://34.71.20.240/food/assets/Broker_GivingSpree.png">
  <form method="POST" action="submit_login">
        <table>
            <tr><th colspan="2"><h1>Login Account</h1></th></tr>
            <tr><td colspan="2"><h2>First name</h2></td></tr>
            <tr><td colspan="2"><input type="text" name="first_name" value="first name" /></td></tr>
            <tr><td colspan="2"><h2>Last name</h2></td></tr>
            <tr><td colspan="2"><input type="text" name="last_name" value="last name" /></td></tr>
            <tr><td colspan="2"><h2>Password</h2></td></tr>
            <tr><td colspan="2"><input type="password" name="password" value="" /></td></tr>
            <tr class="remember"><td><h3><input type="checkbox" name="remember"/>Remember password</h3></td>
            <td><h3 id="password"><a href="forgot_password.html">Forgot password?</a></h3></td></tr>
            <tr><td colspan="2"><input type="submit" value="Sign In" /></td></tr>
            <tr><td colspan="2"><h3 class="footer">Don't have an account? <a href="create_account.html"><b>Create Account</b></a></h3></td></tr>
        </table>
</body>
</html>
