FROM eclipse-temurin:11-jdk-alpine
VOLUME /tmp
COPY target/paketblitz-datalog-service.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]