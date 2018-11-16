# User Management Sample App

**Required:**
* Latest version of Android Studio
* Device with Passcode and/or Fingerprint locks enabled

## Get Started
1. In Android Studio, open the project 'MASUserManagementSample'.
2. In the CA OAuth Manager, create an app, and export the msso_config file (https://you_server_name:8443/oauth/manager). For help with this file, see [Android Guide](https://www.ca.com/us/developers/mas/docs.html?id=1).
4. Open src/main/java/com/ca/mas/masusermanagementsample/activity/GroupListActivity.java. At the end of the onCreate() function replace the strings "username" and "password" with a set of credentials from your server's database.
5. Build and Deploy the app to a device.
