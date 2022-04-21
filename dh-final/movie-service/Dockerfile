FROM openjdk:17-oracle
ARG JAR_FILE=target/movie-service-1.0.jar
COPY ${JAR_FILE} movie-service.jar
ENTRYPOINT ["java","-jar","movie-service.jar"]
EXPOSE 8081