package br.com.mt.store.user.domain.usecase.user.passwordreset;

import br.com.mt.store.user.domain.User;
import br.com.mt.store.user.domain.usecase.user.creation.UserCreationOutputPort;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class UserPasswordResetUseCase {
    private final UserCreationOutputPort userCreationOutputPort;

    public Optional<User> execute(User user) {
        return userCreationOutputPort.execute(user);
    }

}
