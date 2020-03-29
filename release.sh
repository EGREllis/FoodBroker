#!/bin/bash

PATH="/website/tools/jdk/jdk1.8.0_241/bin:$PATH"
JAVA_HOME="/website/tools/jdk/jdk1.8.0_241/"
M2_HOME="/website/tools/maven/apache-maven-3.6.3"
M2_REPO="/website/tools/repo"
PATH="/website/tools/maven/apache-maven-3.6.3/bin:$PATH"

git pull
/website/tools/maven/apache-maven-3.6.3/bin/mvn clean install
cp ./target/food.war ../../tools/javaee/glassfish5/glassfish/domains/domain1/autodeploy/
