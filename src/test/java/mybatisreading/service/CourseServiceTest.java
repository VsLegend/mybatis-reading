package mybatisreading.service;

import mybatisreading.domain.Course;
import mybatisreading.domain.query.CourseQuery;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseServiceTest {

    @Resource
    CourseService courseService;

    @Test
    void insert() {
        Course course = new Course();
        course.setName("course 1");
        course.setClassId(1L);
        Long insert = courseService.insert(course);
    }

    @Test
    void select() {
        Course course = courseService.select(1L);
        System.out.println(course);
    }

    @Test
    void getPageList() {
        CourseQuery query = new CourseQuery();
        query.setType("1");
        List<Course> pageList = courseService.getPageList(query);
        System.out.println(pageList);
    }
}