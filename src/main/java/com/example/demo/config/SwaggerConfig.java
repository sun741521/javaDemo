package com.example.demo.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configurable
@EnableOpenApi
public class SwaggerConfig {

    @Bean
    public Docket CreatApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select() //选择哪些路径和api会生成document
                .apis(RequestHandlerSelectors.basePackage("com.example")) //对所有api进行监控
                .paths(PathSelectors.any())// 对根下所有路径进行监控
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .contact(new Contact("romeo", "", "xxx@qq.com"))
                .description("这是SWAGGER_3生成的接口文档")
                .version("v1.0")
                .build();
    }
}
