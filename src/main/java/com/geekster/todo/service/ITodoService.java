package com.geekster.todo.service;

import com.geekster.todo.model.Todo;

import java.util.List;
import java.util.function.Predicate;

public interface ITodoService {
    public List<Todo> findAll();

    //{
//        return todos;
//    }
    public Todo findById(int id);


    //{
//        //to be written (lambda expression)
//        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
//        Todo todo = todos.stream().filter(predicate).findFirst().get();
//        return todo;
//    }
    public void addTodo(Todo todo);


    //{
//        todos.add(todo);
//    }
    public void deletetodo (int id);



    //{
//        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
//        todos.removeIf(predicate);
//    }
    public void updateTodo(int id, Todo newtodo);


    //{
//        Todo todo = findById(id);//step1 findtodo to be update
//
//        todo.setId(newtodo.getId());
//        todo.setTitle(newtodo.getTitle());
//        todo.setStatus(newtodo.isStatus());
//    }
}
