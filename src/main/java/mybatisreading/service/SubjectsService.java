package mybatisreading.service;

import mybatisreading.domain.Subjects;
import java.util.List;

/**
 * (Subjects)表服务接口
 *
 * @author makejava
 * @since 2022-10-24 14:12:35
 */
public interface SubjectsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Subjects queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Subjects> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param subjects 实例对象
     * @return 实例对象
     */
    Subjects insert(Subjects subjects);

    /**
     * 修改数据
     *
     * @param subjects 实例对象
     * @return 实例对象
     */
    Subjects update(Subjects subjects);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}