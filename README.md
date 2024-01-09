Frontend (React)
# Task Management System - Frontend

This is the frontend part of a Task Management System, developed using React. It allows users to interact with the backend API for managing tasks, including creating, reading, updating, and deleting tasks.

## Features

- Display tasks
- Add new tasks
- Update existing tasks
- Delete tasks
- Mark completion of tasks

## Technologies Used

- React
- Axios (for API communication)

## Getting Started

1. Clone the repository:

   ```bash
   git clone <repository-url>

    Navigate to the frontend directory:

    bash

cd frontend

Install dependencies:

bash

npm install

Start the development server:

bash

    npm start

    This will launch the application on http://localhost:3000.

Configuration

Update the src/services/TaskService.js file with the correct backend API URL:

jsx

const API_URL = 'http://localhost:8080/api/tasks';

# Task Management System - Backend

This is the backend part of a Task Management System, developed using Spring Boot. It provides RESTful API endpoints for managing tasks, including creating, reading, updating, and deleting tasks. It is designed to work with a relational database (e.g., MySQL).

## Technologies Used

- Spring Boot
- Spring Data JPA
- MySQL Database

## Getting Started

1. Clone the repository:

   ```bash
   git clone <repository-url>

    Navigate to the backend directory:

    bash

cd backend

Configure the database:

Update the src/main/resources/application.yml file with your database configuration:

yaml

datasource:
  url: jdbc:mysql://localhost:3306/jpa
  username: gowtham
  password: 1212
  driver-class-name: com.mysql.cj.jdbc.Driver

jpa:
  hibernate:
    ddl-auto: update
  show-sql: true

Build and run the application:

bash

    ./mvnw spring-boot:run

    The backend server will start on http://localhost:8080.

Database Setup

    The application uses JPA/Hibernate for database interactions.
    The database schema will be automatically created based on the entity classes.
