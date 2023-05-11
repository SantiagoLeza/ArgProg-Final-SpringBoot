
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM amazoncorretto:17

MAINTAINER SantiagoLeza

COPY target/final-0.0.1-SNAPSHOT.jar final-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/final-0.0.1-SNAPSHOT.jar"]