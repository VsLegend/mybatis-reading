package mybatisreading.service.impl;

import mybatisreading.domain.Subjects;
import mybatisreading.domain.dto.StatDTO;
import mybatisreading.domain.query.StatQuery;
import mybatisreading.mapper.SubjectsMapper;
import mybatisreading.mapper.UsersMapper;
import mybatisreading.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * (Users)表服务实现类
 *
 * @author makejava
 * @since 2022-10-24 14:12:35
 */
@Service("usersService")
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersMapper usersMapper;

    @Resource
    private SubjectsMapper subjectsMapper;

    @Override
    public StatDTO table() {
        StatQuery query = new StatQuery();
        StatDTO statDTO = new StatDTO();
        // 查询所有科目（表头）
        Map<Integer, Subjects> subjectsMap = subjectsMapper.queryAll();
        statDTO.setHeaders(subjectsMap);

        // 设置表头参数，用作动态表头
        query.setSubjects(new ArrayList<>(subjectsMap.values()));

        // 表数据查询
        List<Map<String, Object>> contents = usersMapper.query(query);
        statDTO.setContents(contents);
        return statDTO;
    }
}