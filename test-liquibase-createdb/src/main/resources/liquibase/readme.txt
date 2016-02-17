SETUP LIQUIBASE
1 run
	mvn liquibase:help  //downloads all dependencies
2 run
	java -jar c:/temp/liquibase-core-3.4.2.jar --driver=com.mysql.jdbc.Driver --classpath=c:/temp/mysql-connector.jar
    --url=jdbc:mysql://127.0.0.1:3306/messages_test  --username=maciej --password=mljNns111
    --changeLogFile=src/main/resources/liquibase/changelog.xml generateChangeLog

	  //analyze given schema and create start point for liquibase