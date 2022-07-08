package br.com.mt.store.user.infra.message;

import br.com.mt.store.commons.infra.kafka.Topic;
import br.com.mt.store.user.infra.dto.UserCreationDTO;
import br.com.mt.store.user.infra.dto.UserPasswordResetDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserMessage {

    private final KafkaTemplate<String, UserCreationDTO> kafkaUserCreation;

    private final KafkaTemplate<String, UserPasswordResetDTO> kafkaUserPasswordReset;

    public void sendCreation(UserCreationDTO userCreationDTO) {
        kafkaUserCreation.send(Topic.MTS_USER_CREATION, userCreationDTO);
    }

    public void sendPasswordReset(UserPasswordResetDTO userPasswordResetDTO) {
        kafkaUserPasswordReset.send(Topic.MTS_USER_PASSWORD_RESET, userPasswordResetDTO);
    }

}
