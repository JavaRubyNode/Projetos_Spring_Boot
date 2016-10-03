GMaps.geolocate({
  success: function(position) {
    map.setCenter(position.coords.latitude, position.coords.longitude);
  },
  error: function(error) {
    alert('Localização não encontrada: '+error.message);
  },
  not_supported: function() {
    alert("Seu Browser não suporta Geo-Localização");
  },
  always: function() {
    alert("Encontrado sua Localização");
  }
});