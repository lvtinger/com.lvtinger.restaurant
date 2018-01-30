package com.lvtinger.provider.identity.controller;

import com.lvtinger.provider.common.ActionResult;
import com.lvtinger.provider.identity.service.Generator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "/id")
public class IdentityController {

    private final static Logger LOGGER = LoggerFactory.getLogger(IdentityController.class);

    /**
     * 工作机器ID(0~31)
     */
    @Value("${generator.workId}")
    private long workerId;

    /**
     * 数据中心ID(0~31)
     */
    @Value("${generator.dataCenterId}")
    private long dataCenterId;

    @Resource
    private Generator generator;

    @GetMapping(value = "/generate/{count}")
    public ActionResult<ArrayList<Long>> generate(@PathVariable int count) {

        LOGGER.info("主键服务器：dataCenterId【" + dataCenterId + "】，workerId【" + workerId + "】。生成主键数量【" + count + "】;");

        if (count <= 0) {
            count = 20;
            LOGGER.info("生成数量小于等于0，修改成默认20个");
        }

        ArrayList<Long> ids = generator.generate(count);

        return new ActionResult<ArrayList<Long>>(ids);
    }
}