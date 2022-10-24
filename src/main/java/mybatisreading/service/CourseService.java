package mybatisreading.service;

import mybatisreading.domain.Course;
import mybatisreading.domain.dto.CourseDto;
import mybatisreading.domain.vo.CourseVo;
import mybatisreading.domain.query.CourseQuery;

import java.util.List;
import java.util.Map;

public interface CourseService {

    Long insert(Course course);

    Course select(Long id);

    List<Course> getPageList(CourseQuery query);


}
