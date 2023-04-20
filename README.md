# Todo 

- Framework: Spring Boot
- Language: Java

## Data Flow
1. Controller:
The controller receives and processes HTTP requests and manages the interactions between the client and the server.
- TodoController: responsible for handling the HTTP requests related to todo items.
2. Services:

The services handle the business logic of the application.

- TodoService: responsible for implementing the business logic related to todo items.

3. Repository:

The repository provides an interface to the database for the services to interact with. 

- TodoRepository: responsible for implementing the database operations related to todo items.

4. Data base Design:
- Todos Table: This table stores all of the todo items in the application. 
- It contains the following columns:
a) id: A unique identifier for the todo item.

b) title: The title or name of the todo item.

c) status: A boolean flag indicating whether the todo item has been completed or not.

-- Description: 

The id columns in table serve as primary keys, which ensure that each row in the table is uniquely identified.

The database design in this project follows a relational database model.

This allows for efficient storage and retrieval of data, as well as easy querying of the data using SQL.

## Data Structure:

1. Todo: This data structure represents a single todo item in the application. 
- It contains the following fields:
a) id: A unique identifier for the todo item.

b) title: The title or name of the todo item.

c) status: A boolean flag indicating whether the todo item has been completed or not.

--Description :

Data structures are used throughout the application to store and retrieve data. 

For example, when a new todo item is created, a new Todo object is instantiated and populated with the relevant data (such as the title and description), before being saved to the database via the TodoRepository.

# Project Summary:

The todo project is a web application built using Spring Boot framework and Java language. It allows users to create, read, update and delete todo items. The application also includes user authentication and authorization features. The data flow in the project follows the MVC architecture. The project uses a database with two tables and two data structures to store the information.
