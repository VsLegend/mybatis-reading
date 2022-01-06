package mybatisreading.service;

import mybatisreading.domain.Course;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

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
    }
}