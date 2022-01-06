package mybatisreading.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import mybatisreading.domain.Classification;
import mybatisreading.domain.query.ClassificationQuery;
import mybatisreading.service.ClassificationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author Wang junwei
 * @since 2022-01-06
 */
@RestController
@RequestMapping("/api/classification")
@Tag(name = "分类表")
public class ClassificationController {

    @Resource
    ClassificationService classificationService;

    @PostMapping("/getPageList")
    @Operation(summary = "分页获取分类表")
    public List<Classification> getPageList(@RequestBody ClassificationQuery query) {
        return classificationService.getPageList(query);
    }
}

