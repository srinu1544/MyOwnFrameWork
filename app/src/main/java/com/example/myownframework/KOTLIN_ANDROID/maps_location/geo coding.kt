package com.example.myownframework.Kotlin_Android.Maps_Location

/* Geocoding is the process of converting an address into geographic coordinates.
These coordinates can be used to place markers on a map or position the map.

The Android API has a Geocoder class that can perform both forward and reverse geocoding.
Forward geocoding uses a location name or latitude and longitude values to get more details
about an address. Reverse geocoding converts geographic coordinates into an address.

Geocoding is different from geolocation. Geolocation is the process of determining the
location of a device using its geographical coordinates.


// Function to convert an address to latitude and longitude
fun getAddressLocation(address: String): List<Address>? {
  val geocoder = Geocoder(this)  // Get an instance of Geocoder

  // Try to get locations from the provided address
  return try {
    geocoder.getFromLocationName(address, MAX_RESULTS)
  } catch (e: Exception) {
    e.printStackTrace()
    null
  }
}

// Constants
private val MAX_RESULTS = 5  // Maximum number of addresses to return

// Example usage
val userAddress = "1600 Amphitheatre Parkway, Mountain View, CA"
val locationList = getAddressLocation(userAddress)

if (locationList != null && locationList.isNotEmpty()) {
  val address = locationList[0]
  val latitude = address.latitude
  val longitude = address.longitude

  // Use latitude and longitude for further actions, like displaying on a map

} else {
  // Handle the case where no location is found
  Log.e("Geocoder", "No location found for address: $userAddress")
}





*/