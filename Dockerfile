FROM mysql
FROM openjdk:latest
COPY ./target/sem_group3_cw-0.1-alpha-2-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "sem_group3_cw-0.1-alpha-2-jar-with-dependencies.jar"]