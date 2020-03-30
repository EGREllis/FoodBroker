var arrayOfPins = [];

function initMap() {
  var myLatLng = {lat: 37.7749, lng: -122.4194};

  var map = new google.maps.Map(document.getElementById('map'), {
    zoom: 13,
    center: myLatLng
  });

  var marker = new google.maps.Marker({
    position: myLatLng,
    map: map,
    title: 'Giving Spree'
  });

  var infoWindow = new google.maps.InfoWindow({
    content:"<a href='http://34.71.20.240/food/item_request.html' ><image src='http://34.71.20.240/food/assets/Broker_ToiletRollIcon.png' /></a>"
  });

  marker.addListener('click', function() {
    infoWindow.open(map, marker);
  });

  arrayOfPins.push(myLatLng);
}


