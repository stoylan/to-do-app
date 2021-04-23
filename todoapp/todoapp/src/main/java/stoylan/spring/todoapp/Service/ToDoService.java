package stoylan.spring.todoapp.Service;

import stoylan.spring.todoapp.Domain.ToDo;

import java.util.Set;

public interface ToDoService  {
    Set<ToDo> getToDo();
    ToDo getToDoByid(Long id);

}
