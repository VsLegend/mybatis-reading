package mybatisreading.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * (Users)实体类
 *
 * @author makejava
 * @since 2022-10-24 14:12:35
 */

@Data
public class Users implements Serializable {
    private static final long serialVersionUID = 896081064414906228L;
    
    private Integer id;
    
    private String name;

}