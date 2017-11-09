# crowd-pulse plugin skeleton
This project is an empty Gradle project to modify in order to create a new plugin for CrowdPulse framework.

Please read the following guidelines:
- clone this repository ad delete the .git folder once download is completed;
- modify the plugin name in <code>settings.gradle</code> file using the name style *crowd-pulse-plugin-name*
- add the dependecy you need in the gradle file (eg. <code>compile 'com.github.swapUniba:crowd-pulse-data-java:master-SNAPSHOT'</code>)
in the *dependecies* section;
- create your plugin Java classes in <code>src/main/java/com.github.swapUniba.pulse.crowd.yourpackagename</code>;
- if you want, you can create JUnit test classes in <code>src/test/java</code>;
- create a Github repository using the name style *crowd-pulse-plugin-name*; 
- follow the Github instructions to associate your local project to remote repository.

Deploy instructions:
- delete this README.md file and create your own;
- create the folder <code>resources/META-INF/services/</code> and create in it the an empty file named 
**com.github.frapontillo.pulse.spi.IPlugin** (important!)
- in the file just created write, in the first line, the complete package name of the plugin main class 
(eg. com.github.swapUniba.pulse.crowd.yourpackagename.PluginMainClass)
