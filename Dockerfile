FROM openjdk:8
ADD target/constellationmonitor.jar constellationmonitor.jar
EXPOSE 8888
ENTRYPOINT ["java","-jar","constellationmonitor.jar"]