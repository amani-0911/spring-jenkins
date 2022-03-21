package com.example.demojenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoJenkinsApplicationTests {
    public static Logger logger= LoggerFactory.getLogger(DemoJenkinsApplicationTests.class);


    @Test
    void contextLoads() {
        logger.info("test case Executing....");
        Assertions.assertEquals(true,true);
    }

}
