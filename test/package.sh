export workspace=/Users/Arber/Develop/Eclipse Oxygen/Workspace/IWVG-forge/scripts
echo -----------------------------------------
echo "MiguelArber.Magjistari.SVC.miw.upm.es"
echo -----------------------------------------
echo "============ mvn clean test (profile: develop) ======================================================="
mvn clean test
echo "============ mvn package (profile: preproduction) ===================================================="
mvn package verify -Denvironment=preproduction --settings settings.xml
exit
