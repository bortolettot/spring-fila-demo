# spring-fila-demo

Demo de FILA com rabbitmq + Spring Boot

Maven 3 - Java 8

### Start
```sh
mvn clean install
mvn spring-boot:run
```


### Docker RabbitMQ
```sh
docker run -d --hostname my-rabbit --name some-rabbit -p 9090:15672 -p 5671:5671 -p 5672:5672 rabbitmq:3-management
```
