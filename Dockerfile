
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/final.jar
ADD ${JAR_FILE} final.jar
ENTRYPOINT ["java","-jar","/app.jar"]