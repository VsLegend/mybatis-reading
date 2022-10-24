package mybatisreading.domain;

import java.io.Serializable;

/**
 * (Subjects)实体类
 *
 * @author makejava
 * @since 2022-10-24 14:12:35
 */
public class Subjects implements Serializable {
    private static final long serialVersionUID = -14496556922745097L;
    
    private Integer id;
    /**
    * 科目
    */
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}