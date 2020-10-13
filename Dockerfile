# Dockerfile example
FROM openjdk:8u191-jdk-alpine

WORKDIR /usr/local/

COPY banner-0.0.1-SNAPSHOT.jar /usr/local/

EXPOSE 8080

CMD java -jar banner-0.0.1-SNAPSHOT.jar