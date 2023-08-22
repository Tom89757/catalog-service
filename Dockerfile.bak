FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ./target/catalog-service-0.0.1-SNAPSHOT.jar catalog-service.jar
ENTRYPOINT ["java", "-jar", "/catalog-service.jar"]