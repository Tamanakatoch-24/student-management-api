# Student Management API

A RESTful Student Management System built using Spring Boot, Spring Data JPA, and MySQL.

## Features

* Create Student
* Get All Students
* Get Student By ID
* Update Student
* Delete Student
* Search Students By Course
* Global Exception Handling
* Proper HTTP Status Codes

## Tech Stack

* Java 17+
* Spring Boot
* Spring Data JPA
* MySQL
* Maven

## Project Structure

```text
src
├── main
│   ├── java
│   │   └── com.example.student_management
│   │       ├── controller
│   │       ├── entity
│   │       ├── exception
│   │       ├── repository
│   │       ├── service
│   │       └── StudentManagementApplication.java
│   └── resources
│       └── application.properties
```

## Database Configuration

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Database Setup

```sql
CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE students (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    course VARCHAR(100),
    age INT
);
```

## Run the Application

Clone the repository:

```bash
git clone https://github.com/Tamanakatoch-24/student-management-api.git
```

Navigate to the project:

```bash
cd student-management-api
```

Build the project:

```bash
mvn clean install
```

Run the application:

```bash
mvn spring-boot:run
```

Application runs on:

```text
http://localhost:8080
```

## API Endpoints

### Create Student

```http
POST /students
```

### Get All Students

```http
GET /students
```

### Get Student By ID

```http
GET /students/{id}
```

### Update Student

```http
PUT /students/{id}
```

### Delete Student

```http
DELETE /students/{id}
```

### Search Students By Course

```http
GET /students/search?course=CSE
```

## HTTP Status Codes

| Status Code | Description           |
| ----------- | --------------------- |
| 200         | OK                    |
| 201         | Created               |
| 204         | No Content            |
| 404         | Not Found             |
| 500         | Internal Server Error |

## Author

**Tamana Katoch**

GitHub: https://github.com/Tamanakatoch-24
