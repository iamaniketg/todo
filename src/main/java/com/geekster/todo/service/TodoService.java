package com.geekster.todo.service;

import com.geekster.todo.model.Todo;
import com.geekster.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


@Service
public class TodoService implements ITodoService{
    private static List<Todo> todos = new ArrayList<>();// In memory database
    @Autowired
    TodoRepository todoRepository;


    @Override
    public List<Todo> findAll(){
        return todoRepository.findAll();
    }
    @Override
    public Todo findById(int id){
        //to be written (lambda expression)
//        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
//        Todo todo = todos.stream().filter(predicate).findFirst().get();
//        return todo;
        return todoRepository.findById(id).get();
    }
    @Override
    public void addTodo(Todo todo){
        //todos.add(todo);
        todoRepository.save(todo);
    }
    @Override
    public void deletetodo (int id){
//        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
//        todos.removeIf(predicate);
        todoRepository.deleteById(id);
    }
    @Override
    public void updateTodo(int id, Todo newtodo){
        Todo todo = todoRepository.findById(id).get();//step1 findtodo to be update

        todo.setId(newtodo.getId());
        todo.setTitle(newtodo.getTitle());
        todo.setStatus(newtodo.isStatus());

        todoRepository.save(todo);
    }
}
