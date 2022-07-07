package br.com.mt.store.user.api.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserListener {
    @KafkaListener(topics = "MTS_USER_CREATION", groupId = "MTS_USER")
    public void listenGroupFoo(String message) {
        log.info("receive msg" + message);
    }
}
