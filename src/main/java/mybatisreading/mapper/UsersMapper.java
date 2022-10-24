package mybatisreading.mapper;

import mybatisreading.domain.Users;
import mybatisreading.domain.query.StatQuery;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * (Users)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-24 14:12:35
 */
public interface UsersMapper {


    List<Map<String, Object>> query(StatQuery query);
}