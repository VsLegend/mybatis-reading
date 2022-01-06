package mybatisreading.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Wang junwei
 * @since 2022-01-06
 */
@Data
@Schema(description = "课程表dto")
public class CourseDto implements Serializable {
    private static final long serialVersionUID = -54577883466574989L;

    @Schema(description = "id")
    private Long id;

    @Schema(description = "课程名字")
    private String name;

    private Long classId;

    private String type;


}

