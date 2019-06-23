package com.github.service.impl;

import com.github.entity.AppEntity;
import com.github.service.WeixinService;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("all")
@RestController
public class WeixinServiceImpl implements WeixinService {

  public AppEntity getApp() {
    return new AppEntity("pen", "hello");
  }
}
