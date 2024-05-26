package Backend.entity;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "enroll")
public class Enrollment {
    @Column(name = "Enroll_id")
    int enroll_id;
    @Column(name = "Student_id")
    int student_id;
    @Column(name = "Class_id")
    int class_id;
    @Column(name = "State")
    int state;

    public int getEnroll_id() {
        return enroll_id;
    }

    public void setEnroll_id(int enroll_id) {
        this.enroll_id = enroll_id;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
