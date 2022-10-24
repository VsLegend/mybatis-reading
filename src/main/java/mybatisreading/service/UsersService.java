package mybatisreading.service;

import mybatisreading.domain.Users;
import mybatisreading.domain.dto.StatDTO;

import java.util.List;
import java.util.Map;

/**
 * (Users)表服务接口
 *
 * @author makejava
 * @since 2022-10-24 14:12:35
 */
public interface UsersService {

    /**
     * 动态表格
     * @return
     */
    StatDTO table();

}