package stoylan.spring.todoapp.Bootstrap;

import lombok.Builder;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import stoylan.spring.todoapp.Domain.Status;
import stoylan.spring.todoapp.Domain.ToDo;
import stoylan.spring.todoapp.Repository.ToDoRepository;

@Component
@Builder
public class BootStrapData implements ApplicationListener<ContextRefreshedEvent> {

    private final ToDoRepository toDoRepository;

    public BootStrapData(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        ToDo toDo = new ToDo();
        toDo.setContent("Hello");
        toDo.setStatus(Status.COMPLETED);
        toDoRepository.save(toDo);
    }

}
