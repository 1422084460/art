package com.system.art;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ArtApplicationTests {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    void FanoutProvider() {
        rabbitTemplate.convertAndSend("my_fanout","","msg ok");
        //rabbitTemplate.convertAndSend("hello","direct model");
    }
}
