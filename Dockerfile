FROM maven:3.8.6-jdk-8-slim AS MAVEN_TOOL_CHAIN
COPY pom.xml /tmp/
COPY src /tmp/src/WORKDIR /tmp/
RUN mvn package FROM openjdk:8-jdk-alpine
COPY --from=MAVEN_TOOL_CHAIN  /tmp/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]