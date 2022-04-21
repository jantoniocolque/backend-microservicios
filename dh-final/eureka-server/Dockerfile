FROM openjdk:17-oracle
ARG JAR_FILE=target/eureka-server-1.0.jar
COPY ${JAR_FILE} eureka-server.jar
ENTRYPOINT ["java","-jar","eureka-server.jar"]
EXPOSE 8761