package mybatisreading.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * (Score)实体类
 *
 * @author makejava
 * @since 2022-10-24 14:12:34
 */

@Data
public class Score implements Serializable {
    private static final long serialVersionUID = -83048553084945515L;
    
    private Integer id;
    
    private Integer userId;
    
    private Integer subjectId;
    
    private Object score;

}