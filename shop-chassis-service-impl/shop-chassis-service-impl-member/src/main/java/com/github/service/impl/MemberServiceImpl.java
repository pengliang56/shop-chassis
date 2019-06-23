package com.github.service.impl;

import com.github.entity.AppEntity;
import com.github.feign.WeixinFeign;
import com.github.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("all")
@RestController
public class MemberServiceImpl implements MemberService {

  @Autowired
  private WeixinFeign weixinFeign;

  @Override
  public AppEntity memberToWeixin() {
    return weixinFeign.getApp();
  }
}
