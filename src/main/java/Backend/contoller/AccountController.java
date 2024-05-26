package Backend.contoller;

import Backend.common.Result;
import Backend.entity.Account;
import Backend.service.ManagementService;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping
public class AccountController {

    @Resource
    private ManagementService managementService;

    @PostMapping("/login")
    public Result login(@RequestBody Account account, HttpServletRequest request) {

        //检验登录信息
        if (ObjectUtils.isEmpty(account.getName()) || ObjectUtils.isEmpty(account.getPassword()) || ObjectUtils.isEmpty(account.getPriority())) {
            return Result.error(404, "请完善登录信息");
        }
        //检验权限，区分学生、教师、教务管理人员
        int priority = account.getPriority();
        Account login_user = new Account();
        if (priority == 1) {
            //学生登录
        }

        if (priority == 2) {

        }

        if (priority == 3) {
            //教务管理人员登录
            login_user = managementService.login(account.getName(), account.getPassword());

        }

        //在session中存储用户信息
        request.getSession().setAttribute("user", login_user);


        return Result.success(login_user);
    }
}



