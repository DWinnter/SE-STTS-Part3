package Backend.entity;

public class Plan {
    int Plan_id;
    int Student_id;
    int Course_id;

    public Plan(int plan_id, int student_id, int course_id) {
        Plan_id = plan_id;
        Student_id = student_id;
        Course_id = course_id;
    }

    public Plan(int student_id, int course_id) {
        Student_id = student_id;
        Course_id = course_id;
    }

    public int getPlan_id() {
        return Plan_id;
    }

    public void setPlan_id(int plan_id) {
        Plan_id = plan_id;
    }

    public int getCourse_id() {
        return Course_id;
    }

    public void setCourse_id(int course_id) {
        Course_id = course_id;
    }

    public int getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(int student_id) {
        Student_id = student_id;
    }
}
