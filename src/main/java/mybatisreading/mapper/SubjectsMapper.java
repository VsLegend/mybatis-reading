package mybatisreading.mapper;

import mybatisreading.domain.Subjects;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * (Subjects)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-24 14:12:35
 */
public interface SubjectsMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Subjects queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Subjects> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    @MapKey("id")
    Map<Integer, Subjects> queryAll();

    /**
     * 新增数据
     *
     * @param subjects 实例对象
     * @return 影响行数
     */
    int insert(Subjects subjects);

    /**
     * 修改数据
     *
     * @param subjects 实例对象
     * @return 影响行数
     */
    int update(Subjects subjects);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}