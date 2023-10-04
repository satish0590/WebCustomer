FROM openjdk:8-jdk-alpine
WORKDIR /app

COPY ./target/WebCustomer.war /app
EXPOSE 8080

CMD ["java", "-war", "WebCustomer.war"]