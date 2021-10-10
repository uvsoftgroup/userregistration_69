FROM openjdk:8-jdk-alpine
MAINTAINER uvsoftgroup
VOLUME /tmp
EXPOSE 3030
COPY target/userregistration-1.2.6.jar /app/app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]