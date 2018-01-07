package com.lvtinger.consumer.identity.feign;

import common.com.lvtinger.consumer.common.ActionResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@FeignClient(name = "identity-generator", fallback = IdentityHystrixClientFallback.class)
public interface IdentityFeignClient {
    @RequestMapping(value = "/id/generate/{count}", method = RequestMethod.GET, consumes = "application/json")
    public ActionResult<ArrayList<Long>> generate(@PathVariable(value = "count") int count);
}
