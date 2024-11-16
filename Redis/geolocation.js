const client = require('./client');

// GEOADD: Adds one or more members to a geospatial index
async function addLocations(key, locations) {
    // Locations is an array of [longitude, latitude, member] tuples
    // Example: locations = [[longitude1, latitude1, member1], [longitude2, latitude2, member2], ...]
    const result = await client.geoadd(key, ...locations.flat());
    console.log("GEOADD Result:", result);
}

// GEODIST: Returns the distance between two members of a geospatial index
async function calculateDistance(key, member1, member2, unit) {
    // 'unit' can be 'm' (meters), 'km' (kilometers), 'mi' (miles), 'ft' (feet)
    const result = await client.geodist(key, member1, member2, unit);
    console.log("GEODIST Result:", result, unit);
}

// GEOHASH: Returns members from a geospatial index as geohash strings
async function getGeoHashes(key, members) {
    const result = await client.geohash(key, ...members);
    console.log("GEOHASH Result:", result);
}

// GEOPOS: Returns the longitude and latitude of members from a geospatial index
async function getGeoPositions(key, members) {
    const result = await client.geopos(key, ...members);
    console.log("GEOPOS Result:", result);
}

// GEORADIUS: Queries a geospatial index for members within a distance from a coordinate
async function queryLocationsWithinRadius(key, longitude, latitude, radius, unit) {
    // 'unit' can be 'm' (meters), 'km' (kilometers), 'mi' (miles), 'ft' (feet)
    const result = await client.georadius(key, longitude, latitude, radius, unit);
    console.log("GEORADIUS Result:", result);
}

// GEORADIUS_RO: Returns members from a geospatial index that are within a distance from a coordinate
async function getLocationsWithinRadius(key, longitude, latitude, radius, unit) {
    // 'unit' can be 'm' (meters), 'km' (kilometers), 'mi' (miles), 'ft' (feet)
    const result = await client.georadiusro(key, longitude, latitude, radius, unit);
    console.log("GEORADIUS_RO Result:", result);
}

// GEORADIUSBYMEMBER: Queries a geospatial index for members within a distance from a member
async function queryLocationsByMember(key, member, radius, unit) {
    // 'unit' can be 'm' (meters), 'km' (kilometers), 'mi' (miles), 'ft' (feet)
    const result = await client.georadiusbymember(key, member, radius, unit);
    console.log("GEORADIUSBYMEMBER Result:", result);
}

// GEORADIUSBYMEMBER_RO: Returns members from a geospatial index that are within a distance from a member
async function getLocationsByMember(key, member, radius, unit) {
    // 'unit' can be 'm' (meters), 'km' (kilometers), 'mi' (miles), 'ft' (feet)
    const result = await client.georadiusbymemberro(key, member, radius, unit);
    console.log("GEORADIUSBYMEMBER_RO Result:", result);
}

// GEOSEARCH: Queries a geospatial index for members inside an area of a box or a circle
async function searchLocations(key, options) {
    const result = await client.geosearch(key, options);
    console.log("GEOSEARCH Result:", result);
}

// GEOSEARCHSTORE: Queries a geospatial index for members inside an area of a box or a circle, optionally stores the result
async function searchLocationsAndStore(key, options, storeKey) {
    const result = await client.geosearchstore(key, storeKey, options);
    console.log("GEOSEARCHSTORE Result:", result);
}

// Example usage
async function example() {
    // Example data
    const locations = [
        [-122.4194, 37.7749, "San Francisco"],
        [-73.935242, 40.73061, "New York"]
    ];

    // GEOADD
    await addLocations("locations", locations);

    // GEODIST
    await calculateDistance("locations", "San Francisco", "New York", "km");

    // GEOHASH
    await getGeoHashes("locations", ["San Francisco", "New York"]);

    // GEOPOS
    await getGeoPositions("locations", ["San Francisco", "New York"]);

    // GEORADIUS
    await queryLocationsWithinRadius("locations", -122.4194, 37.7749, 100, 'km');

    // GEORADIUS_RO
    await getLocationsWithinRadius("locations", -122.4194, 37.7749, 100, 'km');

    // GEORADIUSBYMEMBER
    await queryLocationsByMember("locations", "San Francisco", 100, 'km');

    // GEORADIUSBYMEMBER_RO
    await getLocationsByMember("locations", "San Francisco", 100, 'km');

    // GEOSEARCH
    await searchLocations("locations", {from: "circle", by: "coordinates", coordinates: [-122.4194, 37.7749], radius: 100, unit: "km"});

    // GEOSEARCHSTORE
       // GEOSEARCHSTORE (Continued)
       await searchLocationsAndStore("locations", {from: "circle", by: "coordinates", coordinates: [-122.4194, 37.7749], radius: 100, unit: "km"}, "results");

       // Retrieve stored results (optional)
       const storedResults = await client.zrange("results", 0, -1);
       console.log("Stored Results:", storedResults);
   }
   
   // Run the example
   example().then(() => {
       // Close the client connection
       client.quit();
   }).catch(console.error);
   