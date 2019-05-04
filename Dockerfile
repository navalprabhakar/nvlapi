FROM openjdk:8-jre
ADD target/nvlapi-0.0.1-SNAPSHOT.jar /nvlapi/app.jar
EXPOSE 8443
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/nvlapi/app.jar"]