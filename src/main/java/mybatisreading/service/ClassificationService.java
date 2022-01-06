package mybatisreading.service;

import mybatisreading.domain.Classification;
import mybatisreading.domain.dto.ClassificationDto;
import mybatisreading.domain.vo.ClassificationVo;
import mybatisreading.domain.query.ClassificationQuery;

import java.util.List;

/**
 * @author Wang junwei
 * @since 2022-01-06
 */
public interface ClassificationService {

    List<Classification> getPageList(ClassificationQuery query);


}
