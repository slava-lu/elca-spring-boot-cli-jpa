# Elca Spring Boot JPA Module

## Description

The Elca Spring Boot JPA Module contains the necessary dependencies to integrate Spring Data JPA functionality into an existing project.

## Prerequisites
* Java Development Kit (JDK) 17 or higher. [Installation instruction](https://www.oracle.com/java/technologies/downloads/)
* Spring CLI installed on your system. [Installation instruction](https://docs.spring.io/spring-cli/reference/installation.html)

## How to use

* Ensure that the Spring CLI is installed and available in your system's PATH: `spring version`
* Add the ELCA catalog to the Spring CLI, if not already done, by running: `spring project-catalog add elca https://github.com/slava-lu/elca-spring-boot-cli-starter`,
  Here, _elca_ is an arbitrary name you assign to the catalog
* Check that the catalog has been registered properly: `spring project-catalog list`. You should see the catalog with the name _elca_ in the output.
* Navigate to the root folder of the existing Java Spring Boot project
* Run `spring boot add elca-jpa`

## Dependencies list
* Spring Data JPA
* Flyway Migration
* PostgreSQL Driver
* Flyway Migration