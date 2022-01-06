package mybatisreading.mapper;

import mybatisreading.domain.Course;
import mybatisreading.domain.PublicCourse;
import mybatisreading.domain.ProfessionCourse;
import mybatisreading.domain.query.CourseQuery;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 课程表(Course)表数据库访问层
 *
 * @author makejava
 * @since 2022-01-06 12:16:48
 */
@Mapper
public interface CourseMapper {

    /**
     * 条件查询
     *
     * @param query
     * @return
     */
    List<Course> getPageList(CourseQuery query);

    Long insert(Course course);

    @TypeDiscriminator(column = "type", javaType = String.class, cases = {
            @Case(value = "1", type = PublicCourse.class),
            @Case(value = "2", type = ProfessionCourse.class),
    }
    )
    @Results(id = "id", value = {
            @Result(property = "id", column = "id", id = true),
            @Result(property = "name", column = "name"),
            @Result(property = "classId", column = "class_id"),
            @Result(property = "type", column = "type"),
    })
    @Select("select * from course where id = #{id}")
    Course select(Long id);
}

