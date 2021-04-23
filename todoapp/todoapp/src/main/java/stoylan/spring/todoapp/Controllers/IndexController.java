package stoylan.spring.todoapp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import stoylan.spring.todoapp.Service.ToDoService;

@Controller
public class IndexController {
    private final ToDoService toDoService;

    public IndexController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }


    @RequestMapping("/index")
    String getIndex(Model model){
        model.addAttribute("Status", toDoService.getToDo());
        return "index";
    }
}
