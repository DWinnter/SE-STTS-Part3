package Backend.contoller;

import Backend.common.Result;
import Backend.entity.Management;
import Backend.service.ManagementService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/course/management")
public class ManagementController {

    @Resource
    private ManagementService managementService;

    @PostMapping("/update")
    public Result update(Integer StudentId, Integer ClassId, HttpServletRequest request) {
        managementService.update(StudentId,ClassId);
        return Result.success();
    }

    @GetMapping("/settings")
    public Result getTime() {
        Date[] settings = managementService.getSettings();
        return Result.success(settings);
    }

    @PutMapping("/settings")
    public Result setTime(String start_time,String end_time,HttpServletRequest request) {
        SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date start,end;
        try {
            start = DateFormat.parse(start_time);
            end = DateFormat.parse(end_time);
        } catch (Exception e) {
            start = null;
            end = null;
            return Result.format_error();
        }
        managementService.setTime(start,end);
        return Result.success();
    }
}
