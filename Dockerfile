FROM gradle:7.4.1-jdk11 AS builder
COPY . /source
WORKDIR /source
RUN ./gradlew bootJar

FROM openjdk:11-jre-slim
WORKDIR /app
EXPOSE 8080
EXPOSE 5005
