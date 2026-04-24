    mapboxgl.accessToken = 'pk.eyJ1IjoibWFnZ2llLWRhdmllcyIsImEiOiJjbW9jOG13Z3cwOHhhMnFwem5hdzlpdTQ5In0.mHjj1Cv4VWxIRFTlXrDECA';
    
    const map = new mapboxgl.Map({
      container: 'map-container', // container ID
      style: 'mapbox://styles/mapbox/standard', // Using the standard Mapbox style
      config: { 
        // Mapbox GL JS configuration options
        // For example, you can set the following options:
        // - `preserveDrawingBuffer: true` to allow for exporting the map as an image
        // - `antialias: true` for smoother rendering of 3D objects
        // - `fadeDuration: 300` to control the fade-in duration of tiles
        basemap: {
      showPointOfInterestLabels: false,
      showRoadLabels: false,
      showAdminBoundaries: false,
      showLandmarkIconLabels: false
        }
    },
      },
      center: [-87.68119, 41.91091], // starting position [long, lat] in the center of my area
      zoom: 10.04 // starting zoom at a birds-eye city view
      <!-- Noting other controls for how the map looks on launch 
                Bearing:
                Pitch:  -->

    });