package mybatisreading.mapper;

import mybatisreading.domain.Classification;
import mybatisreading.domain.query.ClassificationQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 分类表(Classification)表数据库访问层
 *
 * @author makejava
 * @since 2022-01-06 12:16:47
 */
@Mapper
public interface ClassificationMapper {

    /**
     * 条件查询
     *
     * @param query
     * @return
     */
    List<Classification> getPageList(ClassificationQuery query);

}

