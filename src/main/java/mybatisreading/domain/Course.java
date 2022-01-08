package mybatisreading.domain;

import java.io.Serializable;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @author Wang junwei
 * @since 2022-01-06
 */
@Data
@Alias("aliasForCourse")
public class Course implements Serializable {
    private static final long serialVersionUID = 921259390770145711L;
    /**
     * id
     */
    private Long id;

    /**
     * 课程名字
     */
    private String name;


    private Long classId;


    private String type;


}

