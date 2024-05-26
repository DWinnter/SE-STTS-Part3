package Backend.dao;

import Backend.entity.Course;
import Backend.entity.Plan;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@Repository
public interface PlanDao{

    @Select("select * from plan where Student_id = #{Student_id}")
    List<Plan> findByStudentId(@Param("Student_id")int student_id);

    @Insert("insert into plan(Student_id, Course_id) VALUE (#{Student_id},#{Course_id})")
    void addPlan(@Param("Student_id")int Student_id,@Param("Course_id")int Course_id);

    @Delete("delete from plan where Student_id = #{Student_id} and Course_id = #{Course_id}")
    void deletePlan(@Param("Student_id")int Student_id,@Param("Course_id")int Course_id);
}
