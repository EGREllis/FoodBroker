var arrayOfPins = [];

function initMap() {
  var myLatLng = {lat: 36.9072, lng: 128.044};

  var map = new google.maps.Map(document.getElementById('map'), {
    zoom: 4,
    center: myLatLng
  });

  var marker = new google.maps.Marker({
    position: myLatLng,
    map: map,
    title: 'Giving Spree'
  });
  arrayOfPins.push(myLatLng);
}


