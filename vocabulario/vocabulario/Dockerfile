# Imagem base com JDK 17
FROM eclipse-temurin:17-jdk

# Diretório de trabalho dentro do container
WORKDIR /app

# Copia o conteúdo do projeto para dentro do container
COPY . .

# Compila o projeto ignorando testes
RUN ./mvnw clean package -DskipTests

# Comando para rodar o .jar gerado
CMD ["java", "-jar", "target/vocabulario-0.0.1-SNAPSHOT.jar"]
