# Summary
This project is a simple Spring Boot web application built with Gradle. It serves a "Hello, World!" message at the root URL. The project structure and Gradle configuration are designed to be scalable, allowing for easy extension and addition of new features.

# Running the Application
To run the application

```sh
./gradlew bootRun
```
# Building the Application
To build the application and create a JAR file

```sh
./gradlew build
```

The built JAR file will be located in app/build/libs and can be run with

```sh
java -jar app/build/libs/app-1.0.0.jar
```

Open your web browser and navigate to `http://localhost:8080`. You should see the message "Hello, World!".
