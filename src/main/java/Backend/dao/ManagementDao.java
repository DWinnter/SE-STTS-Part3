package Backend.dao;

import Backend.entity.Enrollment;
import Backend.entity.Management;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.*;

import java.sql.Timestamp;
import java.util.Date;

@Repository
public interface ManagementDao extends Mapper<Management> {
    @Select("select * from management where name = #{name} and password = #{password}")
    Management findByNameAndPassword(@Param("name")String name, @Param("password")String password);

    //在补选前应该先查看是否已经选上这门课，如果选上了就不需要再补选
    @Select("select * from enroll where Student_id = #{student_id} and Class_id = #{class_id} and State = 1")
    Enrollment CheckIfHaveSelected(@Param("Student_id")Integer student_id,@Param("Class_id")Integer class_id);

    @Insert("insert into enroll(Student_id, Class_id, State) value (#{Student_id},#{Class_id},1)")
    void updateByStudentIdAndClassId(@Param("Student_id")Integer student_id,@Param("Class_id")Integer class_id);

    //取得最新的一条数据，来读取当前所设置的选课时间
    @Select(" select * from management order by id desc limit 0,1 ;")
    Management getNewestManagement();

    @Update("update management set start_time = #{start_time},end_time = #{end_time}")
    void setTime(@Param("start_time")Timestamp start_time,@Param("end_time") Timestamp end_time);
}

