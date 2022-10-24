package mybatisreading.controller;

import mybatisreading.domain.Score;
import mybatisreading.service.ScoreService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Score)表控制层
 *
 * @author makejava
 * @since 2022-10-24 14:12:34
 */
@RestController
@RequestMapping("score")
public class ScoreController {
    /**
     * 服务对象
     */
    @Resource
    private ScoreService scoreService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Score selectOne(Integer id) {
        return this.scoreService.queryById(id);
    }

}