package mybatisreading.service.impl;

import mybatisreading.mapper.ClassificationMapper;
import mybatisreading.domain.Classification;
import mybatisreading.domain.dto.ClassificationDto;
import mybatisreading.domain.vo.ClassificationVo;
import mybatisreading.domain.query.ClassificationQuery;
import mybatisreading.service.ClassificationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Wang junwei
 * @since 2022-01-06
 */
@Service("classificationService")
public class ClassificationServiceImpl implements ClassificationService {

    @Resource
    private ClassificationMapper classificationMapper;

    @Override
    public List<Classification> getPageList(ClassificationQuery query) {
        return classificationMapper.getPageList(query);
    }

}
