package mybatisreading.domain.dto;

import lombok.Data;
import mybatisreading.domain.Subjects;

import java.util.List;
import java.util.Map;

/**
 * @Author Wang Junwei
 * @Date 2022/10/24 14:55
 * @Description
 */

@Data
public class StatDTO {

   private Map<Integer, Subjects> headers;

   private List<Map<String, Object>> contents;
}
