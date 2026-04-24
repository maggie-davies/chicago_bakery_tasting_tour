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

// Create the popups for each marker with the name and description
// I started to do this via my geojson (see the scripts.experimental.js file), but I had trouble
// getting the popups to work, so I hardcoded them in here instead. I will continue working on this going forward.
// I also kept the popups simple, but would like to add tags and details for recommended food at each place, a photo, and more interactive elements in the future.
// Popup formatting completed with help from the AI chatbot, asking it to add a bolded title
const popup_kasama = new mapboxgl.Popup({ offset: 25 }).setHTML(
    '<b>Kasama</b><br>Michelin-starred Filipino restaurant'
);

const popup_loaf = new mapboxgl.Popup({ offset: 25 }).setHTML(
    '<b>Loaf Lounge</b><br>Bakery known for its chocolate cake'
);

const popup_roeser = new mapboxgl.Popup({ offset: 25 }).setHTML(
    '<b>Roeser\'s Bakery</b><br>Chicago\'s oldest family-owned bakery'
);

const popup_chiuquon = new mapboxgl.Popup({ offset: 25 }).setHTML(
    '<b>Chiu Quon Bakery</b><br>Chinatown\'s oldest bakery'
);

const popup_sugar = new mapboxgl.Popup({ offset: 25 }).setHTML(
    '<b>Sugar Bowl</b><br>Always a line, open Fri-Sun, sells out by 1 pm'
);

const popup_mindy = new mapboxgl.Popup({ offset: 25 }).setHTML(
    '<b>Mindy\'s Bakery</b><br>James Beard-awarded pastry chef'
);

const popup_floriole = new mapboxgl.Popup({ offset: 25 }).setHTML(
    '<b>Floriole Cafe & Bakery</b><br>French pastries with local ingredients -- Top 10 Bakery in the US'
);

const popup_brown = new mapboxgl.Popup({ offset: 25 }).setHTML(
    '<b>Brown Sugar Bakery</b><br>Southern-style sweet cakes, pies, cakes, and cupcakes'
);

const popup_bang = new mapboxgl.Popup({ offset: 25 }).setHTML(
    '<b>Bang Bang Pie</b><br>American-style pies'
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
    .setPopup(popup_loaf)
    .addTo(map);

const marker_roeser = new mapboxgl.Marker({
    color: markerColor,
    scale: markerScale,
    cursor: markerCursor
})
    .setLngLat([-87.707542, 41.910429])
    .setPopup(popup_roeser)
    .addTo(map);

const marker_chiuquon = new mapboxgl.Marker({
    color: markerColor,
    scale: markerScale,
    cursor: markerCursor
})
    .setLngLat([-87.63166, 41.851384])
    .setPopup(popup_chiuquon)
    .addTo(map);

const marker_sugar = new mapboxgl.Marker({
    color: markerColor,
    scale: markerScale,
    cursor: markerCursor
})
    .setLngLat([-87.717733, 41.928425])
    .setPopup(popup_sugar)
    .addTo(map);

const marker_mindy = new mapboxgl.Marker({
    color: markerColor,
    scale: markerScale,
    cursor: markerCursor
})
    .setLngLat([-87.678092, 41.911087])
    .setPopup(popup_mindy)
    .addTo(map);

const marker_floriole = new mapboxgl.Marker({
    color: markerColor,
    scale: markerScale,
    cursor: markerCursor
})
    .setLngLat([-87.659205, 41.92184])
    .setPopup(popup_floriole)
    .addTo(map);

const marker_brown = new mapboxgl.Marker({
    color: markerColor,
    scale: markerScale,
    cursor: markerCursor
})
    .setLngLat([-87.659205, 41.92184])
    .setPopup(popup_brown)
    .addTo(map);

const marker_bang = new mapboxgl.Marker({
    color: markerColor,
    scale: markerScale,
    cursor: markerCursor
})
    .setLngLat([-87.659205, 41.92184])
    .setPopup(popup_bang)
    .addTo(map);