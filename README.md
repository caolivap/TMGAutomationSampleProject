# Sample Project for test automation at TMG

This is a test automation project using Serenity BDD with implementation of the Screenplay Pattern, and other tools as Cucumber, Junit,
Java language, Gradle as build and dependencies management tool. Website used for testing is Amazon official webpage (https://www.amazon.com/)

This project was created for offering a base test automation project for [**TMG**](https://www.tmg.io/) QA Automation team. 


<!-- Table of Contents -->
## Table of Contents
- [What do you need ๐ ๏ธ](#what-do-you-need-before-downloading-the-repository-)
- [About Screenplay pattern ๐งฎ](#about-screenplay-pattern-)
- [Project structure ๐ผ](#project-structure-)
- [Compilation โ๏ธ](#compilation-)
- [Execution ๐](#execution-)
- [Author ๐๐ญ](#author-)
<!-- TOC -->





## What do you need before downloading the repository ๐ ๏ธ ##

- JDK 1.8
- Gradle
- Git

## About Screenplay pattern ๐งฎ

All information and implementations in this project can be found on next website:
- ### http://serenity-bdd.info/docs/serenity/

## Project structure ๐ผ

    .
    โโโโsrc
    โ   โโโโmain
    โ   โ   โโโโjava
    โ   โ   โ   โโโโcom.tmg.automation
    โ   โ   โ        โโโโexceptions         # Custom exceptions 
    โ   โ   โ        โโโโinteractions       # Low level actions made into application for achieving a task
    โ   โ   โ        โโโโquestions          # Layer of screenplay pattern that help validating application state in assertions
    โ   โ   โ        โโโโtasks              # High level actions made for Actor in screenplay pattern
    โ   โ   โ        โโโโutils              # Classes and methods for using in any place of the project
    โ   โ   โ        โโโโuserinterfaces     # Layer of screenplay pattern for maping web elements from application, also called pages
    โ   โ   โโโโresources                   
    โ   โโโโtest
    โ       โโโโjava
    โ       โ   โโโโcom.tmg.automation
    โ       โ       โโโโrunners             # Classes for executing tests
    โ       โ       โโโโstepdefinitions     # Layer of screenplay pattern for maping cucumber steps to Java methods
    โ       โโโโresources
    โ           โโโโfeatures                # Files with test scenarios in gherkin language
    โโโ target                              # This folder will be showed once tests are executed using command explained in next sections of this Readme file
    โโโ build.gradle                        # File for dependencies management and their versions
    โโโ serenity.properties                 # File with settings about webdriver, timeouts, etc. 
    

## Compilation โ๏ธ

Once the project has been downloaded, import it into IDE of preference.

It is important to compile the project, for this, execute the following command.
Run by console

```
gradle clean compileJava
```

## Execution ๐

**Execution All tests**

To run all tests of this project and to generate the Serenity report you can use next command:

```
gradle clean test aggregate
```

**NOTE:** The report generated from tests execution is generated in the path `/target/site/serenity/index.html`

## Author ๐๐ญ
- [Carlos Armando Oliva Paredes,](https://github.com/caolivap)
QA Automation at [TMG](https://www.tmg.io/)