package com.github;

import com.spring4all.swagger.EnableSwagger2Doc;
import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

@SuppressWarnings("all")
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@EnableSwagger2Doc
public class AppGateWay {

  public static void main(String[]args){
    SpringApplication.run(AppGateWay.class, args);
  }

  @Component
  @Primary
  class DocumentationConfig implements SwaggerResourcesProvider{

    @Override
    public List<SwaggerResource> get() {
      List resources = new ArrayList<>();
      resources.add(swaggerResource("github-member", "/github-member/v2/api-docs", "2.0"));
      resources.add(swaggerResource("github-weixin", "/github-weixin/v2/api-docs", "2.0"));
      return resources;
    }
    private SwaggerResource swaggerResource(String name, String location, String version) {
      SwaggerResource swaggerResource = new SwaggerResource();
      swaggerResource.setName(name);
      swaggerResource.setLocation(location);
      swaggerResource.setSwaggerVersion(version);
      return swaggerResource;
    }
  }
}
