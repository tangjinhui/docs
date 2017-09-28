package com.controller.name;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import com.controller.ApplicationSwaggerConfig;
@Configuration
@EnableWebMvc
@ComponentScan
@Import(ApplicationSwaggerConfig.class)
public class SpringConfig extends WebMvcConfigurerAdapter {
	@Value("${factory.swagger.enable}")
	private boolean enable;
	@Value("${factory.swagger.package.scan}")
	private String packageScan;
	@Value("${factory.swagger.title}")
	private String title;
	@Value("${factory.swagger.description}")
	private String description;
	@Value("${factory.swagger.version}")
	private String version;

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("swagger-ui.html").addResourceLocations(
				"classpath:/META-INF/resources/");

		registry.addResourceHandler("/webjars/**").addResourceLocations(
				"classpath:/META-INF/resources/webjars/");
	}

	@Bean
	public Docket createRestApi() {
		ApiInfo apiInfo = new ApiInfoBuilder().title(title)// 大标题
				.description(description).version(version)// 版本
				.build();
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo)
				.enable(enable).useDefaultResponseMessages(false).select()
				.apis(RequestHandlerSelectors.basePackage(packageScan)).build();
	}
}
