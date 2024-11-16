# Use an official OpenJDK image as a base image
FROM openjdk:latest

# Set the working directory
WORKDIR /opt

# Copy the JAR file into the container
COPY target/*.jar /opt/app.jar

# Set environment variables for Spring Boot
ENV SPRING_DATASOURCE_URL=jdbc:mysql://db:3306/job?autoReconnect=true&allowPublicKeyRetrieval=true&useSSL=false
ENV SPRING_DATASOURCE_USERNAME=root
ENV SPRING_DATASOURCE_PASSWORD=1234

# Expose the port that the Spring Boot application will run on
EXPOSE 8080

# Define the entry point to run the Spring Boot application
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar
