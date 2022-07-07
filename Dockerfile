FROM openjdk:17-alpine

RUN mkdir -p app

COPY ./MTS.User.App/target/MTS.User.App.jar /app

WORKDIR /app

EXPOSE 8080

CMD ["java", "-jar", "MTS.User.App.jar", "-Dspring.profiles.active=$env"]