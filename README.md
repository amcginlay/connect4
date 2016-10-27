# connect4
Full TDD example of connect4 logic and console app

#### Windows Instructions
```cmd
git clone https://github.com/amcginlay/connect4.git
cd connect4

mvn -f connect clean package
mvn -f connectconsole clean package
"%JAVA_HOME%\bin\java -cp connect\target\connect-0.0.1-SNAPSHOT.jar;connectconsole\target\connectconsole-0.0.1-SNAPSHOT.jar com.cynaptec.connectconsole.App
```
