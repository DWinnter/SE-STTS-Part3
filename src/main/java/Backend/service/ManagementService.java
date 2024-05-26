package Backend.service;

import Backend.dao.ManagementDao;
import Backend.entity.Account;
import Backend.entity.Enrollment;
import Backend.entity.Management;
import Backend.exception.CustomException;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import tk.mybatis.mapper.common.*;
import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;

@Service
public class ManagementService {
    @Resource
    private ManagementDao managementDao;

    public Account login(String username, String password) {
        //在数据库中查找用户名和密码
        Management management = managementDao.findByNameAndPassword(username,password);
        if(ObjectUtils.isEmpty(management)) {
            throw new CustomException(0,"Invalid username or password or character");
        }
        return management;
    }

    public void update(Integer student_id,Integer class_id) {
        Enrollment enrollment = managementDao.CheckIfHaveSelected(student_id,class_id);
        //如果查询结果为空，也就代表这门课没被选上，因此可以补选
        if(ObjectUtils.isEmpty(enrollment)) {
            managementDao.updateByStudentIdAndClassId(student_id, class_id);
        }
    }

    public Date[] getSettings() {
        Management management = managementDao.getNewestManagement();
        Date[] settings = new Date[]{management.getStart_time(),management.getEnd_time()};

        return settings;
    }

    public void setTime(Date start_time,Date end_time) {
        Timestamp start = new Timestamp(start_time.getTime());
        Timestamp end = new Timestamp(end_time.getTime());
        managementDao.setTime(start,end);
    }

//    public Management findById(long id) {
//        return ManagementDao.selectByPrimaryKey(id);
//    }
}
