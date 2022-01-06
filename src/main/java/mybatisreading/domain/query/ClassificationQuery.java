package mybatisreading.domain.query;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Wang junwei
 * @since 2022-01-06
 */
@Data
@Schema(description = "分类表查询条件")
public class ClassificationQuery implements Serializable {
    private static final long serialVersionUID = -59443116158927322L;

    @Schema(description = "id")
    private Long id;

    @Schema(description = "分类名")
    private String className;


}
