<html>
    <head>
        <style>
            table, tr, td, h1, h2, h3, h4 {
                width:100%
                font-family:Helvetica Neue;
            }

            .in {
                width:100%;
            }

            #submit {
                width:100%;
                background-color: #26B99A;
            }
        </style>
        <script>
            function clear(id) {
                alert(id);
                var ele = document.getElementById(id);
                ele.value = "";
            }
        </script>
    </head>
    <body>
        <form method="POST" action="submit_new_account">
        <table style="align:centre;">
            <tr><h1>Create Account</h1></tr>
            <tr><td colspan="6"><h2>Your Name:</h2></td></tr>
            <tr><td colspan="3"><input class="in" type="text" id="first_name" name="first_name" value="First Name" onfocus="clear(this.id)" onclick="clear(this.id)" /></td>
                <td colspan="3"><input class="in" type="text" id="last_name" name="last_name" value="Last Name" onfocus="clear(this.id)" /></td></tr>
            <tr><td colspan="6"><h2>Address:</h2></td></tr>
            <tr><td colspan="6"><input class="in" type="text" id="address_1" name="address_1" value="first line of address" onfocus="clear(this.id)" /></tr>
            <tr><td colspan="6"><input class="in" type="text" id="address_2" name="address_2" value="second line of address" onfocus="clear(this.id)" /></td></tr>
            <tr><td colspan="6"><input class="in" type="text" id="city" name="city" value="city" onfocus="clear(this.id)" /></td></tr>
            <tr><td colspan="6"><input class="in" type="text" id="state" name="state" value="state/county" onfocus="clear(this.id)" /></td></tr>
            <tr><td colspan="6"><input class="in" type="text" id="county" name="county" value="county" onfocus="clear(this.id)" /></td></tr>
            <tr><td colspan="6"><input class="in" type="text" id="country" name="country" value="country" onfocus="clear(this.id)" /></td></tr>
            <tr><td colspan="6"><h2>Birthday:</h2></td></tr>
            <tr><td colspan="2"><input class="in" type="text" id="dbo_day" name="dbo_day" value="Day" onfocus="clear(this.id)" /></td>
                <td colspan="2"><input class="in" type="text" id="dbo_month" name="dbo_month" value="Month" onfocus="clear(this.id)" /></td>
                <td colspan="2"><input class="in" type="text" id="dbo_year" name="dbo_year" value="Year" onfocus="clear(this.id)" /></td></tr>
            <tr><td colspan="6"><h2>Password:</h2></td></tr>
            <tr><td colspan="6"><input class="in" type="password" name="password" value="" /></td></tr>
            <tr><td colspan="6"><h2>Confirm password:</h2></td></tr>
            <tr><td colspan="6"><input class="in" type="password" name="confirm" value="" /></td></tr>
            <tr><td colspan="6"><h3><input class="in" type="checkbox" name="terms" value="false" />Agree with <a href="terms.html">Terms & Conditions</a></h3></td></tr>
            <tr><td colspan="6"><input class="in" type="submit" name="submit" id="submit" value="Create Account" /></td></tr>
            <tr><td colspan="6"><h3>Already have an account? <a href="login.html">Login to Account</a></h3></td></tr>
        </table>
        </form>
    </body>
</html>