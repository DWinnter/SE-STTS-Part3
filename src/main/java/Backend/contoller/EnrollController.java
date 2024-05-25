package Backend.contoller;

import Backend.common.Result;
import Backend.service.EnrollService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/course")
public class EnrollController {

    @Resource
    private EnrollService enrollService;

    @PostMapping("/enroll")
    public Result enroll(int Student_id,int Course_id) {

    }

    @DeleteMapping("/drop")
    public Result drop(int Student_id,int Course_id) {

    }

    @GetMapping("/status")
    public Result status(int Student_id) {

    }



}
