package mybatisreading.domain;

import java.io.Serializable;

import lombok.Data;

/**
 * @author Wang junwei
 * @since 2022-01-06
 */
@Data
public class Classification implements Serializable {
    private static final long serialVersionUID = 220709548557053482L;
    /**
     * id
     */
    private Long id;

    /**
     * 分类名
     */
    private String className;


}

