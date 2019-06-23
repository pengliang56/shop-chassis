package com.github.service;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SuppressWarnings("all")
@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2Doc
public class AppWeixin {

  public static void main(String[]args){
    SpringApplication.run(AppWeixin.class, args);
  }
}

