package Backend.service;

import Backend.dao.EnrollDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EnrollService {

    @Resource
    private EnrollDao enrollDao;

    public void enroll(int Student_id,int Class_id) {
        enrollDao.enrollClass(Student_id,Class_id);
    }

    public void drop(int Student_id,int Class_id) {
        enrollDao.dropClass(Student_id,Class_id);
    }

    public List<Class> status(int Student_id) {
        List<Class> classList = null;
        int[] classIdList;
        classIdList = enrollDao.findByStudentId(Student_id);
        for(int i = 0;i < classIdList.length;i ++) {
            classList.add(enrollDao.findClassById(classIdList[i]));
        }
        return classList;
    }
}
