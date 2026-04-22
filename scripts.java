<script>
// sets the access token, associating the map with my Mapbox account and its permissions
    mapboxgl.accessToken = 'pk.eyJ1IjoibWFnZ2llLWRhdmllcyIsImEiOiJjbW5pMnkzNWowOTlkMnFwazhna2ZvZGdtIn0.sOizRPdTjcNQ5rsDklJd2Q';

// creates the map, setting the container to the id of the div I added in the html code, and setting the initial center and zoom level of the map
const map = new mapboxgl.Map({
    container: 'map', // container ID
    center: [-87.68119, 41.91091], // starting position [lng, lat] in the center of my area
    zoom: 10.04 // starting zoom at a birds-eye city view
    });
</script>