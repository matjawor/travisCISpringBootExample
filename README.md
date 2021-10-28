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
[![Coverage Status](https://coveralls.io/repos/github/matjawor/travisCISpringBootExample/badge.svg?branch=main)](https://coveralls.io/github/matjawor/travisCISpringBootExample?branch=main)

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
//TODO
- dockerfile

## heroku deployment ##
//TODO
- based on spring prod profile (application-prod.properties)
