#!/bin/bash
mvn clean install
cp target/food.war ../../../Tools/glassfish-5.0.1/glassfish5/glassfish/domains/domain1/autodeploy/
