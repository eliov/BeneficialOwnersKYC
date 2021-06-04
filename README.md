# BeneficialOwnersKYC

Every financial institution has to perform a know-your-customer(KYC) procedure and identify beneficial owners for every company they are working with as a customer.
This task is to build a legal entity beneficial owner monitoring service.

# Technology Stack
- Java 8
- Spring boot
- In memory database, H2
- Postman
- RESTfull endpoints
- Docker
- Docker compose

# Commands to run project

- How to compile 

  mvnw clean package

- How to run project

  java -jar 

- How to ship as container

  docker build -t beneficialOwner.

- How to run docker image

  docker run -d -p 8080:8080 beneficialOwner 
