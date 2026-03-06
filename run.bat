@echo off
echo ===============================
echo Creating Maven Project...
echo ===============================

@REM mvn archetype:generate ^
@REM -DgroupId=com.roy ^
@REM -DartifactId=pracMVN2 ^
@REM -DarchetypeArtifactId=maven-archetype-quickstart ^
@REM -DinteractiveMode=false//mvn archetype:generate -DgroupId=com.roy.prac -DartifactId=mylib -Dversion=1.0 -Dpackage=com.roy.prac -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeGroupId=org.apache.maven.archetypes -DinteractiveMode=false

mvn archetype:generate ^
-DgroupId=com.roy.algo ^
-DartifactId=algorithm-toolkit ^
-DarchetypeArtifactId=maven-archetype-quickstart ^
-DinteractiveMode=false


echo.
echo ===============================
echo Entering Project Folder...
echo ===============================



pause