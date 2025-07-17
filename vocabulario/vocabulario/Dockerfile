FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

# 👉 Dá permissão de execução ao mvnw
RUN chmod +x mvnw

# ⚙️ Compila o projeto ignorando testes
RUN ./mvnw clean package -DskipTests

# ▶️ Executa o .jar gerado
CMD ["java", "-jar", "target/vocabulario-0.0.1-SNAPSHOT.jar"]