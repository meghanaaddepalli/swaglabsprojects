$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Features/login.feature");
formatter.feature({
  "line": 2,
  "name": "SwagLabs Website",
  "description": "I want to use this template for my feature file",
  "id": "swaglabs-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SwagLabs"
    }
  ]
});
formatter.scenario({
  "line": 98,
  "name": "Login to the website",
  "description": "",
  "id": "swaglabs-website;login-to-the-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 97,
      "name": "@SwagLabs_TS9"
    }
  ]
});
formatter.step({
  "line": 99,
  "name": "user is launching the webapplications",
  "keyword": "Given "
});
formatter.step({
  "line": 100,
  "name": "the user opens the Swaglabs Home",
  "keyword": "When "
});
formatter.step({
  "line": 101,
  "name": "the user enters username",
  "keyword": "Then "
});
formatter.step({
  "line": 102,
  "name": "the user enters password",
  "keyword": "And "
});
formatter.step({
  "line": 103,
  "name": "click on the login button user will not navigate to the next page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageFailureStep.the_user_launch_the_chrome_application()"
});
formatter.result({
  "duration": 6287795754,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageFailureStep.the_user_open_the_Myntra_Home_page()"
});
formatter.result({
  "duration": 1631243984,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageFailureStep.the_user_login_using_username()"
});
formatter.result({
  "duration": 1325064151,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageFailureStep.the_user_login_using_password()"
});
formatter.result({
  "duration": 1200112791,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageFailureStep.click_on_the_login_button_user_nagivate_to_the_next_page()"
});
formatter.result({
  "duration": 5475559574,
  "status": "passed"
});
});