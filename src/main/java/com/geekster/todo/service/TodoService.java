package com.geekster.todo.service;

import com.geekster.todo.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;




@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();// In memory database
    private static int todoCount = 0;
    static{
        todos.add(new Todo(++todoCount, "Learn Spring Boot", false));
        todos.add(new Todo(++todoCount, "Grocery Store", false));
        todos.add(new Todo(++todoCount, "Learn Aws", false));
        todos.add(new Todo(++todoCount, "Swimming", false));
        todos.add(new Todo(++todoCount, "Yoga", false));
    }
    public List<Todo> findAll(){
        return todos;
    }
}
