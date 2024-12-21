# CarManagmentSystem
CRUD Appilcation for managing cars.
This is a Spring Boot-based REST API for managing car information. It includes database integration, endpoint documentation using postman documentation, and follows a modular configuration.

## Table of Contents
1. Project Overview
2. Technologies Used
3. Setup Instructions
4. Postman Documentation
5. License

### 1. Project Overview
The Car Management API allows users to perform CRUD operations on car data. It is built using:
a. Spring Boot for application development.
b. MySQL as the relational database.
c. Postman for API documentation.

### 2. Technologies Used
1. Java 17
2. Spring Boot 3.4.1
3. MySQL 8
4. Hibernate/JPA for ORM
5. Postman for API documentation

### 3. Setup Instructions
#### Prerequisites
1. Install Java 17.
2. Install MySQL.
3. Install Maven.

#### Steps to Run the Project
1. Clone the Repository:
git clone https://github.com/alima-parveen/CarManagementSystem.git
cd car-management-api

#### Configure the Database: 
Update the application.properties file with your MySQL credentials:
properties
spring.datasource.url=jdbc:mysql://localhost:3306/cardatabase?autoReconnect=true
spring.datasource.username=<your-username>
spring.datasource.password=<your-password>
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.jpa.generate-ddl=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

#### Build the Project: 
Run the following command:
mvn clean install

#### Run the Application: 
Start the Spring Boot application:
mvn spring-boot:run

#### Verify the Application:
API Health: http://localhost:8080/api/test

### 4. Postman Documentation
The API Documentation link below:
https://documenter.getpostman.com/view/39341131/2sAYJ3F2NX

### 5. License
This project is licensed under the MIT License. See the LICENSE file for details.
