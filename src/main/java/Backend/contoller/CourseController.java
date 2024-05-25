package Backend.contoller;

import Backend.common.Result;
import Backend.service.CourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Resource
    private CourseService courseService;

    @GetMapping("/list")
    public Result getCourselist(int course_id) {

    }

    @GetMapping("/list")
    public Result getCourselist(String Course_name) {

    }

    @GetMapping("/list")
    public Result getCourselist(String Teacher_name) {

    }

    @GetMapping("/list")
    public Result getCourselist(String Course_name,String Teacher_name)  {

    }
}
