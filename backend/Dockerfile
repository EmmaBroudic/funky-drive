FROM maven:3.6.3 as maven

LABEL COMPANY="ShuttleOps"
LABEL MAINTAINER="support@shuttleops.com"
LABEL APPLICATION="Sample Application"

WORKDIR /usr/src/app
COPY . /usr/src/app
RUN mvn package -DskipTests  # Vous pouvez ajouter cette option si vos tests prennent du temps

FROM openjdk:11-jre-slim

ARG JAR_FILE=/usr/src/app/target/*.jar
COPY --from=maven ${JAR_FILE} /usr/app/app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/usr/app/app.jar"]