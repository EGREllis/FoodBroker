<html>
    <head>
        <title>We would love you to join us!</title>
        <script>
            function isNotBlank(id) {
                var ele = documentGetElementById(id);
                return ele.value != "";
            }

            function validateForm() {
                return isNotBlank(first_name) && isNotBlank(last_name) && isNotBlank(profile_pic);
            }
        </script>
    </head>
    <body>
        <p>Thanks for deciding to join us!</p>
        <form action="./submit_register" method="POST" onsubmit="return validateForm()" enctype="multipart/form-data">
            <table>
                <tr><td>First name:</td><td><input type="text" name="first_name" id="first_name" /></td></tr>
                <tr><td>Last name:</td><td><input type="text" name="last_name" id="last_name" /></td></tr>
                <tr><td rowspan="2'">Address:</td></tr>
                <tr><td>First line/road:</td><td><input type="text" name="address_line_1" id="address_line_1" /></td></tr>
                <tr><td>Second line/town:</td><td><input type="text" name="address_line_2" id="address_line_2" /></td></tr>
                <tr><td>City:</td><td><input type="text" name="address_city" id="address_city" /></td></tr>
                <tr><td>County/State:</td><td><input type="text" name="address_state" id="address_state" /></td></tr>
                <tr><td>Country:</td><td><input type="text" name="address_country" id="address_country" /></td></tr>
                <tr><td>Range:</td><td><input type="text" name="range" id="range" /></td></tr>
                <tr><td>Facebook profile:</td><td><input type="text" name="facebook_profile" id="facebook_profile" /></td></tr>
                <tr><td>Photo:</td><td><input type="file" name="profile_pic" id="profile_pic" /></td></tr>
                <tr><td rowspan="2'"><input type="submit" value="Join us!" /></td></tr>
            </table>
        </form>
    </body>
</html>