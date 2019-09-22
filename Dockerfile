FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 9899
ADD target/*.jar app.jar
CMD ["java", "-jar", "app.jar" ]