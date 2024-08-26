
# Micro-address-service-api

## Project Overview

The Micro Address Service API is a microservice developed using Java and Spring Boot. It is part of a broader microservices architecture that manages address-related operations. The service provides CRUD (Create, Read, Update, Delete) functionalities for addresses, making it a crucial component of any system that requires geographical data management.

## Key Features

- **RESTful API**: Exposes endpoints for address operations.
- **Microservices Architecture**: Designed to work within a distributed system.
- **Spring Boot**: Utilizes Spring Boot for rapid development and deployment.
- **MySQL Database Integration**: Stores and manages address data in a relational database.

## Technologies Used

- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **MySQL**
- **Maven**

## Project Structure and Code Explanation

1. **Controller Layer**:
   - Exposes REST endpoints to handle HTTP requests related to address management.
   ```java
   @RestController
   @RequestMapping("/api/v1/addresses")
   public class AddressController {
       // CRUD endpoints
   }
   ```

2. **Service Layer**:
   - Contains the business logic for address operations.
   ```java
   @Service
   public class AddressService {
       // Logic for creating, updating, retrieving, and deleting addresses
   }
   ```

3. **Repository Layer**:
   - Uses Spring Data JPA to interact with the MySQL database.
   ```java
   public interface AddressRepository extends JpaRepository<Address, Long> {
       // Repository for address data operations
   }
   ```

## How to Run the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/MalingaBandara/Micro-address-service-api.git
   ```
2. Set up the MySQL database and update the `application.properties` with your configurations.
3. Run the application using Maven:
   ```bash
   mvn spring-boot:run
   ```

## API Endpoints

- **POST /api/v1/addresses**: Create a new address.
- **GET /api/v1/addresses**: Retrieve all addresses.
- **GET /api/v1/addresses/{id}**: Retrieve a specific address by ID.
- **PUT /api/v1/addresses/{id}**: Update an address.
- **DELETE /api/v1/addresses/{id}**: Delete an address.

## Purpose and Future Enhancements

This microservice was developed as part of a learning project to explore microservices architecture and RESTful API development. Future enhancements could include adding validation, caching mechanisms, and integrating with other microservices like User or Order services.

## License

This project is licensed under the MIT License.
