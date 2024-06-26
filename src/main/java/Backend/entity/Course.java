package Backend.entity;

public class Course {
    private int id;

    private String name;

    private String teacher;

    private String description;

    public Course(int id, String name,String teacher, String description) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.description = description;
    }

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
