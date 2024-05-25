package Backend.dao;

import Backend.entity.Course;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseDao {

    @Select("select * from course where Id = #{Id}")
    Course findByCourseId(@Param("Id")int course_id);

    @Select("select * from course where Name like '%#{Name}%'")
    List<Course> findByCourseName(@Param("Name")String Course_name);

    @Select("select * from course where Teacher like '%#{Name}%'")
    List<Course> findByTeacher(@Param("Name")String Teacher_name);

}
