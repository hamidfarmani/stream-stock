# Online Store Microservice

## Introduction

This is an online store microservice that allows customers to order products. The service is built using a microservice architecture and utilizes various technologies and tools to provide a robust and scalable solution.

## Features
- The service uses Kafka for messaging when an order is placed and sends notifications to customers in real-time.
- The service uses Eureka for service discovery and API Gateway for routing different services, and it is secure by Keycloak.
- The service uses resilience4j for circuit breaker and retries, Micrometer and Zipkin for distributed tracing and Prometheus and Grafana for metrics collection and visualization.
- All services are dockerized and deployed using Jib and Docker Compose

To understand it better, I provided some information about each section.

## Microservices
There are multiple microservices provided:
- api-gateway
- discovery-server
- inventory-service
- notification-service
- order-service
- product-service

## Setup
To run the service locally, you'll need to have the following installed on your machine:
- Java 17
- Docker
- Docker Compose

1. Clone the repository: `git clone https://github.com/...`
2. Build the project: `./gradlew build`
3. Build and start the services using Docker Compose: `docker-compose up --build`
4. The service should now be running at `http://localhost:8080`

## Testing
To run the test suite, use the following command: `./gradlew test`

## Deployment
The service is designed to be easily deployed in a containerized environment. To deploy the service, you can use the Docker images built by Jib and the Docker Compose file provided.

## Monitoring and troubleshooting
Prometheus and Grafana have been added for metrics collection and visualization and Zipkin for distributed tracing. These tools provide detailed insights into the performance and behavior of the microservices and the interactions between them.

## Explanations

### Secured using KeyCloak
You can access KeyCloak on```http://localhost:8080/```

### Service discovery using Eureka
You can access Prometheus on```http://localhost:8761/```



### Messaging using Kafka

### Circuit breaker and retries using Resilience4J

### Distributed tracing using Micrometer and Zipkin

### Metrics collection using Prometheus
You can access Prometheus on```http://localhost:9090/```

### Service visualization using Grafana
You can access Grafana on```http://localhost:3000/``` and as described in ```docker-compose.yml``` file, its username is ```admin``` and the password is ```password```. 
