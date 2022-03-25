FROM openjdk:17-jdk-alpine

VOLUME /tmp

EXPOSE 9999

ADD target/REST-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]