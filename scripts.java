    mapboxgl.accessToken = 'pk.eyJ1IjoibWFnZ2llLWRhdmllcyIsImEiOiJjbW9jOG13Z3cwOHhhMnFwem5hdzlpdTQ5In0.mHjj1Cv4VWxIRFTlXrDECA';
    
    const map = new mapboxgl.Map({
      container: 'map-container', // container ID
      style: 'mapbox://styles/mapbox/standard', // Using the standard Mapbox style
      center: [-87.68119, 41.91091], // starting position [long, lat] in the center of my area
      zoom: 10.04, // starting zoom at a birds-eye city view
      //Noting other controls for how the map looks on launch 
                //Bearing:
                //Pitch: 
      config: { 
        // Mapbox GL JS configuration options
        basemap: {
            showPointOfInterestLabels: false,
            showRoadLabels: false,
            showAdminBoundaries: false,
            showLandmarkIconLabels: false
            }
        },
    }
    );

    // Create a default Marker and add it to the map.
    const marker_kasama = new mapboxgl.Marker()
        .setLngLat([-87.675578, 41.908166])
        .addTo(map);