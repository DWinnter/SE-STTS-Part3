package Backend.service;

import Backend.dao.CourseDao;
import Backend.entity.Course;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.NavigableMap;

@Service
public class CourseService {
    @Resource
    private CourseDao courseDao;

    public Course GetById(int Course_id) {
        return courseDao.findByCourseId(Course_id);
    }

    public List<Course> GetByName(String Name,int method) {
        if(method == 2) {
            return courseDao.findByCourseName(Name);
        } else if(method == 3) {
            return courseDao.findByTeacher(Name);
        } else {
            return null;
        }
    }


}
