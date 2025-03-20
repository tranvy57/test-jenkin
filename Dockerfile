FROM openjdk:17-jdk-slim
WORKDIR /app

# Copy toàn bộ source code
COPY . .

# Build file JAR ngay trong container
RUN ./gradlew clean build -x test

# Copy JAR vào image
COPY build/libs/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
