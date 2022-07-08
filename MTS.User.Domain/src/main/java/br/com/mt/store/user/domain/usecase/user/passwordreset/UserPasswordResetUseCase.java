package br.com.mt.store.user.domain.usecase.user.passwordreset;

import br.com.mt.store.user.domain.User;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class UserPasswordResetUseCase {
    private final UserPasswordResetOutputPort userPasswordResetOutputPort;

    public Optional<User> execute(User user) {
        return userPasswordResetOutputPort.execute(user);
    }

}
