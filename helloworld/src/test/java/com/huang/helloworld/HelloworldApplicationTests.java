package com.huang.helloworld;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloworldApplicationTests {

    @Autowired
    private KafkaSender kafkaSender;

    @Test
    public void test() {
        for (int i = 0; i < 5; i++) {
            kafkaSender.send("test-topic", "Hello World" + (i + 1));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
