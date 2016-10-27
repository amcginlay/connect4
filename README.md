# connect4
Full TDD example of connect4 logic and console app

#### Windows Instructions
```cmd
git clone https://github.com/amcginlay/connect4.git
cd connect4
dir /s /B connect\src\main\*.java connectconsole\src\main\*.java > sources.txt
mkdir target
"%JAVA_HOME%\bin\javac.exe" @sources.txt -d target
"%JAVA_HOME%\bin\java.exe" -classpath target com.cynaptec.connectconsole.App
```
