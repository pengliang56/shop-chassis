package com.github.service;

import com.github.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

@SuppressWarnings("all")
@Api(tags = "wechar swagger interface")
public interface WeixinService {

  @ApiOperation("wechar application")
  @GetMapping("getApp")
  AppEntity getApp();
}
