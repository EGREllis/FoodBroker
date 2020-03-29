#!/bin/bash
git pull
/website/tools/maven/apache-maven-3.6.3/bin/mvn clean install
cp ./target/food.war ../../tools/javaee/glassfish5/glassfish/domains/domain1/autodeploy/
