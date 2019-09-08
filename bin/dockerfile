FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD  target/mb-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java","-jar","/mb-0.0.1-SNAPSHOT.jar"]