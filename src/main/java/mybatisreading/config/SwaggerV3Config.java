package mybatisreading.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Wong Jwei
 * @Date 2022/1/6
 * @Description
 */

@Configuration
public class SwaggerV3Config {

    /**
     * If you have only one Docket — remove it and instead add properties to your application.properties:
     *
     * springdoc.packagesToScan=package1, package2
     * springdoc.pathsToMatch=/v1, /api/balance/**
     * @return
     */
    // 接口分组显示
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("PUBLIC-API")
                .pathsToMatch("/api/**")
                .build();
    }

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Mybatis 源码阅读测试API")
                        .description("API详细描述")
                        .version("v0.0.1")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("SpringShop Wiki Documentation")
                        .url("https://springshop.wiki.github.org/docs"));
    }

}
