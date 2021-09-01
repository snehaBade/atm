FROM openjdk:16-jdk-alpine
ADD target/atm-0.0.1-SNAPSHOT.jar atm.jar
ENTRYPOINT ["java", "-jar", "atm.jar"]