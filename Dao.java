package hello;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class Dao {
    private static Map<Integer, Student> map ;
    private static int id;
    static {
    id = 0;
    map = new HashMap<Integer, Student>();
    map.put(id,new Student(id++,"Said","IT"));
    map.put(id,new Student(id++,"Adam","IT"));
    map.put(id,new Student(id++,"Lotus","IT"));
    map.put(id,new Student(id++,"Patrykg","Informatyka z matematyką!"));


    }
    public void addStudent(Student student){
        student.setId(id);
        this.map.put(student.getId(),student);
        id++;
    }
    public Collection<Student> getAll(){
        return map.values();
    }

    public void delStudent(int id){map.remove(id);}

}
