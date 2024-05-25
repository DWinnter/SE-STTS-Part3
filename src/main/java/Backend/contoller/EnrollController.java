package Backend.contoller;

import Backend.common.Result;
import Backend.service.EnrollService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/course")
public class EnrollController {

    @Resource
    private EnrollService enrollService;

    @PostMapping("/enroll")
    public Result enroll(int Student_id,int Class_id) {
        enrollService.enroll(Student_id,Class_id);
        return Result.success();
    }

    @DeleteMapping("/drop")
    public Result drop(int Student_id,int Class_id) {
        enrollService.drop(Student_id,Class_id);
        return Result.success();
    }

    @GetMapping("/status")
    public Result status(int Student_id) {
        List<Class> classList = enrollService.status(Student_id);
        return Result.success(classList);
    }



}
