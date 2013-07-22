phonegap-parse-plugin
=====================

Phonegap 3.0.0 plugin for Parse.com push service

Using [Parse.com's](http://parse.com) REST API for push requires the installation id, which isn't available in JS

This plugin exposes the four native Android API push services to JS:
* <a href="https://www.parse.com/docs/android/api/com/parse/ParseInstallation.html#getInstallationId()">getInstallationId</a>
* <a href="https://www.parse.com/docs/android/api/com/parse/PushService.html#getSubscriptions(android.content.Context)">getSubscriptions</a>
* <a href="https://www.parse.com/docs/android/api/com/parse/PushService.html#subscribe(android.content.Context, java.lang.String, java.lang.Class, int)">subscribe</a>
* <a href="https://www.parse.com/docs/android/api/com/parse/PushService.html#unsubscribe(android.content.Context, java.lang.String)">unsubscribe</a>

Configuration
-------------
Add the plugin to your res/xml/config.xml:
```
<feature name="org.apache.cordova.core.ParsePlugin">
  <param name="android-package" value="org.apache.cordova.core.ParsePlugin" />
</feature>
```

Usage
-----

Compatibility
-------------
Phonegap > 3.0.0
