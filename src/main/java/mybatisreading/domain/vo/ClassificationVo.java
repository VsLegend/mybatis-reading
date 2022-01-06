package mybatisreading.domain.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Wang junwei
 * @since 2022-01-06
 */
@Data
@Schema(description = "分类表vo")
public class ClassificationVo implements Serializable {
    private static final long serialVersionUID = -69376457942422070L;

    @Schema(description = "id")
    private Long id;

    @Schema(description = "分类名")
    private String className;


}

