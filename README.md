# Spring Security Web Application

A secure web application built with Spring Boot and Spring Security that demonstrates basic authentication and authorization features.

## Features

- User authentication with login form
- Role-based access control
- Protected endpoints
- Custom login page
- Secure session management

## Prerequisites

- Java 17 or higher
- Maven or Gradle
- Your favorite IDE (IntelliJ IDEA, Eclipse, VS Code)

## Getting Started

1. Clone the repository:
```bash
git clone https://github.com/aaravkakade/Spring-Auth.git
cd Spring-Auth/complete
```

2. Run the application:
```bash
./mvnw spring-boot:run
```

The application will start on `http://localhost:8080`

## Available Endpoints

- Home page: `http://localhost:8080/` or `http://localhost:8080/home`
- Login page: `http://localhost:8080/login`
- Hello page: `http://localhost:8080/hello` (protected, requires authentication)

## Default Credentials

- Username: `user`
- Password: `password`

## Project Structure

```
src/main/java/com/example/securingweb/
├── SecuringWebApplication.java    # Main application class
├── WebSecurityConfig.java         # Security configuration
└── MvcConfig.java                # MVC configuration

src/main/resources/
└── templates/
    ├── home.html                 # Home page template
    ├── login.html               # Login page template
    └── hello.html               # Protected page template
```

## Security Configuration

The application uses Spring Security with:
- Form-based authentication
- In-memory user storage (for demonstration)
- CSRF protection enabled
- Secure session management

## Technologies Used

- Spring Boot 3.3.0
- Spring Security
- Thymeleaf
- Maven/Gradle
- Java 17

## License

This project is open source and available under the MIT License. 