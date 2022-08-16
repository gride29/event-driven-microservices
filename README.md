# microservices-demo

### Architecture Overview

![](/architecture-overview.png)

### Docker
To run docker compose with Kafka clusters use:
```
cd docker-compose
docker-compose -f common.yml -f kafka_cluster.yml up
```
NOTE: If you want to rerun this command please make sure to remove containers created before.

To run kafkacat (non-JVM Apache Kafka producer and consumer) use:
```
docker run --tty --network=host confluentinc/cp-kafkacat kafkacat -L -b localhost:19092
```