# CampusSearchPlus (Beta)
CampusSearchPlus is a chrome extension that makes browsing CampusSearch easier

## Install instructions (end-user)
### Browser installation (part 1)
1. Go to __chrome://extensions__ in Chrome
2. Go to the downloaded repository in your file manager
3. Drag the .crx file into the extensions tab

### Windows installation (part 2)
1. Go to Start >> Run >> shell:startup
2. Copy CampusSearchPlus.jar into the the startup folder
3. Reboot your machine

## Install instructions (Development)
1. Go to __chrome://extensions__
2. Click the button __Load unpacked extension__
3. Navigate to repository download location, select the entire folder and hit Ok
4. Run the CampusSearchPlus.jar or
   1. Build a project around the java src folder in your favorite Java IDE
   2. Run the Server class

NOTE: the CampusSearchPlus.jar runs on port 8000. If you have other applications running on the same port, I discourage you from installing this extension. Future versions may include a config file to manually configure the port.
