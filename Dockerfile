FROM openjdk:8-jdk-alpine
EXPOSE 80 8080
ADD target/SpringRestdemo-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "jar","app.jar"]