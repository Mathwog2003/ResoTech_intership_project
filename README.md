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
