# --- этап 1: сборка jar внутри контейнера, своим Maven/Java не нужно

FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /build
# сначала только pom.xml — так Docker закэширует скачанные зависимости

COPY pom.xml .
RUN mvn -q -B dependency:go-offline
COPY src ./src
RUN mvn -q -B clean package -DskipTests

# --- этап 2: только JRE и готовый jar, без Maven и исходников ---
FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /build/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
