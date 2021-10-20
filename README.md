# travisCISpringBootExample
## application ##
- **java 11**
- app created from template of spring initializr https://start.spring.io/ with improvements
## travis ci ##
- pipeline is triggered by push events or pull requests to main branch
## travis ci config ##
### include stages ###
- on default clone main branch
- run gradle tests on the project
- run the application on spring dev profile (application-dev.properties) and close it gracefully
- send always notification to slack channel with default template

## travis cli ##
- strongly recommended to encrypt secrets e.g. via travis cli tool

## heroku deployment ##
//TODO
- based on spring prod profile (application-prod.properties)
