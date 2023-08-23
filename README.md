# CSS - Computer Self-Service

## Pre-requirements
- Java >= 17
- Maven >= 3.8.1
- Spring Boot >= 3.1.2

## Running Locally
mvn clean install
mvn spring-boot:run

## Creating components
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