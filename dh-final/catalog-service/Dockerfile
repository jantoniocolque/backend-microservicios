FROM openjdk:17-oracle
ARG JAR_FILE=target/catalog-service-1.0.jar
COPY ${JAR_FILE} catalog.jar
ENTRYPOINT ["java","-jar","catalog.jar"]
EXPOSE 8083