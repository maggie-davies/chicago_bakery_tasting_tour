mapboxgl.accessToken = 'pk.eyJ1IjoibWFnZ2llLWRhdmllcyIsImEiOiJjbW9jOG13Z3cwOHhhMnFwem5hdzlpdTQ5In0.mHjj1Cv4VWxIRFTlXrDECA';
    
    const map = new mapboxgl.Map({
      container: 'map-container', // container ID
      style: 'mapbox://styles/mapbox/standard', // Using the standard Mapbox style
      center: [-87.68119, 41.91091], // starting position [long, lat] in the center of my area
      zoom: 11, // starting zoom at a birds-eye city view
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

    const bakerymap = [
        {
  "type": "FeatureCollection",
  "features": [
    {
      "type": "Feature",
      "geometry": {
        "type": "Point",
        "coordinates": [
          -87.675578,
          41.899699
        ]
      },
      "properties": {
        "Name": "Kasama",
        "Blurb": "Michelin-starred Filipino restaurant",
        "Highlights": "Mango tart; Cardamom Bun",
        "Neighborhood": "Wicker Park"
      }
    },
    {
      "type": "Feature",
      "geometry": {
        "type": "Point",
        "coordinates": [
          -87.716933,
          41.934617
        ]
      },
      "properties": {
        "Name": "Loaf Lounge",
        "Blurb": null,
        "Highlights": "Chocolate Cake",
        "Neighborhood": "Logan Square"
      }
    },
    {
      "type": "Feature",
      "geometry": {
        "type": "Point",
        "coordinates": [
          -87.707542,
          41.910429
        ]
      },
      "properties": {
        "Name": "Roeser's Bakery",
        "Blurb": "Locally famous bakery, Chicago's oldest family-owned",
        "Highlights": "Paczki (Polish Donuts), cakes",
        "Neighborhood": "Humboldt Park"
      }
    },
    {
      "type": "Feature",
      "geometry": {
        "type": "Point",
        "coordinates": [
          -87.63166,
          41.851384
        ]
      },
      "properties": {
        "Name": "Chiu Quon Bakery",
        "Blurb": "Chinatown's oldest bakery",
        "Highlights": "Pork buns, sponge cakes, sesame balls, egg tart",
        "Neighborhood": "Chinatown"
      }
    },
    {
      "type": "Feature",
      "geometry": {
        "type": "Point",
        "coordinates": [
          -87.717733,
          41.928425
        ]
      },
      "properties": {
        "Name": "Sugar Moon Bakery",
        "Blurb": "Always a line, open Fri-Sun, sells out by 1 pm",
        "Highlights": "Cloud cookies, scone, cake",
        "Neighborhood": "Logan Square"
      }
    },
    {
      "type": "Feature",
      "geometry": {
        "type": "Point",
        "coordinates": [
          -87.678092,
          41.911087
        ]
      },
      "properties": {
        "Name": "Mindy's Bakery",
        "Blurb": "James Beard-awarded pastry chef",
        "Highlights": null,
        "Neighborhood": "Wicker Park"
      }
    },
    {
      "type": "Feature",
      "geometry": {
        "type": "Point",
        "coordinates": [
          -87.659205,
          41.92184
        ]
      },
      "properties": {
        "Name": "Floriole Caf\u00e9 & Bakery",
        "Blurb": "French pastries with local ingredients -- Top 10 Bakery in the US",
        "Highlights": null,
        "Neighborhood": "Lincoln Park"
      }
    },
    {
      "type": "Feature",
      "geometry": {
        "type": "Point",
        "coordinates": [
          -87.617113,
          41.758563
        ]
      },
      "properties": {
        "Name": "Brown Sugar Bakery",
        "Blurb": null,
        "Highlights": "Southern-style sweet cakes, pies, cakes, cupcakes",
        "Neighborhood": "Grand Crossing"
      }
    },
    {
      "type": "Feature",
      "geometry": {
        "type": "Point",
        "coordinates": [
          -87.697014,
          41.919089
        ]
      },
      "properties": {
        "Name": "Bang Bang Pie",
        "Blurb": "American-style pies",
        "Highlights": "Pies",
        "Neighborhood": "Logan Square"
      }
    },
    {
      "type": "Feature",
      "geometry": {
        "type": "Point",
        "coordinates": [
          -87.655637,
          41.891306
        ]
      }
    