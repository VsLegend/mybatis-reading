package mybatisreading.service.impl;

import mybatisreading.domain.Subjects;
import mybatisreading.mapper.SubjectsMapper;
import mybatisreading.service.SubjectsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Subjects)表服务实现类
 *
 * @author makejava
 * @since 2022-10-24 14:12:35
 */
@Service("subjectsService")
public class SubjectsServiceImpl implements SubjectsService {
    @Resource
    private SubjectsMapper subjectsMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Subjects queryById(Integer id) {
        return this.subjectsMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Subjects> queryAllByLimit(int offset, int limit) {
        return this.subjectsMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param subjects 实例对象
     * @return 实例对象
     */
    @Override
    public Subjects insert(Subjects subjects) {
        this.subjectsMapper.insert(subjects);
        return subjects;
    }

    /**
     * 修改数据
     *
     * @param subjects 实例对象
     * @return 实例对象
     */
    @Override
    public Subjects update(Subjects subjects) {
        this.subjectsMapper.update(subjects);
        return this.queryById(subjects.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.subjectsMapper.deleteById(id) > 0;
    }
}