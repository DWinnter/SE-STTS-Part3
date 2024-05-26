package Backend.contoller;

import Backend.common.Result;
import Backend.entity.Course;
import org.springframework.web.bind.annotation.*;
import Backend.service.PlanService;
import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/course/plan")
public class PlanController {

    @Resource
    private PlanService planService;

    //返回培养方案，其实就是返回课程列表
    @GetMapping("/show")
    public Result  showPlan(int Student_id) {
        List<Course> courselist = planService.showPlan(Student_id);
        return Result.success(courselist);
    }

    @PostMapping ("/add")
    public Result addPlan(int Student_id,int Course_id) {
        planService.addPlan(Student_id,Course_id);
        return Result.success();
    }

    @DeleteMapping("/delete")
    public  Result deletePlan(int Student_id,int Course_id) {
        planService.deletePlan(Student_id,Course_id);
        return Result.success();
    }


}
