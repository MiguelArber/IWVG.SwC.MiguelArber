export workspace=/home/miguelarber/eclipse-workspace/IWVG.SwC.MiguelArber
echo -----------------------------------------
echo "MiguelArber.Magjistari.SVC.miw.upm.es"
echo -----------------------------------------
echo "============ mvn clean test (profile: develop) ======================================================="
mvn clean test
echo "============ mvn package (profile: preproduction) ===================================================="
mvn package verify -Denvironment=preproduction --settings settings.xml
exit
