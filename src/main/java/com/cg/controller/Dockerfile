FROM maven:3.8.2-jdk-17
EXPOSE 8080
WORKDIR /46330756SeriesProject
COPY . .
RUN mvn clean install
CMD mvn spring-boot:run