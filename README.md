# ShopSphere 🛒

ShopSphere is a console-based e-commerce backend built using Java, Hibernate ORM, MySQL, and Maven.

## 🚀 Technologies Used

- Java
- Hibernate ORM
- MySQL
- Maven
- IntelliJ IDEA
- Git & GitHub

## 📌 Features

- Product management
- Category management
- User and Address management
- Order management
- Order item management
- Product CRUD operations
- HQL queries
- Entity relationships
- Transactions and rollback
- DAO layer
- Service layer
- Input validation
- Custom exception handling

## 🏗️ Project Architecture

```text
Application
    ↓
Service Layer
    ↓
DAO Layer
    ↓
Hibernate ORM
    ↓
MySQL

🔗 Entity Relationships

Category 1 ──── * Product

User 1 ──── 1 Address

User 1 ──── * Orders

Orders 1 ──── * OrderItems

Product 1 ──── * OrderItems

🗂️ Project Structure

src/main/java/com/shopsphere
├── entity
├── dao
├── service
├── exception
├── util
└── Application.java

🎯 Learning Goals

This project was built to practice:
- Java backend development
- Object Relational Mapping
- Hibernate
- MySQL database operations
- Layered architecture
- Transactions
- Exception handling
- Git and GitHub
👨‍💻 Author
Somesh Varma
GitHub: https://github.com/someshvarma015


