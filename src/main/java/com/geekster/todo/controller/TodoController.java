package com.geekster.todo.controller;

import com.geekster.todo.model.Todo;
import com.geekster.todo.service.TodoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/todo-app")
public class TodoController {

 private final TodoService todoService;
 public TodoController(TodoService todoService){
  this.todoService = todoService;
 }
   @PostMapping
    public void addTodo(@RequestBody Todo todo){

    }
    @GetMapping
    public Todo FindTodoById(@PathVariable int id){
        return null;
    }
    @GetMapping("/findAll")
    public List<Todo> findAllTodos() {
       return todoService.findAll();
    }
    //@RequestMapping(value="url",method=RequestMethod.Put)
    @PutMapping
    public void updateTodo() {

    }
    @DeleteMapping
    public void deleteTodo(@PathVariable int id) {

    }
}
