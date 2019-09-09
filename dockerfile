FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD  target/booking-v1.jar .
ENTRYPOINT ["java","-jar","/booking-v1.jar"]