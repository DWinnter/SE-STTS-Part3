package Backend.service;

import Backend.dao.CourseDao;
import Backend.dao.PlanDao;
import Backend.entity.Plan;
import org.springframework.stereotype.Service;
import Backend.entity.Course;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class PlanService {
    @Resource
    private PlanDao planDao;
    private CourseDao courseDao;

    public List<Course> showPlan(int student_id) {
        List<Course> courses = new ArrayList<Course>();
        List<Plan> plans = planDao.findByStudentId(student_id);
        for(int i = 0; i < plans.toArray().length; i++){
            int course_id = plans.get(i).getCourse_id();
            Course course = courseDao.findByCourseId(course_id);
            courses.add(course);
        }

        return courses;
    }

    public void addPlan(int Student_id,int Course_id) {
        planDao.addPlan(Student_id,Course_id);
    }

    public void deletePlan(int Student_id,int Course_id) {
        planDao.deletePlan(Student_id,Course_id);
    }


}
