package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private Dao dao;
    @GetMapping("/")
    public Collection<Student> getAll(){
        return this.dao.getAll();
    }
    @PostMapping(value = "/add")
    public void addStudent( Student student){this.dao.addStudent(student);}
    @DeleteMapping(value = "/del")
    public void delStudent(int id){dao.delStudent(id);}

}
