# event-driven-microservices
This repository contains a Java-based project that demonstrates an event-driven microservices architecture built with Spring Boot and Kafka. The project includes Kafka Streams for event processing, Elastic Stack for logging and monitoring, Netflix Eureka for service registration and discovery, and Spring Cloud Sleuth for distributed tracing.

## Architecture Overview

![](/architecture-overview.png)

## Docker
To run docker compose with Kafka clusters use:
```
cd docker-compose
docker-compose up
# OR 
# docker-compose -f common.yml -f kafka_cluster.yml -f services.yml up
```
NOTE: If you want to rerun this command please make sure to remove containers created before, by using: 
```
docker-compose down
```
To run kafkacat (non-JVM Apache Kafka producer and consumer) use:
```
docker run --tty --network=host confluentinc/cp-kafkacat kafkacat -L -b localhost:19092
```
To monitor Kafka topics use:
```
docker run --tty --network=host confluentinc/cp-kafkacat kafkacat -C -b localhost:19092 -t twitter-topic
```
