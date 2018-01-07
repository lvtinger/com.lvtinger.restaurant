package com.lvtinger.consumer.identity.feign;

import common.com.lvtinger.consumer.common.ActionResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;

@Component
public class IdentityHystrixClientFallback implements IdentityFeignClient {

    private final static Logger LOGGER = LoggerFactory.getLogger(IdentityHystrixClientFallback.class);

    @Override
    public ActionResult<ArrayList<Long>> generate(@PathVariable(value = "count") int count) {
        LOGGER.warn("服务【identity-generator.generate】不可用");
        return new ActionResult<ArrayList<Long>>(400, null);
    }
}
