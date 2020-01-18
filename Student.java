package hello;

public class Student {
    private int id;
    private String name;
    private String course;

    public int getId() {
        return id;
    }
    public void setId(int id) {
         this.id=id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
    public Student( String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
    public Student( ) {

    }
}
