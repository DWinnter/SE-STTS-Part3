package Backend.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnrollDao {
    @Insert("insert into enroll(Student_id, Class_id, State) VALUE (#{Student_id},#{CLass_id},1)")
    void enrollClass(@Param("Student_id")int Student_id,@Param("Class_id") int Class_id);

    @Update("update enroll set State = 0 where Student_id = #{Student_id} and Class_id = #{Class_id}")
    void dropClass(@Param("Student_id")int Student_id,@Param("Class_id") int Class_id);

    @Select("SELECT Class_id from enroll where Student_id = #{Student_id} and State = 1")
    int[] findByStudentId(@Param("Student_id")int Student_id);

    @Select("SELECT * from class where id = #{id}")
    Class findClassById(@Param("id")int Class_id);
}
