# TodoApp
- TodoApp is a simple RESTful API for managing Todo items. It allows users to add, retrieve, update, and delete Todo items through a set of API endpoints.
---

### Technologies Used
``` 
* Java
* Spring Boot
* Spring Data JPA
* H2 Database
*SpringDoc for API documentation
* Hibernate Validator
* Lombok
```
---

### Installation

- git clone `<repository-url>`
---
## Navigate to the project directory:

- `cd todo-app`
---
### Build the application using Maven:

- mvn clean install
---
### Run the application:

- mvn spring-boot:run
- The application will start running on http://localhost:8080.
---
### API Endpoints
* Add Todo
```
- Endpoint: POST /api/v1/todo-app/add-todo

- This endpoint allows you to add a new Todo item.

Request Body:
{
  "id": 1,
  "title": "Finish homework",
  "status": false
}
```

* Find Todo by ID
```
-Endpoint: GET /api/v1/todo-app/find-todo/id/{id}

-This endpoint allows you to retrieve a Todo item by its ID.
```

* Find All Todos
```
Endpoint: GET /api/v1/todo-app/findAll

This endpoint allows you to retrieve all Todo items.
```
* Update Todo
```
- Endpoint: PUT /api/v1/todo-app/update-todo/id/{id}

- This endpoint allows you to update a Todo item.

Request Body:
{
  "id": 1,
  "title": "Finish homework",
  "status": true
}
```
*Delete Todo
```
-Endpoint: DELETE /api/v1/todo-app/delete-todo/id/{id}

-This endpoint allows you to delete a Todo item.
```
---
### Database
- The application uses an H2 in-memory database for storing the Todo items. The database configuration can be found in the application.properties file.
---
### Documentation

- API documentation is available using the Swagger UI. You can access it by navigating to http://localhost:8080/swagger-ui.html in your browser.
---
### License

- This project is licensed under the MIT License
