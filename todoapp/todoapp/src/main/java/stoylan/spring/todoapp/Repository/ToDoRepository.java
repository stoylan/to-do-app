package stoylan.spring.todoapp.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import stoylan.spring.todoapp.Domain.ToDo;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {

}
