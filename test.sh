export workspace=/home/miguelarber/eclipse-workspace/IWVG.SwC.MiguelArber
echo -----------------------------------------
echo "MiguelArber.Magjistari.SVC.miw.upm.es"
echo -----------------------------------------
echo "============ mvn clean test (profile: develop) ======================================================="
mvn clean test --settings settings.xml
exit
