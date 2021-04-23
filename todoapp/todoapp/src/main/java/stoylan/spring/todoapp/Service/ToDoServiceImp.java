package stoylan.spring.todoapp.Service;

import org.springframework.stereotype.Service;
import stoylan.spring.todoapp.Domain.ToDo;
import stoylan.spring.todoapp.Repository.ToDoRepository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class ToDoServiceImp implements ToDoService {

    private final ToDoRepository toDoRepository;

    public ToDoServiceImp(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    @Override
    public Set<ToDo> getToDo() {
        Set<ToDo> toDoSet = new HashSet<>();
        toDoRepository.findAll().iterator().forEachRemaining(toDoSet::add);

        return toDoSet;
    }

    @Override
    public ToDo getToDoByid(Long id) {
        Optional<ToDo> toDoOptional = toDoRepository.findById(id);
        ToDo toDo = toDoOptional.get();
        return toDo;
    }
}
