package mybatisreading.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * (Subjects)实体类
 *
 * @author makejava
 * @since 2022-10-24 14:12:35
 */
@Data
public class Subjects implements Serializable {
    private static final long serialVersionUID = -14496556922745097L;
    
    private Integer id;
    /**
    * 科目
    */
    private String name;

    public String getSubjectId() {
        return "subject" + id;
    }
}