FROM openjdk:17-oracle
ARG JAR_FILE=target/series-service-1.0.0-SNAPSHOT.jar
COPY ${JAR_FILE} series-service.jar
ENTRYPOINT ["java","-jar","series-service.jar"]
EXPOSE 8082