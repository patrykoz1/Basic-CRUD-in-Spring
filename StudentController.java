package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@Controller
//@RequestMapping("")
public class StudentController {
    @Autowired
    private Service studentService;

    @GetMapping(value = "/")
    public Collection<Student> getAllStudents(){
        return studentService.getAll();
    }

    @PostMapping(value = "/add",consumes = "application/json")
    public void addStudent(@RequestBody Student student){ studentService.addStudent(student); }

    @DeleteMapping(value = "/del{id}")
    public void delStudent(@RequestBody Integer id){studentService.delStudent(id);
        }
    @GetMapping(value = "/stronka")
    public String stronka(){
        return "sx";
    }
}
