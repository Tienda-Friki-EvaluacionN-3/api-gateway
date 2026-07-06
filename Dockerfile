FROM eclipse-temurin:21-jre

WORKDIR /app

COPY target/api-gateway-1.0.0.jar app.jar

EXPOSE 8090

ENTRYPOINT ["java","-Dspring.profiles.active=docker","-jar","app.jar"]