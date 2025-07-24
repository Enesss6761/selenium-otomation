# yp-adminui-automation
YemekPay Backoffice Admin UI automation project
UI tests for Backoffice AdminUI. These tests will run in staging environments


Tech stack:
* Selenium Web Driver
* Java 17
* JUnit
* Serenity
* Cucumber
* Gherkin
* Maven


##### Follow these steps to set up your web tests to run with ChromeDriver:

1. Ensure Chromium/Google Chrome is installed in a recognized location.
2. ChromeDriver expects you to have Chrome installed in the default location for your platform.
3. Download the ChromeDriver binary for your platform under the downloads section of this site.
   Link here: https://chromedriver.chromium.org/downloads
4. Help WebDriver find the downloaded ChromeDriver executable by including the ChromeDriver location in your PATH
   environment variable.

### Building

##### TestRail environment variables
- `export TESTRAIL_USERID= "your testrail email id"`
- `export TESTRAIL_KEY=` To Generate Testrail Key Open testrail >> My Settings > Api Keys > Add Key. Save the same key in env variables.

##### Browser environment variables
- `export HEADLESS=` Set to `true` if you want chrome to run in headless mode


#### Setup your Test rail Suite id for your domain
For example Payment Team Suite has a suiteId = 42475, add this to testrail.properties with the right domain prefix.
testrail_paymentcore_suiteId=42475

Add your suiteId property to TestRailConfig.
In testRail.TestRailReport set your domain's suite id so that the loadTestRailProperties function loads the config.


#### Not create new test run for your local executions (Optional)
- In case you do not want to create new test run for your local run, please define an environment variable on your local
  ```shell
  export CREATE_NEW_RUN=false
  ```
