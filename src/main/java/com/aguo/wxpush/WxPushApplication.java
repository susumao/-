package com.aguo.wxpush;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@SpringBootApplication
public class WxPushApplication {

    private static final Logger logger = LoggerFactory.getLogger("WxPushApplication");

    public static void main(String[] args) {
        System.setProperty("jasypt.encryptor.password", "PEB123@321BEP");
        SpringApplication.run(WxPushApplication.class, args);
        logger.info("(♥◠‿◠)ﾉﾞ  微信推送启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }
}
