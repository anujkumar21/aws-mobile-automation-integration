# AWS Device Farm & Mobile Automation Integration

This POC is how we can integrate AWS Device Farm and Mobile Automation using Appium.
## Prerequisite:
- Java
- Maven
- Appium
- AWS Account

## About Testing Framework:
The framework is implemented using Java & Selenium\WebDriver, Appium.
Page Factory over Page Object Model (POM) is used to make the code more readable, maintainable, and reusable.
Sample wordpress android app is used for this poc.
Currently this sample framework, is tesing android apps, however, this can be used for iPhone apps testing too with minimal changes.

### How to Run:
Navigate to root folder of your project:
Build, package, and verify.

```sh
cd <location>\PycharmProjects\aws-mobile-automation-integration
mvn clean package -DskipTests=true
tree target
```
This will create you 'zip-with-dependencies.zip' in target folder. Upload it on aws console, and execute it.
 You can find process for your automation framework execution on aws device farm [here](https://docs.aws.amazon.com/devicefarm/latest/developerguide/how-to-create-test-run.html)


## Screeshots:

