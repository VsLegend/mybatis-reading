package mybatisreading.domain;

import java.io.Serializable;

/**
 * (Users)实体类
 *
 * @author makejava
 * @since 2022-10-24 14:12:35
 */
public class Users implements Serializable {
    private static final long serialVersionUID = 896081064414906228L;
    
    private Integer id;
    
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