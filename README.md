# boot-hystrix

A simple example of a micro-service that makes use of Service Discover (Eureka), and Circuit Breaker (Hystrix)

$ gradle clean build bootRun

This will create a RESTful service endpoint that provides a list of stores

http://localhost:8080/api/stores

It will also attempt to register this service with the Eureka discovery service.

It will also provides an API endpoint which will contact the Eureka discovery service for the root URL of this service

http://localhost:8080/service/stores
