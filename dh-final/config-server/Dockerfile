FROM openjdk:17-oracle
ARG JAR_FILE=target/config-server-1.0.jar
COPY ${JAR_FILE} config-server.jar
ENTRYPOINT ["java","-jar","config-server.jar"]
EXPOSE 8888