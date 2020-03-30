<!DOCTYPE html>
<html>
  <head>
    <title>Simple Map</title>
    <meta name="viewport" content="initial-scale=1.0">
    <meta charset="utf-8">
    <style>
      /* Always set the map height explicitly to define the size of the div
       * element that contains the map. */
      #map {
        height: 100%;
      }
      /* Optional: Makes the sample page fill the window. */
      html, body {
        height: 100%;
        margin: 0;
        padding: 0;
      }
    </style>
  </head>
  <body>
    <div id="map"></div>
    <script>
      var sanFran = {lat: 37.7749, lng: -122.4194}
      var options = {
        center: sanFran,
        zoom: 12
      };

      var map;
      var marker;

      function initMap() {
        map = new google.maps.Map(document.getElementById('map'), options);
        /*
        marker = new google.maps.Map({
            position:{lat: 37.7700, lng: -122.4100},
            map:map
        });
        */
      }

    </script>
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAQ8RqSz8luJ4FUbSasJf2glRwOKMeqKCE&callback=initMap"
    async defer></script>
  </body>
</html>