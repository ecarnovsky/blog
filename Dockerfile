FROM openjdk:8-jdk-alpine
FROM maven:3.8.6-jdk-8-slim AS MAVEN_TOOL_CHAIN
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
COPY pom.xml /tmp/
COPY src /tmp/src/WORKDIR /tmp/
COPY --from=MAVEN_TOOL_CHAIN  /tmp/target/*.jar app.jar
RUN mvn package FROM openjdk:8-jdk-alpine
ENTRYPOINT ["java","-jar","/app.jar"]
