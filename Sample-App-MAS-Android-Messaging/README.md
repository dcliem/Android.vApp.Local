# Messaging Sample App

**Required:**
* Latest version of Android Studio
* Device with Passcode and/or Fingerprint locks enabled

## Get Started
1. In Android Studio, open the project 'MASMessagingSample'.
2. In the CA OAuth Manager, create an app, and export the msso_config file (https://you_server_name:8443/oauth/manager). For help with this file, see [Android Guide](https://www.ca.com/us/developers/mas/docs.html?id=1).
3. Copy the contents of the exported msso_config to src/main/assets/msso_config.json.
4. Open src/main/java/com/ca/mas/masmessagingsample/activity/GroupListActivity.java. At the end of the onCreate() function, replace the strings "username" and "password" with a set of credentials from your MAG database.
5. Build and Deploy the app to a device.
