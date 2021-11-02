# travisCISpringBootExample
## application ##
- **java 11**
- app created from template of spring initializr https://start.spring.io/ with improvements
#### junit tests ####
- run by gradle task test
#### junit reports ####
- created by gradle task test
#### jacoco reports ####
- created by gradle task jacocoTestReport within plugin jacoco on the basis of results of junit tests with providing of code coverage metrics
#### coveralls ####
- jacoco reports are deployed to coveralls.io
- coveralls provides test coverage history and statistics of a project
- **current coverage**
[![Coverage Status](https://coveralls.io/repos/github/matjawor/travisCISpringBootExample/badge.png?branch=main)](https://coveralls.io/github/matjawor/travisCISpringBootExample?branch=main)
### modules (subprojects) in main project ###
- modules1 with its own build.gradle
## gradle ##
- plugin application with property mainClass to run main method within module1 context by ```./gradlew :subprojectName:run```
- junit test plugin for root build.gradle
- coveralls plugin as above
- jacoco plugin as above
- customized task getSubprojectVersion in root context with subprojectName properties as gradlew command parameter ```./gradlew getSuprojectVersion -PsubprojectName=name```
- customized task getProjectVersion within subproject context by ```./gradlew :module1:getProjectVersion```

## travis ci ##
- pipeline is triggered by push events or pull requests to main branch
## travis ci config ##
#### include stages ####
- on default clone main branch
- run gradle tests on the project
- run the application on spring dev profile (application-dev.properties) and close it gracefully
- send always notification to slack channel with default template

## travis cli ##
- strongly recommended to encrypt secrets e.g. via travis cli tool that appends changed properties to .travis.yml

## docker ##
- dockerfile in `ci/docker/dockerfile`

## aws s3 with artifacts ##
- s3 deploy section in `.travis.yml` configuration

## heroku deployment ##
//TODO
- based on spring prod profile (application-prod.properties)
