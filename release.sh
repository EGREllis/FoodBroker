#!/bin/bash
git pull
mvn clean install
cp ./target/food.war ../../tools/javaee/glassfish5/glassfish/domains/domain1/autodeploy/
