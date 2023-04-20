package com.geekster.todo.controller;

import com.geekster.todo.model.Todo;
import com.geekster.todo.service.ITodoService;
//import com.geekster.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/todo-app")
public class TodoController {
@Autowired
 private ITodoService todoService;//1st method
//@Autowired
//public TodoController(TodoService todoService){  //Dependency Injection 2nd method
//    this.todoService=todoService;
//}
//todoService.todos = new ArrayList<>();//and import arraylist, make arraylist private in service

//    public void setTodoService(TodoService todoService){ //3rd way by using setter (DI)
//        this.todoService = todoService;
//    }
   @PostMapping("/add-todo")
    public void addTodo(@RequestBody Todo todo){
        todoService.addTodo(todo);
    }
    @GetMapping("/find-todo/id/{id}")
    public Todo FindTodoById(@PathVariable int id){
        return todoService.findById(id);
    }
    @GetMapping("/findAll")
    public List<Todo> findAllTodos() {
       return todoService.findAll();
    }
    //@RequestMapping(value="url",method=RequestMethod.Put)
    @PutMapping("update-todo/id/{id}")
    public void updateTodo(@PathVariable int id, @RequestBody Todo todo) {
      todoService.updateTodo(id,todo);
    }
    @DeleteMapping("delete-todo/id/{id}")
    public ResponseEntity<Todo> deleteTodo(@PathVariable int id) {
       todoService.deletetodo(id);
       return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
