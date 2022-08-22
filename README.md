# microservices-demo
Based on Event-Driven Microservices: Spring Boot, Kafka and Elastic Udemy course by Ali Gelenler.

## Architecture Overview

![](/architecture-overview.png)

## Docker
To run docker compose with Kafka clusters use:
```
cd docker-compose
docker-compose up
```
Alternative command:
```
cd docker-compose
docker-compose -f common.yml -f kafka_cluster.yml -f services.yml up
```
NOTE: If you want to rerun this command please make sure to remove containers created before, by using: 

```
docker-compose down
```

To run kafkacat (non-JVM Apache Kafka producer and consumer) use:
```
docker run --tty --network=host confluentinc/cp-kafkacat kafkacat -L -b localhost:19092
```
To monitor kafka topics using kafkacat use:
```
docker run --tty --network=host confluentinc/cp-kafkacat kafkacat -C -b localhost:19092 -t twitter-topic
```