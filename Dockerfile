FROM openjdk:8
ADD target/SpringBootdockerDemo-0.0.1-SNAPSHOT.jar springbootdockerdemo.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "springbootdockerdemo.jar"]