FROM openjdk:8-jdk-alpine

COPY target/full-cycle-4.0.jar fullcycle.jar

EXPOSE 8080

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/fullcycle.jar"]
