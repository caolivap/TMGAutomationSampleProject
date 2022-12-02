# Sample Project for test automation at TMG

This is a test automation project using Serenity BDD with implementation of the Screenplay Pattern, and other tools as Cucumber, Junit,
Java language, Gradle as build and dependencies management tool. Website used for testing is Amazon official webpage (https://www.amazon.com/)

This project was created for offering a base test automation project for [**TMG**](https://www.tmg.io/) QA Automation team. 


<!-- Table of Contents -->
## Table of Contents
- [What do you need 🛠️](#what-do-you-need-before-downloading-the-repository-)
- [About Screenplay pattern 🧮](#about-screenplay-pattern-)
- [Project structure 🗼](#project-structure-)
- [Compilation ⚙️](#compilation-)
- [Execution 🚀](#execution-)
- [Author 🌍🔭](#author-)
<!-- TOC -->





## What do you need before downloading the repository 🛠️ ##

- JDK 1.8
- Gradle
- Git

## About Screenplay pattern 🧮

All information and implementations in this project can be found on next website:
- ### http://serenity-bdd.info/docs/serenity/

## Project structure 🗼

    .
    ├───src
    │   ├───main
    │   │   ├───java
    │   │   │   └───com.tmg.automation
    │   │   │        ├───exceptions         # Custom exceptions 
    │   │   │        ├───interactions       # Low level actions made into application for achieving a task
    │   │   │        ├───questions          # Layer of screenplay pattern that help validating application state in assertions
    │   │   │        ├───tasks              # High level actions made for Actor in screenplay pattern
    │   │   │        └───utils              # Classes and methods for using in any place of the project
    │   │   │        └───userinterfaces     # Layer of screenplay pattern for maping web elements from application, also called pages
    │   │   └───resources                   
    │   └───test
    │       ├───java
    │       │   └───com.tmg.automation
    │       │       ├───runners             # Classes for executing tests
    │       │       └───stepdefinitions     # Layer of screenplay pattern for maping cucumber steps to Java methods
    │       └───resources
    │           └───features                # Files with test scenarios in gherkin language
    └── target                              # This folder will be showed once tests are executed using command explained in next sections of this Readme file
    └── build.gradle                        # File for dependencies management and their versions
    └── serenity.properties                 # File with settings about webdriver, timeouts, etc. 
    

## Compilation ⚙️

Once the project has been downloaded, import it into IDE of preference.

It is important to compile the project, for this, execute the following command.
Run by console

```
gradle clean compileJava
```

## Execution 🚀

**Execution All tests**

To run all tests of this project and to generate the Serenity report you can use next command:

```
gradle clean test aggregate
```

**NOTE:** The report generated from tests execution is generated in the path `/target/site/serenity/index.html`

## Author 🌍🔭
- [Carlos Armando Oliva Paredes,](https://github.com/caolivap)
QA Automation at [TMG](https://www.tmg.io/)