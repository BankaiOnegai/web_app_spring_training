package fr.lernejo.todo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TodoListController {
    ArrayList<Todo> todoList = new ArrayList<>();

    @PostMapping(value = "/api/todo")
    public void addList(@RequestParam("message") String message, @RequestParam("author") String author){
        this.todoList.add(new Todo(message, author));
        System.out.println(todoList);
    }

    @GetMapping(value = "/api/todo")
    public @ResponseBody
    ArrayList<Todo> getList(){
        return this.todoList;
    }
}
