package com.github.feign;

import com.github.service.WeixinService;
import org.springframework.cloud.openfeign.FeignClient;

@SuppressWarnings("all")
@FeignClient("github-weixin")
public interface WeixinFeign extends WeixinService {

}
