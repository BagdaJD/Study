В случае чего смотреть на Spring.
Пример:
![[Pasted image 20260312132119.png]]

### Controller
```java
//Controller  
package org.example.todo.controller;  
  
import org.example.todo.model.TodoTask;  
import org.example.todo.service.TodoService;  
import org.springframework.http.ResponseEntity;  
import org.springframework.web.bind.annotation.*;  
  
import java.util.List;  
  
@RestController // Говорим Spring: "Это контроллер, который будет возвращать JSON"  
@RequestMapping("/api/todos") // Базовый URL для всех эндпоинтов в этом классе  
public class TodoController {  
  
    private final TodoService todoService;  
  
    // Внедрение зависимости (Dependency Injection) через конструктор.  
    // Spring сам найдет TodoService и передаст его сюда.    public TodoController(TodoService todoService) {  
        this.todoService = todoService;  
    }  
    // Обработка GET-запроса по адресу /api/todos  
    @GetMapping  
    public List<TodoTask> getAllTasks() {  
        // Просим сервис отдать все задачи  
        return todoService.getAllTasks();  
    }  
    @GetMapping("/{id}")  
    ResponseEntity<TodoTask> getTaskById(@PathVariable Long id){  
//        for(TodoTask task : todoService.getAllTasks()){  
//            if(task.getId().equals(id)){  
//                return Optional.of(task);  
//            }  
//        }  
//        return Optional.empty();  
        return todoService.getById(id)  
                .map(task -> ResponseEntity.ok(task))  
                .orElse(ResponseEntity.notFound().build());  
    }  
    // Обработка POST-запроса по адресу /api/todos  
    @PostMapping  
    public TodoTask createTask(@RequestBody String title) {  
        // @RequestBody берет данные из "тела" HTTP-запроса  
        // и передает их в наш метод        return todoService.addTask(title);  
    }}
```
### Service 
```java
//Service относится также к Model  
package org.example.todo.service;  
  
import org.example.todo.model.TodoTask;  
import java.util.ArrayList;  
import java.util.List;  
import java.util.Optional;  
import java.util.concurrent.atomic.AtomicLong;  
import org.springframework.stereotype.Service;  
  
@Service // Говорим Спрингу: "Возьми этот класс под управление"  
public class TodoService {  
    // Наше временное хранилище в памяти  
    private final List<TodoTask> tasks = new ArrayList<>();  
    // Счетчик для генерации ID  
    private final AtomicLong counter = new AtomicLong();  
  
    public List<TodoTask> getAllTasks() {  
        return tasks;  
    }  
    public TodoTask addTask(String title) {  
        TodoTask newTask = new TodoTask(counter.incrementAndGet(), title, false);  
        tasks.add(newTask);  
        return newTask;  
    }  
    public Optional<TodoTask> getById(Long id){  
        return tasks.stream()  
                    .filter(task -> task.getId().equals(id))  
                    .findFirst();  
    }}
```
### Model
```java
//Model  
package org.example.todo.model;  
  
public class TodoTask {  
    private Long id;  
    private String title;  
    private boolean completed;  
  
    // Конструктор  
    public TodoTask(Long id, String title, boolean completed) {  
        this.id = id;  
        this.title = title;  
        this.completed = completed;  
    }  
    // Геттеры и сеттеры (нужны, чтобы Spring мог прочитать данные и превратить их в JSON)  
    public Long getId() { return id; }  
    public void setId(Long id) { this.id = id; }  
  
    public String getTitle() { return title; }  
    public void setTitle(String title) { this.title = title; }  
  
    public boolean isCompleted() { return completed; }  
    public void setCompleted(boolean completed) { this.completed = completed; }  
}

//main(Application)
package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
```