package Backend.contoller;

import Backend.common.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/course/plan")
public class PlanController {

    @Resource
    private service.PlanService planService;

    @GetMapping("/show")
    public Result  showPlan(int Student_id) {

    }

    @PostMapping ("/add")
    public Result addPlan(int Student_id,int Course_id) {

    }

    @DeleteMapping("/delete")
    public  Result deletePlan(int Student_id,int Course_id) {

    }


}
