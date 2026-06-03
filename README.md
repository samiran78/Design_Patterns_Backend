# Design Patterns Backend

Java implementation of design patterns.

## Project Structure

```
src/
  main/
    java/          - Source code
    resources/     - Configuration files and resources
  test/
    java/          - Test code
```

## Prerequisites

- Java 11 or higher
- Maven 3.6+

## Building the Project

```bash
mvn clean compile
```

## Running Tests

```bash
mvn test
```

## Creating a JAR

```bash
mvn clean package
```

## Running a Main Class

```bash
mvn exec:java -Dexec.mainClass="com.designpatterns.YourMainClass"
```
