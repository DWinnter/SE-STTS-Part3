package Backend.contoller;

import Backend.common.Result;
import Backend.entity.Course;
import Backend.service.CourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Resource
    private CourseService courseService;

    //查询课程时,因为课程编号是唯一的，所以如果用编号查询结果唯一
    @GetMapping("/list")
    public Result getCourseList(int course_id,int method) {
        Course course = courseService.GetById(course_id);
        return Result.success(course);
    }

    @GetMapping("/list")
    public Result getCourseList(String Name,int method) {
        List<Course> courseList = courseService.GetByName(Name,method);
        return Result.success(courseList);
    }


}
