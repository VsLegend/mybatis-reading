package mybatisreading.service.impl;

import mybatisreading.mapper.CourseMapper;
import mybatisreading.domain.Course;
import mybatisreading.domain.dto.CourseDto;
import mybatisreading.domain.vo.CourseVo;
import mybatisreading.domain.query.CourseQuery;
import mybatisreading.service.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Wang junwei
 * @since 2022-01-06
 */
@Service("courseService")
public class CourseServiceImpl implements CourseService {

    @Resource
    private CourseMapper courseMapper;


    @Override
    public Long insert(Course course) {
        return courseMapper.insert(course);
    }

    @Override
    public Course select(Long id) {
        return courseMapper.select(id);
    }

    @Override
    public List<Course> getPageList(CourseQuery query) {
        return courseMapper.getPageList(query);
    }

}
