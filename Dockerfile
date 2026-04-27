# Use an official JDK runtime as a parent image
FROM eclipse-temurin:11-jre-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the executable jar from the target folder to the container
# Note: Adjust the filename if your artifactId or version differs
COPY target/api-server-cdss-staging.jar app.jar

# Expose the port your app runs on (default 8080)
EXPOSE 8080

# Run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]
