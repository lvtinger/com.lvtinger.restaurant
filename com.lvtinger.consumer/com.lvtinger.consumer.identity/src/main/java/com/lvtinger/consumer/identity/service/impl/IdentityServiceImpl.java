package com.lvtinger.consumer.identity.service.impl;

import com.lvtinger.consumer.identity.feign.IdentityFeignClient;
import com.lvtinger.consumer.identity.service.IdentityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IdentityServiceImpl implements IdentityService {

    private final static Logger LOGGER = LoggerFactory.getLogger(IdentityServiceImpl.class);

    @Autowired
    private IdentityFeignClient client;

    @Value("${identity.generate-count}")
    private int count = 20;

    private List<Long> identities;

    @Override
    public synchronized long generate() {
        int times = 0;
        while ((identities == null || identities.size() == 0) && times < 3) {
            LOGGER.debug("没有id，需要生成id");
            identities = client.generate(count).getContent();
            times++;
        }

        if (identities == null || identities.size() == 0) {
            return 0;
        }

        LOGGER.debug(identities.toString());

        long id = identities.get(0);
        identities.remove(0);
        return id;
    }
}
