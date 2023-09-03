# CSS - Computer Self-Service

CSS is an API for an online computer store that allows the user to build their own computer by choosing different hardware components, such as motherboards, processors, and so on. The system should be able to prevent hardware incompatibility due to customers' poor choices, for example, selecting an incompatible processor for a given motherboard.


> **<span style="color:red">This is a work in progress, and under no circumstances should it be used in production.</color>**

## Pre-requirements
- Java >= 17
- Maven >= 3.8.1
- Spring Boot >= 3.1.2

## Running Locally
> mvn clean install
>
> mvn spring-boot:run

Or configure your IDE. 


## Creating new components
Example using Visual Studio Code Rest Client plugin:
```json
POST http://localhost:8080/components
content-type: application/json

{
  "components": 
  [
    { 
      "name":"B550M Aorus Elite Micro ATX AM4", 
      "manufacturer" : "GIGABYTE",
      "type" : "MAIN_BOARD",
      "price": 899.99, 
      "quantity": 10,
      "mainBoard" : {
        "socket":"LGA",
        "memorySlots": 4,
        "ecc": true,
        "raid": true,
        "energyConsumption": 30
      }
    },
    { 
      "name":"AMD Ryzen 5 5600G", 
      "manufacturer" : "AMD",
      "type" : "PROCESSOR",
      "price": 1549.99, 
      "quantity":10,
      "processor" : {
        "socket":"LGA",
        "clock":3,
        "cores":4,
        "threads":4,
        "energyConsumption": 20      
      }
    }
  ]    
}
```
## H2 Database
Access the in memory H2 database to view the tables and data (Check it out the H2 URL at application startup: /h2-console)

## Expanding the system to support a new Hardware type
1. Create the new class to represent the Hardware and implement on it the Hardware interface.
2. Add a test for the new hardware on the ComponentTest and update the validator test. 
3. Add the new type on the ComponentTypeEnum.
4. Create the new Input for the CreateComponent use case with validation rules.
5. Update the Component class adding the get method for the new Hardware.
6. Update the CreateComponentInput adding the new Hardware input.
7. Update the ComponentValidator.
8. Update the ComponentConverter.
9. At framework package, create the Entity for the new Hardware table.
10. At framework package, update the ComponentEntityConverter.

## Current domain model
![System model](oop-model.png "Current system model")

## Improvement points
* System expandability
* Test coverage
* Another design approach?
