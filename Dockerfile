FROM openjdk:8-jdk-alpine
COPY target/docker-message-server-1.0.0.jar spring-boot-ticketbooking-1.0.0.jar
ENTRYPOINT ["java","-jar","/spring-boot-ticketbooking-1.0.0.jar"]
