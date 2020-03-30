<html>
    <head>
        <style>
            table, td {
                border: 0px;
                align: centre;
                text-align: centre;
                font: Regular 25px/30px Helvetica Neue;
                letter-spacing: 0;
                color: #FFFFFF;
                opacity: 1;
            }

            a {
                background: #26B99A 0% 0% no-repeat padding-box;
                border-radius: 5px;
                opacity: 1;
            }

            #find {
                width:"100%";
                background: #26B99A 0% 0% no-repeat padding-box;
                border-radius: 5px;
                opacity: 1;
            }
        </style>
    </head>
<body style="background-image: url('assets/Broker_ToiletRoll.png')">
    <form action="submit_index">
        <table style="width:100%">
            <tr><a href="login.html">Log in</a></tr>
            <tr><image src="assets/Broker_GivingSpree.png" /></tr>
            <tr><td>Community Sharing Space</td></tr>
            <tr><td><input type="radio" name="type" id="recipient" value="recipient" /><label for="recipient">Recipients</label>
                    <input type="radio" name="type" id="donor" value="donor" /><label for="donor">Donors</label></td></tr>
            <tr><td colspan="2"><input type="text" name="zip_code" id="zip_code"/></td></tr>
            <tr><td colspan="2"><input type="submit" value="Find my neighbourhood" /></td></tr>
            <tr><td><a href="create_account.html">Create an account</a></td></tr>
        </table>
     </form>
</body>
</html>
