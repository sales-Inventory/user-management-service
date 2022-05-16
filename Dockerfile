FROM openjdk:11-jre-slim
ARG JAR_FILE=target/user-management-service-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT exec java -jar /app.jar
EXPOSE 8080