package mybatisreading.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import mybatisreading.domain.Course;
import mybatisreading.domain.query.CourseQuery;
import mybatisreading.service.CourseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Wang junwei
 * @since 2022-01-06
 */
@RestController
@RequestMapping("/api/course")
@Tag(name = "课程")
public class CourseController{

    @Resource
    CourseService courseService;

    @PostMapping("/select/{id}")
    @Operation(summary = "分页获取课程表")
    public Course select(@PathVariable("id") Long id) {
        return courseService.select(id);
    }

    @PostMapping("/getPageList")
    @Operation(summary = "分页获取课程表")
    public List<Course> getPageList(@RequestBody CourseQuery query) {
        return courseService.getPageList(query);
    }
}

