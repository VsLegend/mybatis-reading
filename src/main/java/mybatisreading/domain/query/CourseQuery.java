package mybatisreading.domain.query;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Wang junwei
 * @since 2022-01-06
 */
@Data
@Schema(description = "课程表查询条件")
public class CourseQuery implements Serializable {
    private static final long serialVersionUID = -83704355844591704L;

    @Schema(description = "id")
    private Long id;

    @Schema(description = "课程名字")
    private String name;

    private Long classId;

    private String type;


}
