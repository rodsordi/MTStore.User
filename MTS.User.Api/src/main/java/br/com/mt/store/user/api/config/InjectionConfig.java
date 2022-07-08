package br.com.mt.store.user.api.config;

import br.com.mt.store.user.domain.usecase.user.creation.UserCreationOutputPort;
import br.com.mt.store.user.domain.usecase.user.creation.UserCreationUseCase;
import br.com.mt.store.user.domain.usecase.user.passwordreset.UserPasswordResetOutputPort;
import br.com.mt.store.user.domain.usecase.user.passwordreset.UserPasswordResetUseCase;
import br.com.mt.store.user.infra.dto.UserPasswordResetDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InjectionConfig {

    @Autowired
    @Bean
    public UserCreationUseCase userCreationUseCase(
            UserCreationOutputPort emailSendOutputPort) {
        return new UserCreationUseCase(
                emailSendOutputPort);
    }

    @Autowired
    @Bean
    public UserPasswordResetUseCase userPasswordResetUseCase(
            UserPasswordResetOutputPort userPasswordResetOutputPort) {
        return new UserPasswordResetUseCase(
                userPasswordResetOutputPort);
    }

}
