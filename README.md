# Customer Manager | Spring MVC + Thymeleaf

[![Java](https://img.shields.io/badge/Java-17-blue)](https://www.oracle.com/java/)  
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0.2-green)](https://spring.io/projects/spring-boot)  
[![Maven](https://img.shields.io/badge/Maven-4-blue)](https://maven.apache.org/)  
[![MySQL](https://img.shields.io/badge/MySQL-8-blue)](https://www.mysql.com/)  

A **full-stack web application** for managing customers, built using **Spring MVC**, **Thymeleaf**, and **MySQL**, demonstrating **clean architecture, MVC design, CRUD operations, and pagination**.  

---

## Key Highlights

- **Full CRUD Functionality**: Create, Read, Update, Delete customers with data validation.  
- **Search and Pagination**: Filter and navigate through large datasets efficiently.  
- **MVC Architecture**: Clear separation of concerns with Controller, Service, DAO layers.  
- **DTOs & Mappers**: Data transfer objects and mapping logic ensure clean API and domain separation.  
- **Responsive UI**: Built using Thymeleaf templates, Bootstrap 5, HTML5, and CSS3.  
- **Database Integration**: Fully connected to MySQL using Spring Data JPA.  

---

## Technical Skills Demonstrated

- **Backend Development**: Java, Spring MVC, Spring Data JPA, MySQL, Lombok  
- **Frontend Development**: Thymeleaf, HTML, CSS, Bootstrap  
- **Software Architecture**: MVC pattern, layered architecture, DTO mapping  
- **Version Control**: Git and GitHub for source code management  
- **Problem Solving**: Implemented search, pagination, form validation, and error handling  

---

## Project Structure
```
CustomerManager/
│
├── src/main/java/com/example/customermanager/
│   ├── controller/
│   │   └── CustomerWebController.java
│   ├── dao/
│   │   ├── entities/
│   │   │   └── Customer.java
│   │   └── repository/
│   │       └── CustomerRepository.java
│   ├── service/
│   │   ├── CustomerService.java
│   │   └── CustomerServiceImpl.java
│   ├── dto/
│   │   ├── CreateCustomerRequest.java
│   │   ├── UpdateCustomerRequest.java
│   │   └── CustomerResponse.java
│   └── mappers/
│       └── CustomerMapper.java
│
├── src/main/resources/
│   ├── templates/ -> Thymeleaf HTML templates
│   ├── static/ -> CSS, images
│   └── application.properties
│
├── pom.xml-> Maven dependencies
└── README.md
```

### Directory Descriptions

- **controller/**: Handles HTTP requests and responses
- **dao/entities/**: JPA entity classes
- **dao/repository/**: Spring Data JPA repositories
- **service/**: Business logic implementation
- **dto/**: Data Transfer Objects for API communication (Request & response objects)
- **mappers/**: Entity-DTO conversion utilities


---

## Features in Action

- **Customer Listing**: Displays a paginated list of all customers.  
- **Add Customer**: Fully validated form to add new customers.  
- **Update Customer**: Edit customer data seamlessly.  
- **Delete Customer**: Safe deletion with confirmation.  
- **Search Functionality**: Filter customers by name, email, or other fields.  
- **Pagination**: Navigate through customer pages efficiently.  

---

## Why This Project Matters

This project **demonstrates my ability to**:

- Build **maintainable, professional web applications** in Java.  
- Integrate **front-end and back-end technologies** using Spring MVC and Thymeleaf.  
- Apply **clean coding principles, DTOs, and layered architecture**.  
- Handle **real-world business requirements**, like search, pagination, and CRUD operations.  
- Work with **relational databases** using JPA and repository patterns.  

This makes it a **strong portfolio piece** for a **Java/Spring Boot developer role**.

---

## Technologies & Tools

- **Languages**: Java  
- **Frameworks**: Spring Boot, Spring MVC, Spring Data JPA  
- **Frontend**: Thymeleaf, HTML5, CSS3, Bootstrap 5  
- **Database**: MySQL  
- **Build Tool**: Maven  
- **Utilities**: Lombok, Validation API  

---

## Next Steps / Future Enhancements

- Add **REST API endpoints** for integration with other systems.  
- Implement **authentication and authorization** using Spring Security.  
- Improve **frontend UI/UX** with interactive features.  
- Add **unit and integration tests** for backend services.  

---

## Contact

- **Author**: Reda Allah Sarani  
- **GitHub**: [https://github.com/RedaSarhani]
- **Email**: sarhaniredaallah@gmail.com  




