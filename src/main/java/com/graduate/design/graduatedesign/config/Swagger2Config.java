package com.graduate.design.graduatedesign.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



/**
 * @author 荒城
 * @title: Swagger2Config
 * @projectName yeb
 * @description: TODO
 * @date 2021/12/315:10
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    /**
     * Swagger的配置类，用来配置扫描那包
     * @return
     */
    @Bean
    public Docket docket1(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("卢南华");
    }

    @Bean
    public Docket docket2(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("唐俊峰");
    }


    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("雷帮民")

                .select()
//                扫描那些包
                .apis(RequestHandlerSelectors.basePackage("com.graduate.design.graduatedesign.controller"))
//                扫描所有的路径
                .paths(PathSelectors.any())
                .build();

/*//               让swagger具有调试的功能
                .securityContexts(securityContexts())
                .securitySchemes(securitySchemes());*/
    }
    private ApiInfo apiInfo(){
        System.out.println("油状");
        return new ApiInfoBuilder()
                .title("设备巡检平台后台文档")
                .description("设备巡检平台后台文档")
                .contact(new Contact("荒城","http://localhost:8081/doc.html","1019922709@qq.com"))
                .version("1.0")
                .build();
    }

 /*   *//**
     * 设置请求头信息
     * @return
     *//*
    private List<ApiKey> securitySchemes(){
        ArrayList<ApiKey> resullt = new ArrayList<>();
        ApiKey apiKey = new ApiKey("Authorization", "Authorization", "Header");
        resullt.add(apiKey);
        return resullt;
    }
    private List<SecurityContext> securityContexts(){
//        设置需要登录认证的路径
        ArrayList<SecurityContext> result = new ArrayList<>();
        //hello下面的所有的路径都进行放行
        result.add(getContextBuPath("/hello/.*"));
        return result;
    }

    private SecurityContext getContextBuPath(String pathRegex) {
        return SecurityContext.builder()
        .securityReferences(defaultAuth())
        .forPaths(PathSelectors.regex(pathRegex))
                .build();
    }

    private List<SecurityReference> defaultAuth() {
        ArrayList<SecurityReference> result = new ArrayList<>();
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0]=authorizationScope;
        result.add(new SecurityReference("Authorization",authorizationScopes));
        return result;
    }*/
}
