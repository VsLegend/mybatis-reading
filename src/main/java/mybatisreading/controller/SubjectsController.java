package mybatisreading.controller;

import mybatisreading.domain.Subjects;
import mybatisreading.service.SubjectsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Subjects)表控制层
 *
 * @author makejava
 * @since 2022-10-24 14:12:35
 */
@RestController
@RequestMapping("subjects")
public class SubjectsController {
    /**
     * 服务对象
     */
    @Resource
    private SubjectsService subjectsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Subjects selectOne(Integer id) {
        return this.subjectsService.queryById(id);
    }

}