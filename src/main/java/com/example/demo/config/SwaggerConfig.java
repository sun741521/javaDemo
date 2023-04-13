package com.example.demo.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configurable
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket CreatApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select() //选择哪些路径和api会生成document
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.controller"))//controller路径
                //.apis(RequestHandlerSelectors.any())   //对所有api进行监控
                .paths(PathSelectors.any())  //对所有路径进行监控
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("springmvc+swagger整合")
                .description("test接口文档")
                .version("1.0.0")
                .termsOfServiceUrl("####")
                .license("license")
                .licenseUrl("licenseUrl")
                .build();
    }
}
