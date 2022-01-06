package mybatisreading.controller;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Wong Jwei
 * @Date 2022/1/6
 * @Description
 * @Api → @Tag
 *
 * @ApiIgnore → @Parameter(hidden = true) or @Operation(hidden = true) or @Hidden
 *
 * @ApiImplicitParam → @Parameter
 *
 * @ApiImplicitParams → @Parameters
 *
 * @ApiModel → @Schema
 *
 * @ApiModelProperty(hidden = true) → @Schema(accessMode = READ_ONLY)
 *
 * @ApiModelProperty → @Schema
 *
 * @ApiOperation(value = "foo", notes = "bar") → @Operation(summary = "foo", description = "bar")
 *
 * @ApiParam → @Parameter
 *
 * @ApiResponse(code = 404, message = "foo") → @ApiResponse(responseCode = "404", description = "foo")
 */

@RestController
@RequestMapping("/test")
@Tag(name = "测试swagger v3")
public class V3TestController {

    @Schema(name = "查询")
    @GetMapping("/select")
    public String select() {
        return "";
    }


}
