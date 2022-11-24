## Traffic layers example for Android ##

:warning: Uses SDK version **0.3.1056**. Changes may be required for later SDK versions.

The TomTom Map Display module provides real-time traffic updates. These are displayed on the map through adding traffic flow and traffic incident layers. These layers can be shown or hidden using methods on the [TomTomMap](https://developer.tomtom.com/assets/downloads/tomtom-sdks/android/api-reference/0.3.509/maps/display/com.tomtom.sdk.maps.display/-tom-tom-map/index.html) instance.

### Running the example ###

1. To run the example you'll need an API key with the **Map Display** and **Traffic** APIs enabled.

2. Open the project in Android Studio, the file `local.properties` will be generated in your project level directory, and add the following code to local.properties, replacing `YOUR_API_KEY` with your API key.

<code>API\_KEY=*YOUR\_API\_KEY*</code>

3. Save the file and run the app.