package com.github.service;

import com.github.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

@SuppressWarnings("all")
@Api(tags = "member swagger interface")
public interface MemberService {

  @ApiOperation("member invoke wechar microservice")
  @GetMapping("memberToWeixin")
  AppEntity memberToWeixin();
}
