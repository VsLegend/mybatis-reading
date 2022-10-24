package mybatisreading.domain.query;

import lombok.Data;
import mybatisreading.domain.Subjects;

import java.util.List;

/**
 * @Author Wang Junwei
 * @Date 2022/10/24 14:48
 * @Description
 */
@Data
public class StatQuery {

    /**
     * 科目ID 这里要使用string 数字无法作为表头名
     */
    private String subjectId;

    /**
     * 0 DESC  1 AES
     */
    private Integer sort;

    private List<Subjects> subjects;

}
