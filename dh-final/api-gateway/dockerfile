FROM openjdk:17-oracle
ARG JAR_FILE=target/api-gateway-1.0.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]
EXPOSE 8080