# Spring Core Manual Setup (POC)

## Overview
This project is a basic proof of concept (PoC) demonstrating how to set up a Spring application manually without using a build tool like Maven or Gradle. Instead of using dependency management, all required JAR files were downloaded manually from the Maven Central Repository and added to the project's classpath.

## Project Setup

### Requirements
- JDK 17 or later
- Spring Core JAR files (manually downloaded from [Maven Central Repository](https://mvnrepository.com/))
- An IDE like IntelliJ IDEA or Eclipse

### Steps to Set Up
1. **Download Dependencies:**
   - Required Spring JARs were manually downloaded from the Maven Central Repository.
   - These JARs were added to the project classpath manually.

2. **Create the Application Context:**
   - The project uses `AnnotationConfigApplicationContext` as the Spring container.
   - A configuration class was created and passed as a parameter to the application context.

3. **Define a Spring Bean:**
   - A user-defined class (`Printer`) was annotated with `@Component` to mark it as a Spring-managed bean.
   - During container initialization, Spring performed component scanning and pre-instantiated singleton beans.

4. **Retrieve and Use the Bean:**
   - The `Printer` bean was retrieved from the container using `getBean()`.
   - The instance method of the `Printer` class was invoked using the retrieved object.

## Floder Structure

![image](https://github.com/user-attachments/assets/b9f85249-c819-41ae-8762-006739130478)



## Challenges Faced

  - Since no build tool was used, all required JARs and their transitive dependencies had to be downloaded manually.
  - Managing dependencies manually is cumbersome and error-prone.

## Recommended Improvement
- Use a build tool like **Maven** or **Gradle** to simplify dependency management.
- With Maven, dependencies can be defined in `pom.xml`, and all required JARs (including transitive dependencies) will be automatically downloaded and managed.

### Example Maven Dependency for Spring Context
```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>use laatest version </version>
</dependency>
```

## Conclusion
This PoC demonstrates the importance of build tools in managing dependencies efficiently. While manually managing JAR files provides an understanding of how Spring works under the hood, using **Maven or Gradle** is the recommended approach for real-world applications.

