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

    // create the popup
    const popup_kasama = new mapboxgl.Popup({ offset: 25 }).setText(
        'Michelin-starred Filipino restaurant'
    );

    const markerColor = 'red'; // Set the marker color to red
    const markerScale = 0.8; // Adjust the scale of the markers
    const markerCursor = 'pointer'; // Change cursor to pointer on hover

    // Create a default Marker and add it to the map.
    const marker_kasama = new mapboxgl.Marker({
        color: markerColor,
        scale: markerScale,
        cursor: markerCursor
    })
        .setLngLat([-87.675578, 41.908166])
        .setPopup(popup_kasama)
        .addTo(map);

    const marker_loaf = new mapboxgl.Marker({
        color: markerColor,
        scale: markerScale,
        cursor: markerCursor
    })
        .setLngLat([-87.716933, 41.934617])
        .addTo(map);