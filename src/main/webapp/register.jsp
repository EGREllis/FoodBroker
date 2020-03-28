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
                <tr><td>Photo:</td><td><input type="file" name="profile_pic" id="profile_pic" /></td></tr>
                <tr><td rowspan="2'"><input type="submit" value="Join us!" /></td></tr>
            </table>
        </form>
    </body>
</html>