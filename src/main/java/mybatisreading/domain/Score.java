package mybatisreading.domain;

import java.io.Serializable;

/**
 * (Score)实体类
 *
 * @author makejava
 * @since 2022-10-24 14:12:34
 */
public class Score implements Serializable {
    private static final long serialVersionUID = -83048553084945515L;
    
    private Integer id;
    
    private Integer userId;
    
    private Integer subjectId;
    
    private Object score;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Object getScore() {
        return score;
    }

    public void setScore(Object score) {
        this.score = score;
    }

}