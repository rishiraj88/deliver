# deliver
to deliver products and services with emotions and motives

## app class
- booking experience
- self pickup by recepients

## development approach
- *Phase 1:* First of all, create a dirty monolith app, which is not thread safe inherently.
- *Phase 2:* Then distribute it into microservices and define of RESTful APIs for integration.
- *Phase 3:* Dockerise the microservices, with an allowance for keeping closely related microservices within shared containers.
- *Phase 4:* Make use of concurrent collection types for better throughput.

## status
work in progress
Currently, in Phase 1.