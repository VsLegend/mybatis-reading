package mybatisreading.controller;

import mybatisreading.domain.Users;
import mybatisreading.domain.dto.StatDTO;
import mybatisreading.service.UsersService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Users)表控制层
 *
 * @author makejava
 * @since 2022-10-24 14:12:35
 */
@RestController
@RequestMapping("users")
public class UsersController {

    @Resource
    private UsersService usersService;

    /**
     * 通过主键查询单条数据
     */
    @GetMapping("table")
    public StatDTO table() {
        return this.usersService.table();
    }

}