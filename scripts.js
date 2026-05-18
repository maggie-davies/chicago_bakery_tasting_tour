mapboxgl.accessToken = 'pk.eyJ1IjoibWFnZ2llLWRhdmllcyIsImEiOiJjbW9jOG13Z3cwOHhhMnFwem5hdzlpdTQ5In0.mHjj1Cv4VWxIRFTlXrDECA';

const map = new mapboxgl.Map({
    container: 'map-container', // container ID
    style: 'mapbox://styles/mapbox/standard', // Using the standard Mapbox style
    center: [-87.73285, 41.89512], // starting position [long, lat] in the center of my area
    zoom: 10.27, // starting zoom at a birds-eye city view
    maxBounds: [
        [-88.35, 41.15], // southwest corner
        [-87.00, 42.30]  // northeast corner
    ],
    
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
map.on('load',() => {
map.addSource ('bakeries', {
    type: 'geojson',
    data: const_bakeries,
});

const bakeryFeatures = const_bakeries.features;

bakeryFeatures.forEach(feature => {
    const coordinates = feature.geometry.coordinates;
    const name = feature.properties.name;
    const blurb = feature.properties.blurb;
    const tryThe = feature.properties.try;
    const hours = feature.properties.hours;
    const website = feature.properties.website;
    //adding a tag string for the pills. As tags are listed in the geojson file as a comma-separated string,
    // I split the string into an array of tags, trim any whitespace, and filter out any empty tags.
    // Then I create HTML for each tag with a colored background and white text, and join them together to display in the popup.
    const tagsString = feature.properties.tags || '';

    const tags = tagsString.split(',').map(tag => tag.trim()).filter(tag => tag.length > 0);
    const colors = ['#FF6B6B', '#4ECDC4', '#45B7D1', '#FFA07A', '#98D8C8', '#F7DC6F', '#BB8FCE', '#85C1E2'];
    const tagsHTML = tags.map((tag, index) => {
        const color = colors[index % colors.length];
        return `<span style="display: inline-block; background-color: ${color}; color: white; padding: 6px 12px; border-radius: 20px; margin-right: 6px; margin-bottom: 6px; font-size: 12px; font-weight: 500;">${tag}</span>`;
    }).join('');

    //styling the popup box and content with the name, blurb, recommended dishes, hours, website, and tags for each bakery
    const popup = new mapboxgl.Popup({ offset: 25 })
        .setHTML(`
            <div style="max-width: 300px;">
                <h3 style="margin: 0 0 8px 0;">${name}</h3>
                <p style="margin: 0 0 12px 0; font-size: 14px;">${blurb}</p>
                <p style="margin: 0 0 8px 0; font-size: 12px;"><strong>Try:</strong> ${tryThe}</p>
                <p style="margin: 0 0 8px 0; font-size: 12px;"><strong>Hours:</strong> ${hours}</p>
                <p style="margin: 0 0 12px 0; font-size: 12px;"><a href="${website}" target="_blank" style="color: #FF69B4;">Visit Website</a></p>
                <div style="margin-top: 12px; padding-top: 12px; border-top: 1px solid #eee;">
                    ${tagsHTML}
                </div>
            </div>
        `);

    //Adding the marker to the map with the popup for each bakery location
    new mapboxgl.Marker()
        .setLngLat(coordinates)
        .setPopup(popup)
        .addTo(map);
});
});