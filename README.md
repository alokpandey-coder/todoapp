# TODO Application

A simple web-based TODO application built with **Spring Boot**, **Thymeleaf**, and **Bootstrap**. The application allows users to manage their tasks by adding, toggling, and deleting them.

## Features

- Add new tasks with a title.
- Mark tasks as completed or uncompleted (toggle functionality).
- Delete tasks that are no longer needed.
- Responsive design with Bootstrap.
- Backend built with Spring Boot and Thymeleaf for template rendering.

## Tech Stack

- **Backend**: Spring Boot (MVC, Thymeleaf)
- **Frontend**: Thymeleaf, HTML5, CSS3, Bootstrap 5
- **Database**: H2 (in-memory, can be switched to any relational database)
- **Build Tool**: Maven

## Installation

Follow these steps to set up and run the project locally:

### Prerequisites

- **Java 17** or higher installed.
- **Maven** installed.
- An IDE like **IntelliJ IDEA** or **Eclipse**.

### Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/todo-application.git
2.Navigate to the project directory:
   cd todo-application
3.Run the application using Maven:
mvn spring-boot:run
4. Open your browser and visit:
    http://localhost:8080/tasks   

 Project Structure 

    src/
├── main/
│   ├── java/com/todoapp/
│   │   ├── controller/          # Handles HTTP requests
│   │   ├── module/              # Task entity definition
│   │   ├── service/             # Business logic for task management
│   │   └── repository/          # Spring Data JPA repository for database operations
│   └── resources/
│       ├── templates/           # Thymeleaf templates for the UI
│       └── application.properties # Configuration properties
└── test/                        # Unit and integration tests


Feel free to fork, contribute, and make this project your own!


### Steps to Use
1. Replace placeholders like `your-username` and `your-email@example.com` with your actual GitHub username and email.
2. Add screenshots of your project (if available) to the `Screenshots` section.
3. Include a link to the license file if applicable. 

Let me know if you need help refining it further!
