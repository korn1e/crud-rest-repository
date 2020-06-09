# REST-ful API CRUD Repository Test
---
## Description
- Application that stores Viruses and Vaccines information.  
- Use Spring Boot and Srping Data.  
- It can be accessed using REST API.  
- CRUD commands can be invoked using REST API.  
- Use in-memory database (Derby).

---
## System Requirement

- Java 8 or later
- Maven 3.x (to compile)
---
## Compile the Code
Simply run following command
```bash
mvn clean package
``` 
---
## How to Run
Following is how to run the application
```bash
java -jar /path/to/file.war
``` 
Example:
```bash
java -jar target/ajigile.war
``` 

**Note:** wait until the service finish starting-up.

---
## Use Cases

1. Virus list query
   - List all the virus
        ```bash
        curl "http://localhost:8080/viruses"
        ``` 

    - Query Specific Virus (e.g. virus Id 1)
        ```bash
        curl "http://localhost:8080/viruses/1"
        ```
2. Register new Virus 
    ```bash
    curl -i -X POST -H "Content-Type:application/json" \
    -d '{"name":"T-virus", "label": "Zombie Virus"}' \
    http://localhost:8080/viruses
    ```
    Verify if the new virus has been successfully inserted
    ```bash
    curl "http://localhost:8080/viruses"
    curl "http://localhost:8080/viruses/10"
    ``` 
   
3. Register new Company that produce vaccines
   ```bash
    curl -X POST -H "Content-Type:application/json" \
    -d '{"name": "Umbrella", "mainAddress": "Raccoon City"}' \
    "http://localhost:8080/companies"
    ```
    Verify if the new company has been successfully inserted
    ```bash
    curl "http://localhost:8080/companies"
    curl "http://localhost:8080/companies/11"
    ``` 
4. Register new Vaccine that produced by new Company (point. 3) for New Virus (point. 2)
   ```bash
    curl -X POST -H "Content-Type:application/json" \
    -d '{"name": "U-1", "label": "Anti-Zombie", "company": "http://localhost:8080/companies/11", "virus": "http://localhost:8080/viruses/10"}' \
    "http://localhost:8080/vaccines"
    ```
   Verify if the new vaccine has been successfully inserted and associated with Company (point. 3) and Virus (point. 2)
   ```bash
   curl "http://localhost:8080/vaccines/12"
   ``` 
5. Delete company (associated vaccines will be automatically deleted)
   ```bash
    curl -X DELETE http://localhost:8080/companies/10
    ```   
   Verify if the vaccine associated with company id 12 also removed
   ```bash
    curl "http://localhost:8080/vaccines/12"
   ``` 
6. List of REST APIs can be queried using following command 
   ```bash
    curl http://localhost:8080
    ```   
---
## Reference
Requirement:

![alt text][logo]

[logo]: snapshot.jpg "Requirement chat"

