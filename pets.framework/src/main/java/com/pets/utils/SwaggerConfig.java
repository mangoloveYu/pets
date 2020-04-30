package com.pets.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 芒果love
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.pets"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
    * 创建api的基本信息
    * */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("PETS.APIs")
                .description("")
                .termsOfServiceUrl("")
                .contact(new Contact("pets.framework","com.pets","1031810882@qq.com"))
                .version("1.0.0")
                .build();
    }
}